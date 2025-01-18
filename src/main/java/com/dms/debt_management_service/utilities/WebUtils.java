package com.dms.debt_management_service.utilities;

import com.dms.debt_management_service.dto.ApiResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class WebUtils {
    private WebUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static ResponseEntity<ApiResponseDTO> createResponse(String message, HttpStatus httpStatus, Object data) {
        ApiResponseDTO response = ApiResponseDTO.builder()
                .timestamp(String.valueOf(LocalDateTime.now()))
                .message(message)
                .data(data)
                .build();
        return new ResponseEntity<>(response, httpStatus);
    }
}
