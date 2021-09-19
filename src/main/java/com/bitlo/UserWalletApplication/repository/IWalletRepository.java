package com.bitlo.UserWalletApplication.repository;

import com.bitlo.UserWalletApplication.entity.WalletEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IWalletRepository extends CrudRepository<WalletEntity, Long> {

    List<WalletEntity> findAll();
}
