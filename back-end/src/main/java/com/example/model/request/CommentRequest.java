package com.example.model.request;

import lombok.Data;

import java.util.Date;

@Data
public class CommentRequest {
    private Integer id;

    private Integer userId;

    private Integer songId;

    private Integer songListId;

    private String content;

    private Date createTime;

    private Byte type;

    private Integer up;
}
