package com.bitlo.UserWalletApplication.service;

import com.bitlo.UserWalletApplication.dto.WalletDto;
import com.bitlo.UserWalletApplication.entity.WalletEntity;
import com.bitlo.UserWalletApplication.exception.CustomException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IWalletService {

    List<WalletEntity> getAllList();

    WalletEntity createOrUpdate(WalletDto walletDto, Long userId) throws CustomException;

    String deleteById(Long id,Long userId) throws CustomException;

    WalletEntity getById(Long id);


}
