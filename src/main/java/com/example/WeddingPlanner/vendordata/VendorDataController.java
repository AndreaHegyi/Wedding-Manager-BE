package com.example.WeddingPlanner.vendordata;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VendorData")
public class VendorDataController {
    private final VendorDataService vendorDataService;

    public VendorDataController(VendorDataService vendorDataService){
        this.vendorDataService = vendorDataService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<VendorData>> getAllVendorData(){
        List<VendorData> vendorData = vendorDataService.findAllVendorData();
        return new ResponseEntity<>(vendorData, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<VendorData> getVendorDataById(@PathVariable("id") Integer id){
        VendorData vendorData = vendorDataService.findVendorDataById(id);
        return new ResponseEntity<>(vendorData, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<VendorData> addVendorData(){
        VendorData vendorData = new VendorData();
        VendorData newVendorData = vendorDataService.addVendorData(vendorData);
        return new ResponseEntity<>(newVendorData, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<VendorData> updateVendorData(@RequestBody VendorData vendorData){
        VendorData updateVendorData = vendorDataService.updateVendorData(vendorData);
        return new ResponseEntity<>(updateVendorData, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Integer id){
        vendorDataService.deleteVendorData(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
