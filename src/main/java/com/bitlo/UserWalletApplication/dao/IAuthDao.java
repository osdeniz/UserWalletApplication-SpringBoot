package com.bitlo.UserWalletApplication.dao;

import com.bitlo.UserWalletApplication.entity.UserEntity;

import java.util.List;

public interface IAuthDao {//database işlemlerinin yapıldığı yer

    UserEntity register(UserEntity userEntity);

    UserEntity update(UserEntity userEntity);

    UserEntity getByUserId(long id);

    int removeById(Long id);

    List<UserEntity> getUsers();
}
