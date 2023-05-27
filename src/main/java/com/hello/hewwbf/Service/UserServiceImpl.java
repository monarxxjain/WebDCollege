package com.hello.hewwbf.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.hewwbf.Database.Database;
import com.hello.hewwbf.Model.UserData;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Database dataBase;


    @Override
    public void postData(UserData userData) {
        this.dataBase.save(userData);
    }


    @Override
    public List<UserData> getall() {
        return this.dataBase.getAll();
    }

    
    
}
