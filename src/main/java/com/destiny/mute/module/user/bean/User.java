package com.destiny.mute.module.user.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户信息")
@TableName(value = "user")
public class User {
    @TableId(type = IdType.AUTO)
    private String id;

    private String account;
    private String name;

    @ApiModelProperty(hidden = true)
    private String password;
}
