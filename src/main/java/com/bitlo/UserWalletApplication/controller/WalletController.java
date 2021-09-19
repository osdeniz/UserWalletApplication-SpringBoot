package com.bitlo.UserWalletApplication.controller;

import com.bitlo.UserWalletApplication.dto.WalletDto;
import com.bitlo.UserWalletApplication.entity.WalletEntity;
import com.bitlo.UserWalletApplication.exception.CustomException;
import com.bitlo.UserWalletApplication.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/wallet")
public class WalletController {

    @Autowired
    private IWalletService walletService;

    @RequestMapping(value = "createOrUpdate", method = RequestMethod.POST)
    public WalletEntity create(@RequestParam("userId") Long userId, @RequestBody WalletDto walletDto) throws CustomException{
        return walletService.createOrUpdate(walletDto,userId);
    }
    @RequestMapping(value = "allList", method = RequestMethod.GET)
    public List<WalletEntity> getAllList(){
        return walletService.getAllList();
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delete(@RequestParam("userId")Long userId,@PathVariable Long id) throws CustomException{
        return walletService.deleteById(id,userId);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public WalletEntity getById(@PathVariable Long id){
        return walletService.getById(id);
    }
}
