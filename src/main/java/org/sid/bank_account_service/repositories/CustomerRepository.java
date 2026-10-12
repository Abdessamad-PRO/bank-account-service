package org.sid.bank_account_service.repositories;

import org.sid.bank_account_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Service;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
