package cn.hg.task.task.controller;

import cn.hg.task.common.BaseController;
import cn.hg.task.common.BaseResp;
import cn.hg.task.task.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/group")
public class GroupController extends BaseController {


    @Autowired
    private GroupMapper groupMapper;


    /**
     * 新增分组
     */
    @PostMapping("/")
    public BaseResp addGroup(){

        return new BaseResp();
    }

    /**
     * 删除分组
     */
    @PostMapping("/")
    public BaseResp removeGroup(){

        return new BaseResp();
    }

    /**
     * 重命名分组
     */
    @PostMapping("/")
    public BaseResp renameGroup(){

        return new BaseResp();
    }


}
