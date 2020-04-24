package com.cg.backgroundverification.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dao.BcgDaoRepository;
import com.cg.backgroundverification.dto.EmployeeDocumentDto;

@Service
public class BcgServiceImpl implements BcgService{

	@Autowired
	BcgDaoRepository  bcgdao;
	
	@Override
	public Optional<EmployeeDocumentDto> getById(int id) {
		// TODO Auto-generated method stub
		return bcgdao.findById(id);
	}

}
