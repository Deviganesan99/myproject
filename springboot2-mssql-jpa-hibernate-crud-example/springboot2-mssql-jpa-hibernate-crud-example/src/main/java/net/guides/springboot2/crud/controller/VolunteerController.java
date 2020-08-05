package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;



import net.guides.springboot2.crud.model.VolunteerOrderView;
import net.guides.springboot2.crud.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.guides.springboot2.crud.controller.OrderController;
import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Volunteer;

@RestController
@RequestMapping("/api/v1")
public class VolunteerController {
    @Autowired
    private VolunteerRepository volunteerRepository;

    @GetMapping("/volunteer")
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @GetMapping("/volunteerOrder/{volunteerId}")
    public List<VolunteerOrderView>getAllVolunteerOrder(@PathVariable(value="volunteerId")Long volunteerId) {
        return volunteerRepository.findVolunteerOrder(volunteerId);

    }
    @GetMapping("/volunteer/{volunteer_id}")
    public ResponseEntity<Volunteer> getVolunteerById(@PathVariable(value = "volunteer_id") Long volunteerId)
            throws ResourceNotFoundException {
        Volunteer volunteer = volunteerRepository.findById(volunteerId)
                .orElseThrow(() -> new ResourceNotFoundException("Volunteer not found for this id :: " + volunteerId));
        return ResponseEntity.ok().body(volunteer);
    }

    @PostMapping("/volunteer")
    public Volunteer createVolunteer( @RequestBody Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    @PutMapping("/volunteer/{volunteer_id}")
    public ResponseEntity<Volunteer> updateVolunteer(@PathVariable(value = "volunteer_id") Long volunteerId,
                                                   @RequestBody Volunteer volunteerDetails) throws ResourceNotFoundException {
        Volunteer volunteer = volunteerRepository.findById(volunteerId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + volunteerId));

        volunteerDetails.setId(volunteer.getId());

        return ResponseEntity.ok(volunteerRepository.save(volunteerDetails));
    }


    @DeleteMapping("/volunteer/{volunteer_id}")
    public Map<String, Boolean> deleteVolunteer(@PathVariable(value = "volunteer_id") Long volunteerId)
            throws ResourceNotFoundException {
        Volunteer volunteer = volunteerRepository.findById(volunteerId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + volunteerId));

        volunteerRepository.delete(volunteer);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}