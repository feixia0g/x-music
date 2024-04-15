package com.example.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SongRequest {
    private Integer id;

    private Integer singerId;

    private String name;

    private String introduction;

    /**
     * 发行时间
     */
    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String pic;

    private String lyric;

    private String url;
}
