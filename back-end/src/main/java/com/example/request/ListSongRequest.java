package com.example.request;

import lombok.Data;

@Data
public class ListSongRequest {
    private Integer id;

    private Integer songId;

    private Integer songListId;
}
