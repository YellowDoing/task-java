package cn.hg.task.task.controller;

import cn.hg.task.common.BaseController;
import cn.hg.task.common.BaseResp;
import cn.hg.task.task.entity.Task;
import cn.hg.task.task.mapper.TaskMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController("/task")
public class TaskController  extends BaseController {

    @Autowired
    private TaskMapper taskMapper;
    
    /**
     * 保存任务
     */
    @PostMapping(value="/")
    public BaseResp addTask(@RequestBody Task task) {
        taskMapper.insert(task);
        return new BaseResp();
    }

    /**
     * 完成
     */
    @PutMapping("/{id}")
    public BaseResp completeTask(@RequestBody Task task) {
        // taskMapper.update(task);
        return new BaseResp();
    }


    /**
     * 撤销
     */
    @PutMapping("/{id}")
    public BaseResp revokeTask(@RequestBody Task task) {
        //taskMapper.update(task);
        return new BaseResp();
    }


    /**
     * 删除任务
     */
    public BaseResp deleteTask(@RequestBody Task task) {
        // taskMapper.update(task);
        return new BaseResp();
    }

}
