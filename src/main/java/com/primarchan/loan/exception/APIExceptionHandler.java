package com.primarchan.loan.exception;

import com.primarchan.loan.dto.ResponseDTO;
import com.primarchan.loan.dto.ResultObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class APIExceptionHandler extends RuntimeException {

  @ExceptionHandler(BaseException.class)
  protected ResponseDTO<ResultObject> handleBaseException(BaseException e,
                                                          HttpServletRequest request, HttpServletResponse response) {
    log.error(e.getMessage(), e);
    return new ResponseDTO<>(e);
  }
}
