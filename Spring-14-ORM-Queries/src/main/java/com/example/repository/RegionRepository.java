package com.example.repository;

import com.example.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    // display all regions in canada
   List<Region> findByCountry(String country);

   // display all regions in canada without duplicates
    List<Region> findDistinctByCountry(String country);

    // display all regions in canada with country included "united"
    List<Region> findByCountryContaining(String country);

    // display all regions in canada with country included "united" in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //display top2 region in canada
    List<Region> findTop2ByCountry(String country);


}
