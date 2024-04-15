package com.example.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SingerRequest {
    private Integer id;

    private String name;

    private Byte sex;

    private String pic;

    private LocalDateTime birth;

    private String location;

    private String introduction;
}
