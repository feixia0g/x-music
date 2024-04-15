package com.example.controller;

import com.example.common.Result;
import com.example.request.AdminRequest;
import com.example.service.AdminService;
import com.example.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author feixia0g
 * @since 2024-04-14 08:35:55
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     *  验证是否登录成功
     */
    @PostMapping("/admin/login/status")
    public Result loginStatus(@RequestBody AdminRequest adminRequest, HttpSession httpSession){
        return adminService.verityPasswd(adminRequest,httpSession);
    }
}
