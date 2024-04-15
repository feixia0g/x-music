package com.example.request;

import lombok.Data;

@Data
public class RankRequest {
    private Long id;

    private Long songListId;

    private Long consumerId;

    private Integer score;
}
