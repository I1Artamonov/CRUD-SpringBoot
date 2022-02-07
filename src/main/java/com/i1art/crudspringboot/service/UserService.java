package com.i1art.crudspringboot.service;


import com.i1art.crudspringboot.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUserById(int id);
    public List<User> getAllUsers();
}
