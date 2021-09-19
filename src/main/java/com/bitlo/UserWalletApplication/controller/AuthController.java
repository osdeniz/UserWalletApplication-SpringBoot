package com.bitlo.UserWalletApplication.controller;

import com.bitlo.UserWalletApplication.dto.UserDto;
import com.bitlo.UserWalletApplication.entity.UserEntity;
import com.bitlo.UserWalletApplication.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/user")
public class AuthController {

    @Autowired//normalde newlenerek çağırılan classs kendisi newlenerek gelir. Service katmanı ile haberleştiği için inject ettik.
    private IAuthService authService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)//objeleri döndürürüz
    public UserEntity register(@RequestBody UserDto userDto){
        return authService.create(userDto);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public UserEntity update(@RequestBody UserDto userDto) throws Exception {
        return authService.update(userDto);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        return authService.removeUser(id);
    }

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public List<UserEntity> getUsers(){
        return authService.getUsers();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public UserEntity getUserInfoById(@PathVariable Long id){
        return authService.getById(id);
    }


}
