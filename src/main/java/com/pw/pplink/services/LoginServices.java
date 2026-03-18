package com.pw.pplink.services;
import com.pw.pplink.entity.po.User;

public interface LoginServices {
    public User selectById(int id);
}
