package com.destiny.mute.base.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "基础bean，存放共用字段")
public class BaseBean {
    private String createUser;
    private String createTime;
    private String upateUser;
    private String updateTime;

    @ApiModelProperty(value = "逻辑删除位，标识是否删除")
    private int deleteFlag;
}
