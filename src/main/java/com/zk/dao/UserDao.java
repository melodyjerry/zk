package com.zk.dao;

import com.zk.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by mj on 2017/7/17.
 */

//@Mapper
public interface UserDao {
    List<User> query();
}
