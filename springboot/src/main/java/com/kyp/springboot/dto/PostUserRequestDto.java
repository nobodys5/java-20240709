package com.kyp.springboot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostUserRequestDto {
    
    @NotBlank()
    private String userId;
    @NotBlank()
    private String password;
    @NotBlank()
    private String name;
    @NotBlank()
    private String address;
    @NotBlank()
    private String telNumber;
}
