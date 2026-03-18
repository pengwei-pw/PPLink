package com.pw.pplink.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class User implements Serializable {
    // 用户id
    private Integer id;
    // 用户名
    private String name;
    // 用户电话
    private String phoneNumber;
    //用户状态
    private Integer status;

}
