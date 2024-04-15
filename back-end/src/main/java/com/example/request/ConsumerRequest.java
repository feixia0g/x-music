package com.example.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ConsumerRequest {
    private Integer id;

    private String username;

    private String password;

    private Byte sex;

    private String phoneNum;

    private String email;

    private LocalDateTime birth;

    private String introduction;

    private String location;

    private String avator;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
