package com.bitlo.UserWalletApplication.daoimpl;


import com.bitlo.UserWalletApplication.dao.IWalletDao;
import com.bitlo.UserWalletApplication.entity.WalletEntity;
import com.bitlo.UserWalletApplication.repository.IWalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WalletDaoImpl implements IWalletDao {

    @Autowired
    private IWalletRepository repository;

    @Override
    public List<WalletEntity> getAllList() {
        List<WalletEntity> list= repository.findAll();
        return list;
    }

    @Override
    public WalletEntity createOrUpdate(WalletEntity walletEntity) {

        return repository.save(walletEntity);
    }

    @Override
    public WalletEntity getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public int removeById(Long id) {
        repository.deleteById(id);
        return 1;
    }

}
