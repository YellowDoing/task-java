package cn.hg.task.task.service.impl;

import cn.hg.task.task.entity.Group;
import cn.hg.task.task.mapper.GroupMapper;
import cn.hg.task.task.service.IGroupService;
import cn.hg.task.user.entity.User;
import cn.hg.task.user.mapper.UserMapper;
import cn.hg.task.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class GroupServiceImpl  extends ServiceImpl<GroupMapper, Group> implements IGroupService {
}
