package com.hello.hewwbf.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.hewwbf.Database.AdminDatabase;
import com.hello.hewwbf.Database.Database;
import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.UserData;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Database dataBase;

    @Autowired
    private AdminDatabase adminBase;

    @Override
    public void postData(UserData userData) {
        this.dataBase.save(userData);
    }


    @Override
    public List<UserData> getall() {
        return this.dataBase.getAll();
    }


    @Override
    public void putData(UserData userNewData) {
         for(UserData x:this.dataBase.getAll()){
            
            UserData user1 = this.dataBase.findByUserId(x.getUserId());
            if(user1!=null){
                if(user1.getUserName().equals(userNewData.getUserName()) && user1.getFav_animal().equals(userNewData.getFav_animal()) ){
                    user1.setPassword(userNewData.getPassword());
                    userNewData.setEmailId(user1.getEmailId());
                    userNewData.setUserId(user1.getUserId());
                    this.dataBase.save(userNewData);
                    break;
                }
            }
            
        }
        
    }

    @Override
    public UserData getUserByName(String userName){
        UserData c=null;
        for(UserData user:this.dataBase.getAll()){
            if(user.getUserName().equals(userName)){
                c=user;
                break;
            }
        }
        return c;
    }

    @Override
    public boolean getUserByNameSec(String userName,String password){
        boolean userPresent = false;
        List<UserData> list = this.dataBase.getAll();
        for (UserData user : list) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                userPresent = true;
                break;
            }
        }
        return userPresent;
    }









    @Override
    public void postAdminData(AdminData adminData){
        this.adminBase.save(adminData);
    }

    @Override
    public List<AdminData> getallAdmins(){
        return this.adminBase.getAll();
    }

    @Override
    public boolean getAdminByName(String adminName){
        boolean userPresent = false;
        List<AdminData> list = this.adminBase.getAll();
        for(AdminData admin:list){
            if(admin.getAdminName().equals(adminName)){
                userPresent = true;
                break;
            }
        }
        return userPresent;
    }
    
    
}
