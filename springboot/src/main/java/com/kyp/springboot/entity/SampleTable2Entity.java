package com.kyp.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sample_table_2")
public class SampleTable2Entity {
    private Integer sampleAi;
    private Boolean sampleColumn;
}
