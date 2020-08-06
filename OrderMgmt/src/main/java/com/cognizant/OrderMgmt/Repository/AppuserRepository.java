package com.cognizant.OrderMgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.OrderMgmt.entity.Appuser;
import com.cognizant.OrderMgmt.entity.AppuserId;

@Repository
public interface AppuserRepository extends JpaRepository<Appuser, AppuserId> {
	
	Appuser findByUserNameAndUserPwd(String userName, String pwd);

}
