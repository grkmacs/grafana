package com.example.grafana.service;

import com.example.grafana.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();

    void save(UserEntity userEntity) throws Exception;

    void delete(String username) throws Exception;
}
