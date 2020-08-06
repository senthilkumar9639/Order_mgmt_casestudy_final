package com.cognizant.OrderMgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.OrderMgmt.entity.Orderheader;
import com.cognizant.OrderMgmt.entity.OrderheaderId;

@Repository
public interface OrderheaderRepository extends JpaRepository<Orderheader, OrderheaderId> {

}
