package cn.hg.task.task.entity;

public class Task {

    private int taskId;
    private int type; //0 未完成 1已完成
    private String content; //内容
    private String time; //时间
    private int isNotify; //是否通知
    private int groupId;


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(int isNotify) {
        this.isNotify = isNotify;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
