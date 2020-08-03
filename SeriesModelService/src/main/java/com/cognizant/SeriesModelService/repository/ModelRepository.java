package com.cognizant.SeriesModelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.SeriesModelService.entity.Model;
import com.cognizant.SeriesModelService.entity.ModelId;

@Repository
public interface ModelRepository extends JpaRepository<Model, ModelId>{

}
