package com.springboot.part4.service;

import com.springboot.part4.model.User;

public interface UserService {
    User addUser(long Id, String name, String surname);
    User removeUser(long Id);
    User getUser(long Id);
}