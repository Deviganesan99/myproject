package net.guides.springboot2.crud.repository;



import net.guides.springboot2.crud.model.VolunteerOrderView;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.guides.springboot2.crud.model.Volunteer;

import java.util.ArrayList;



@Repository

public interface VolunteerRepository extends JpaRepository<Volunteer, Long>{
    @Query(value="select O.order_id as orderId, O.numberoforder as numberOfOrder, O.patient_id as patientId, O.item_id as itemId, C.volunteer_name as volunteerName, C.volunteer_address as volunteerAddress\n" +
            "from ordertable O\n" +
            "INNER JOIN volunteer c\n" +
            "ON  O.volunteer_id = C.volunteer_id\n" +
            "where O.volunteer_id =:volunteer_id", nativeQuery = true)
    ArrayList<VolunteerOrderView> findVolunteerOrder(@Param("volunteer_id") long volunteerId);



}