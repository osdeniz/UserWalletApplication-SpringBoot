package com.bitlo.UserWalletApplication.serviceimpl;

import com.bitlo.UserWalletApplication.dao.IAuthDao;
import com.bitlo.UserWalletApplication.dao.IWalletDao;
import com.bitlo.UserWalletApplication.dto.WalletDto;
import com.bitlo.UserWalletApplication.entity.UserEntity;
import com.bitlo.UserWalletApplication.entity.WalletEntity;
import com.bitlo.UserWalletApplication.exception.CustomException;
import com.bitlo.UserWalletApplication.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WalletServiceImpl implements IWalletService {

    @Autowired
    private IWalletDao walletDao;


    @Autowired
    private IAuthDao authDao;

    @Override
    public List<WalletEntity> getAllList() {
        List<WalletEntity> wallets = walletDao.getAllList();
        return wallets;
    }

    @Override
    public WalletEntity createOrUpdate(WalletDto walletDto, Long userId) throws CustomException {
        WalletEntity walletEntity =null;
        if(walletDto.getId() != null){
            walletEntity = walletDao.getById(walletDto.getId());
        }else{
            walletEntity = new WalletEntity();
            walletEntity.setCreateDate(new Date());
        }
        walletEntity.setName(walletDto.getName());
        walletEntity.setDescription(walletDto.getDescription());
        walletEntity.setAccountNumber(walletDto.getAccountNumber());
        walletEntity.setCurrenciesTypesBtc(walletDto.getCurrenciesTypeBtc());
        walletEntity.setCurrenciesTypesUsdt(walletDto.getCurrenciesTypeUsdt());
        walletEntity.setCurrenciesTypesTl(walletDto.getCurrenciesTypeTl());
        walletEntity.setCurrenciesTypesEth(walletDto.getCurrenciesTypeEth());

        if(userId !=null){
            UserEntity currentUser = authDao.getByUserId(userId);
            walletEntity.setUser(currentUser);
        }

        if(walletEntity.getId() != null){
            if(walletEntity.getUser() != null && walletEntity.getUser().getId() == userId){
                return walletDao.createOrUpdate(walletEntity);
            }

            throw new CustomException("Yetki Hatası.");

            }else{
                return walletDao.createOrUpdate(walletEntity);
        }

    }

    @Override
    public String deleteById(Long id, Long userId) throws CustomException {
        WalletEntity wallet = walletDao.getById(id);
        if(wallet.getUser() != null && wallet.getUser().getId() == userId){
            int result = walletDao.removeById(id);
            return result == 1 ? "işlem başarılı" : "işlem başarısız.";
        }
        return "işlem başarısız.";
    }

    @Override
    public WalletEntity getById(Long id) {

        WalletEntity wallet = walletDao.getById(id);
        return wallet;
    }


}
