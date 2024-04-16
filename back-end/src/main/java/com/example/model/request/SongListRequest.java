package com.example.model.request;

import lombok.Data;

@Data
public class SongListRequest {
    private Integer id;

    private String title;

    private String pic;

    private String introduction;

    private String style;
}
