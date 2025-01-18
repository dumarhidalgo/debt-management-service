package com.dms.debt_management_service.dto;

import com.dms.debt_management_service.utilities.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponseDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.TIMESTAMP_FORMAT)
    private String timestamp;
    private String message;
    private Object data;
    private String error;
    private String path;
}
