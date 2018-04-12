package com.maolintu.matisplusjpa.repostory;

import com.maolintu.matisplusjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserRepository extends
        Serializable,
        JpaRepository<User, Integer>,
        JpaSpecificationExecutor<User> {
}
