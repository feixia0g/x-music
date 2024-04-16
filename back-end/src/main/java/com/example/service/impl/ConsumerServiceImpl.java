package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.common.Result;
import com.example.model.entity.Consumer;
import com.example.mapper.ConsumerMapper;
import com.example.model.request.ConsumerRequest;
import com.example.service.ConsumerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static com.example.constant.Constants.SALT;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:38:18
 */
@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumerMapper, Consumer> implements ConsumerService {
    @Autowired
    private ConsumerMapper consumerMapper;

    /**
     * @param username
     * @return
     */
    @Override
    public boolean existUser(String username) {
        QueryWrapper<Consumer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return consumerMapper.selectCount(queryWrapper) > 0;
    }

    /**
     * 新增注册用户
     *
     * @param consumerRequest
     * @return Result
     */
    @Override
    public Result addUser(ConsumerRequest consumerRequest) {
        if (this.existUser(consumerRequest.getUsername())) {
            return Result.warning("该用户已被注册！");
        }
        Consumer consumer = new Consumer();
        BeanUtils.copyProperties(consumerRequest, consumer);

        //对密码进行md5加密
        String password = DigestUtils.md5DigestAsHex((SALT + consumerRequest.getPassword()).getBytes(StandardCharsets.UTF_8));
        consumer.setPassword(password);

        //若用户未填写PhoneNum或Email，设置为Null
        if (StringUtils.isBlank(consumer.getPhoneNum()))
            consumer.setPhoneNum(null);

        if (StringUtils.isBlank(consumer.getEmail()))
            consumer.setEmail(null);

        //初始化创建时间和更新时间
        consumer.setCreateTime(new Date());
        consumer.setUpdateTime(new Date());

        //设置图片路径？
        consumer.setAvator("img/avatorImages/user.jpg");

        //对数据库进行操作  新增consumer新用户
        try {
            if (consumerMapper.insert(consumer) > 0) {
                return Result.success("注册成功");
            } else {
                return Result.error("注册失败");
            }
        } catch (DataAccessException e) {
            return Result.fatal(e.getMessage());
        }
    }
}
