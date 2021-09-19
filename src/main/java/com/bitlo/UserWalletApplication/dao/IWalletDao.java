package com.bitlo.UserWalletApplication.dao;

import com.bitlo.UserWalletApplication.entity.WalletEntity;

import java.util.List;

public interface IWalletDao {

    List<WalletEntity> getAllList();

    WalletEntity createOrUpdate(WalletEntity walletEntity);

    WalletEntity getById(Long id);

    int removeById(Long id);

}
