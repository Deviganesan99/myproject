package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import net.guides.springboot2.crud.model.PatientOrderView;
import net.guides.springboot2.crud.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Patient;
@CrossOrigin(origins="http://localhost:3000",maxAge=3600)
@RestController
@RequestMapping("/api/v1")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patient")
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }
@GetMapping("/patientOrder/{patientId}")
public List<PatientOrderView>getAllPatientOrder(@PathVariable(value="patientId")Long patientId) {
    return patientRepository.findPatientOrder(patientId);

}
    @GetMapping("/patient/{patient_id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable(value = "patient_id") Long patientId)
            throws ResourceNotFoundException {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));
        return ResponseEntity.ok().body(patient);
    }

    @PostMapping("/patient")
    public Patient createPatient( @RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @PutMapping("/patient/{patient_id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable(value = "patient_id") Long patientId,
                                                     @RequestBody Patient patientDetails) throws ResourceNotFoundException {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));

        patientDetails.setId(patient.getId());

        return ResponseEntity.ok(patientRepository.save(patientDetails));
    }

    @DeleteMapping("/patient/{patient_id}")
    public Map<String, Boolean> deletePatient(@PathVariable(value = "patient_id") Long patientId)
            throws ResourceNotFoundException {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));

        patientRepository.delete(patient);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}