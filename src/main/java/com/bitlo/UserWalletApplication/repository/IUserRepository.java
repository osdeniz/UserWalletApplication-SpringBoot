package com.bitlo.UserWalletApplication.repository;

import com.bitlo.UserWalletApplication.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserRepository extends CrudRepository<UserEntity, Long> {//database sql işlemlerinin yapıldığı yer CrudRepositoryden extends eder
//hangi entity üzerinde çalışacaksa onu belirledik ve primary keyini eblirledik. Long.

    List<UserEntity> findAll();//crud repositoryden çağırıyoruz

    UserEntity findById(long id);
}
