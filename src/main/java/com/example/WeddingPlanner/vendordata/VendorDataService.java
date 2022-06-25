package com.example.WeddingPlanner.vendordata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorDataService {
    final private VendorRepository vendorRepository;

    @Autowired
    public VendorDataService(VendorRepository vendorRepository){
        this.vendorRepository = vendorRepository;
    }

    public VendorData addVendorData(VendorData vendorData){
        return vendorRepository.save(vendorData);
    }

    public List<VendorData> findAllVendorData(){
        return vendorRepository.findAll();
    }

    public VendorData updateVendorData(VendorData vendorData){
        return vendorRepository.save(vendorData);
    }

    public VendorData findVendorDataById(Integer id){
        return vendorRepository.findVendorDataById(id)
                .orElseThrow(() -> new VendorDataNotFoundException("Vendor with id: " + id + "has not been found"));
    }

    public void deleteVendorData(Integer id){
        vendorRepository.deleteVendorDataById(id);
    }
}
