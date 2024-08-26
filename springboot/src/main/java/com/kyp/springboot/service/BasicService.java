package com.kyp.springboot.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface BasicService {

    ResponseEntity<String> getService();
    
} 
