package cn.hg.task.task.entity;

import lombok.Data;


@Data
public class Task {

    private int taskId;
    private int type; //0 未完成 1已完成
    private String content; //内容
    private String time; //时间
    private int isNotify; //是否通知
    private int groupId;

}
