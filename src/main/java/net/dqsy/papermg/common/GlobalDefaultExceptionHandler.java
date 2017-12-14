package net.dqsy.papermg.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String hello(HttpServletRequest request, Exception e){

        e.printStackTrace();
        return "/error";

    }
}
