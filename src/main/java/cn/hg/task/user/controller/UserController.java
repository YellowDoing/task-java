package cn.hg.task.user.controller;

import cn.hg.task.common.BaseController;
import cn.hg.task.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController  extends BaseController {

    @Autowired
    UserMapper userMapper;






}
