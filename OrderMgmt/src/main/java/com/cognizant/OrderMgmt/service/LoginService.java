package com.cognizant.OrderMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.OrderMgmt.Repository.AppuserRepository;
import com.cognizant.OrderMgmt.entity.Appuser;
import com.cognizant.OrderMgmt.entity.ReponseModel;

@Service
public class LoginService {

	@Autowired
	private AppuserRepository userRepo;

	public ReponseModel getScreen(Appuser user) {
		ReponseModel res = new ReponseModel();
		Appuser userEntity = userRepo.findByUserNameAndUserPwd(user.getUserName(),user.getUserPwd());
		if(userEntity!=null) {
		if (userEntity.getGroupCode().equals("GROUP1"))
			res.setScreenNo("CreateOrder");
		else
			res.setScreenNo("SearchOrder");
		}
		return res;

	}
}
