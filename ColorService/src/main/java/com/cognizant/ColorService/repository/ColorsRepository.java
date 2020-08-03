package com.cognizant.ColorService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ColorService.entity.Colors;
import com.cognizant.ColorService.entity.ColorsId;

@Repository
public interface ColorsRepository extends JpaRepository<Colors, ColorsId> {

}
