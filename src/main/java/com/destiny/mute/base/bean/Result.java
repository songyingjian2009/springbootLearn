package com.destiny.mute.base.bean;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private int length;
    private Object data;

    public Result(int code, String msg, int length, Object data) {
        this.code = code;
        this.msg = msg;
        this.length = length;
        this.data = data;
    }
}
