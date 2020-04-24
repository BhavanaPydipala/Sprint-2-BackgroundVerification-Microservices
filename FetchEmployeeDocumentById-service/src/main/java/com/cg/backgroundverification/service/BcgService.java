package com.cg.backgroundverification.service;

import java.util.Optional;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface BcgService {

	Optional<EmployeeDocumentDto> getById(int id);



}
