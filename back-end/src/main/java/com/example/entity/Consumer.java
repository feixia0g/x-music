package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:38:18
 */
@Getter
@Setter
public class Consumer implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
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
