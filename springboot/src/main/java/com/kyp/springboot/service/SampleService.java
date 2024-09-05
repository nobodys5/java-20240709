package com.kyp.springboot.service;

import org.springframework.http.ResponseEntity;

import com.kyp.springboot.dto.PostSample1RequestDto;

public interface SampleService {
    
    ResponseEntity<String> postSample1 (PostSample1RequestDto dto);
    ResponseEntity<String> deleteSample1(String sampleId);
    ResponseEntity<String> queryString();
    String getJwt(String name);
    String validateJwt(String jwt);
}
