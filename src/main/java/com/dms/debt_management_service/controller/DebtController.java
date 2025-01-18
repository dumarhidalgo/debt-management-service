package com.dms.debt_management_service.controller;

import com.dms.debt_management_service.dto.ApiResponseDTO;
import com.dms.debt_management_service.utilities.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${controller.properties.base-path-v1}/debt")
public class DebtController {

    @GetMapping
    public ResponseEntity<ApiResponseDTO> getAllDebts() {
        return WebUtils.createResponse("List of debts obtained successfully", HttpStatus.OK, null);
    }
}
