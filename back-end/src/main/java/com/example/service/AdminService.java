package com.example.service;

import com.example.common.Result;
import com.example.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.request.AdminRequest;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:35:55
 */
public interface AdminService extends IService<Admin> {
    Result verityPasswd(AdminRequest adminRequest, HttpSession session);
}
