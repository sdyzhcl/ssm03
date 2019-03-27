package com.hwua.service;

import com.hwua.entity.User;

public interface UserService {

    public String selectUserByUsername(String user_username, String user_password);

    public  int inserUser(User user);
}
