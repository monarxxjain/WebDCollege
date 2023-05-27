package com.hello.hewwbf.Service;


import java.util.List;

import com.hello.hewwbf.Model.UserData;


public interface UserService {
    public void postData(UserData userData);

    public List<UserData> getall();

}
