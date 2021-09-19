package com.bitlo.UserWalletApplication.service;

import com.bitlo.UserWalletApplication.entity.UserEntity;
import com.bitlo.UserWalletApplication.dto.UserDto;

import java.util.List;

public interface IAuthService {

    UserEntity create(UserDto userDto);

    UserEntity update(UserDto userDto) throws Exception;

    UserEntity getById(Long id);

    String removeUser(Long id);

    List<UserEntity> getUsers();


}
