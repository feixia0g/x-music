package com.example.model.request;

import lombok.Data;

import java.util.Date;

@Data
public class SongRequest {
    private Integer id;

    private Integer singerId;

    private String name;

    private String introduction;

    /**
     * 发行时间
     */
    private Date createTime;

    private Date updateTime;

    private String pic;

    private String lyric;

    private String url;
}
