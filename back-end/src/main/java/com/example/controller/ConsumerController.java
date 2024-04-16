package com.example.controller;

import com.example.common.Result;
import com.example.model.request.ConsumerRequest;
import com.example.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:38:18
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    /**
     * 新用户注册
     */
    @PostMapping("/user/add")
    public Result addUser(@RequestBody ConsumerRequest consumerRequest){
        return consumerService.addUser(consumerRequest);
    }

}
