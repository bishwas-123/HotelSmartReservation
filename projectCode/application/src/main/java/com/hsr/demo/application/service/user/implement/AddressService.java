package com.hsr.demo.application.service.user.implement;


import com.hsr.demo.application.model.user.Address;
import com.hsr.demo.application.repository.user.IAddressRepository;
import com.hsr.demo.application.service.user.IAddressService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {

    private IAddressRepository addressRepository;
    public AddressService(IAddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll(Sort.by("state"));
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address finById(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }
}
