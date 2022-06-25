package com.example.WeddingPlanner.vendordata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VendorRepository extends JpaRepository<VendorData, Integer> {

    void deleteVendorDataById(Integer id);

    Optional<VendorData> findVendorDataById(Integer id);
}
