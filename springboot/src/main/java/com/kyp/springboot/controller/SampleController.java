package com.kyp.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyp.springboot.dto.PostSample1RequestDto;
import com.kyp.springboot.service.SampleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
    
    private final SampleService sampleService;

    @PostMapping("")
    public ResponseEntity<String> postSample1 (
        @RequestBody @Valid PostSample1RequestDto requestBody
    ) {
        ResponseEntity<String> reponse = sampleService.postSample1(requestBody);
        return reponse;
    }

    @DeleteMapping("/{sampleId}")
    public ResponseEntity<String> deleteSample1 (
        @PathVariable("sampleId") String sampleId
    ) {

        ResponseEntity<String> respons = sampleService.deleteSample1(sampleId);
        
        return respons;
    }

    @GetMapping("")
    public ResponseEntity<String> queryMethod() {
        ResponseEntity<String> response = sampleService.queryString();
        return response;
    }

    @GetMapping("/jwt/{name}")
    public String getJwt(
        @PathVariable("name") String name
    ) {
        String response = sampleService.getJwt(name);
        return response;
    }

    @PostMapping("/jwt")
    public String validateJwt(
        @RequestBody String jwt
    ) { String response = sampleService.validateJwt(jwt);
        return response;
    }
}
