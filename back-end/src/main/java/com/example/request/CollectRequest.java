package com.example.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CollectRequest {
    private Integer id;

    private Integer userId;

    private Byte type;

    private Integer songId;

    private Integer songListId;

    private LocalDateTime createTime;
}
