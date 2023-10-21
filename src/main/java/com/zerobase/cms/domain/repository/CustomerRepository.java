package com.zerobase.cms.domain.repository;

import com.zerobase.cms.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
