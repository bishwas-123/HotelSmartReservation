package com.hsr.demo.application.repository.user;

import com.hsr.demo.application.model.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
