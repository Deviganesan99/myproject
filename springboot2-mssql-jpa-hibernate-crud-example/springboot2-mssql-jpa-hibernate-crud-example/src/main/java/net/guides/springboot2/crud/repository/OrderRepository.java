package net.guides.springboot2.crud.repository;




import net.guides.springboot2.crud.model.VolunteerOrderView;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.guides.springboot2.crud.model.Order;

import java.util.ArrayList;


@Repository

public interface OrderRepository extends JpaRepository<Order, Long>{




}