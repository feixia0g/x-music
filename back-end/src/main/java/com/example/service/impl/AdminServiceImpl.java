package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.common.Result;
import com.example.entity.Admin;
import com.example.mapper.AdminMapper;
import com.example.request.AdminRequest;
import com.example.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:35:55
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Result verityPasswd(AdminRequest adminRequest, HttpSession session){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",adminRequest.getName());
        queryWrapper.eq("password",adminRequest.getPassword());
        if(adminMapper.selectCount(queryWrapper)>0){
            session.setAttribute("name",adminRequest.getName());
            return Result.success("登录成功！");
        }else {
            return Result.success("用户名或密码错误！");
        }
    }
}
