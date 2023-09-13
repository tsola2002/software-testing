package com.tsola2002.softwareTesting.customer;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {

  @Query(
    value = "SELECT id, name, phone_number from customer where phone_number = :phone_number",
    nativeQuery = true
  )
  Optional<Customer> selectCustomerByPhoneNumber(
      @Param("phone_number")
      String phoneNumber
  );

}
