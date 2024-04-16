package com.example.service;

import com.example.common.Result;
import com.example.model.entity.Consumer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.request.ConsumerRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:38:18
 */
public interface ConsumerService extends IService<Consumer> {
    public boolean existUser(String username);
    public Result addUser(ConsumerRequest consumerRequest);
}
