package com.springboot.part4.service;
import com.springboot.part4.DAO.FakeRepoInterface;
import com.springboot.part4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public FakeRepoInterface fakeRepo;
    @Override
    public User addUser(long Id, String name, String surname) {
        return fakeRepo.insertUser(Id,name,surname);
    }
    @Override
    @Cacheable("name")
    public User getUser(long Id) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return fakeRepo.findUserById(Id);
    }
    @Override
    public User removeUser(long Id) {
        return fakeRepo.deleteUser(Id);
    }
}