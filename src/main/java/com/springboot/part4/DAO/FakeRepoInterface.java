package com.springboot.part4.DAO;

import com.springboot.part4.model.User;

public interface FakeRepoInterface {
    User insertUser(long Id, String name, String surname);
    User findUserById(long Id);
    User deleteUser(long Id);
}