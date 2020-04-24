package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface BcgDaoRepository extends JpaRepository<EmployeeDocumentDto,Integer> {

}
