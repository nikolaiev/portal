package com.school.controllers.advices;

import com.school.dto.error.HttpRequestError;
import com.school.dto.error.HttpResponseDTO;
import com.school.dto.error.SourceErrorDTO;
import com.school.exceptions.BaseCustomRuntimeException;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionControllerAdvice {
    //TODO implement
    /*private static @Log4j
    Logger logger;*/

    @ExceptionHandler(BaseCustomRuntimeException.class)
    public ResponseEntity<Object> exception(BaseCustomRuntimeException exception) {

        //logger.error(exception);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        HttpResponseDTO responseObj = new HttpResponseDTO();

        List<HttpRequestError> errors = new ArrayList<HttpRequestError>() {
            {
                add(HttpRequestError.builder().source(new SourceErrorDTO(exception.getPointer()))
                        .detail(exception.getDetail()).status(exception.getHttpStatus().toString())
                        .title(exception.getTitle()).build());
            }
        };

        responseObj.setErrorsList(errors);
        return new ResponseEntity<>(responseObj, headers, exception.getHttpStatus());
    }
}
