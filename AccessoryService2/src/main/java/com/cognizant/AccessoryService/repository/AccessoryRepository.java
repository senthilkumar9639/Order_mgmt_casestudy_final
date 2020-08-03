package com.cognizant.AccessoryService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.AccessoryService.entity.Accessory;
import com.cognizant.AccessoryService.entity.AccessoryId;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, AccessoryId>{

}
