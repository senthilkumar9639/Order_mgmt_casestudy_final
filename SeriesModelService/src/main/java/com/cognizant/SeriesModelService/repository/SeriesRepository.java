package com.cognizant.SeriesModelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.SeriesModelService.entity.Series;
import com.cognizant.SeriesModelService.entity.SeriesId;

@Repository
public interface SeriesRepository extends JpaRepository<Series, SeriesId> {

}
