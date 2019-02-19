package cn.hg.task.common;

import lombok.Data;

@Data
public class BaseResp<T> {
    private int code;
    private String massage;
    private T data;

    public BaseResp() {
        code = 10000;
        massage = "操作成功";
    }
}