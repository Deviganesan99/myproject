package net.guides.springboot2.crud.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.guides.springboot2.crud.model.Patient;
import net.guides.springboot2.crud.model.PatientOrderView;

import java.util.ArrayList;


@Repository

public interface PatientRepository extends JpaRepository<Patient, Long>{
    @Query(value="select O.order_id as orderId, O.numberoforder as numberOfOrder, O.volunteer_id as volunteerId, O.item_id as itemId, C.patient_name as patientName, C.patient_address as patientAddress\n" +
            "from ordertable O\n" +
            "INNER JOIN patient c\n" +
            "ON  O.patient_id = C.patient_id\n" +
            "where O.patient_id =:patient_id", nativeQuery = true)
 ArrayList<PatientOrderView>findPatientOrder(@Param("patient_id") long patientId);



}