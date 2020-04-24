package com.cg.backgroundverification.service;

import com.cg.backgroundverification.dto.LoginDto;

public interface LoginService {

	LoginDto authentication(int id, String pass);

}
