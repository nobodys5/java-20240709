package com.kyp.springboot.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kyp.springboot.dto.PostSample1RequestDto;
import com.kyp.springboot.entity.SampleTable1Entity;
import com.kyp.springboot.repository.SampleTable1Repository;
import com.kyp.springboot.service.SampleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class SampleServiceImplement implements SampleService{

    private final SampleTable1Repository sampleTable1Repository;

    @Override
    public ResponseEntity<String> postSample1(PostSample1RequestDto dto) {


        String sampeId = dto.getSampleId();
        Integer sampleColumn = dto.getSampleColumn();

        // SELECT (SQL : SELECT)
        // 1. repository를 이용하여 조회 (findAll, findById)
        // SampleTable1Entity existEntity = sampleTable1Repository.findById(sampeId).get();
        // 2. repository를 이용하여 조회 (existsById)
        boolean isExisted = sampleTable1Repository.existsById(sampeId);
        if (isExisted) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이미 존재하는 기본키입니다.");

        // CREATE (SQL : INSERT)
        // 1. Entity 클래스의 인스턴스 생성

        SampleTable1Entity entity = new SampleTable1Entity(sampeId, sampleColumn);

        // 2. 생성한 인스턴스를 repository를 이용하여 저장
        // save() : 저장
        // - 만약에 Primary Key가 동일한 레코드가 존재하지 않으면 레코드생성
        // - 동일한 레코드가 존재하면 수정
        sampleTable1Repository.save(entity);

        return ResponseEntity.status(HttpStatus.CREATED).body("성공");
    }
    
}
