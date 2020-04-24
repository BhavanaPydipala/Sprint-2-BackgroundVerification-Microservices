package com.cg.backgroundverification.service;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;

public interface BcgService {

	EmployeeDocumentDto getByName(String name);

}
