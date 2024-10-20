package com.example.demo.serviceinterface;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    public User get(Long id);

    public List<User> getAllUsers();

    public void save(User user);

    public void delete(Long id);

    public void update(User user);

    public boolean existsUserById(Long id);

}
