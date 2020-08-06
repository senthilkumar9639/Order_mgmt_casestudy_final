package com.cognizant.AccessoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.entity.AccessoryId;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, AccessoryId>{

	List<Accessory> findByIdCmpCodeAndIdSeriesCodeAndIdModelCode(String cmpCode,String seriesCode, String modelCode);
}
