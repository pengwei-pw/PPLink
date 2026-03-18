package com.pw.pplink.services.impl;

import com.pw.pplink.entity.po.User;
import com.pw.pplink.mapper.UseMapper;
import com.pw.pplink.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServicesImpl implements LoginServices {
    @Autowired
    private UseMapper useMapper;
    @Override
    public User selectById(int id) {
        int index = 1;
        return useMapper.selectById(index);
    }
}
