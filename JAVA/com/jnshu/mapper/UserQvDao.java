package com.jnshu.mapper;


import com.jnshu.entity.UserQv;

import java.util.List;

public interface UserQvDao {

    UserQv findUserById(int id);

    List<UserQv> findAll();

    void updateId(UserQv userQv);

    void deleteId(int id);

    void addId(UserQv userQv);

}
