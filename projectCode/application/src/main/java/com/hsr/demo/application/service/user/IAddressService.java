package com.hsr.demo.application.service.user;

import com.hsr.demo.application.model.user.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();
    Address save(Address address);
    Address finById(Integer addressId);
}
