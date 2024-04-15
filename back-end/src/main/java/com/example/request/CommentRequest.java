package com.example.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentRequest {
    private Integer id;

    private Integer userId;

    private Integer songId;

    private Integer songListId;

    private String content;

    private LocalDateTime createTime;

    private Byte type;

    private Integer up;
}
