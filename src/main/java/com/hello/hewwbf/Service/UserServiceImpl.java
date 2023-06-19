package com.hello.hewwbf.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hello.hewwbf.Database.AdminDatabase;
import com.hello.hewwbf.Database.AlumniDatabase;
import com.hello.hewwbf.Database.ContactUsDatabase;
import com.hello.hewwbf.Database.Database;
import com.hello.hewwbf.Database.InfoDatabase;
import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.AlumniData;
import com.hello.hewwbf.Model.ContactData;
import com.hello.hewwbf.Model.InfoData;
import com.hello.hewwbf.Model.UserData;
import com.hello.hewwbf.util.ImageUtils;

import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Database dataBase;

    @Autowired
    private AdminDatabase adminBase;


    @Autowired
    private AlumniDatabase repository;

    @Autowired
    private ContactUsDatabase contactBase;
    
    @Autowired
    private InfoDatabase infoBase;

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
            if (user.getUserName().equals(userName)) {
                if (BCrypt.checkpw(password, user.getPassword())) {
                    System.out.println("The password is a match!");
                    userPresent = true;
                    // yesLogggedIn(user);
                    break;
                }
                else{
                    System.out.println("Wrong password");
                }
            }
        }
        return userPresent;
    }

    // public void yesLogggedIn(UserData user){
    //     user.setIsLoggedInWhileSup(1);
    //     this.dataBase.save(user);
    // }

    // @Override
    // public String getDashName(){
    //     String dashName = "";
    //     List<UserData> list = this.dataBase.getAll();
    //     for (UserData user : list) {
    //         if (user.getIsLoggedInWhileSup()==1) {
    //             System.out.println("HelloThere");
    //             dashName = user.getUserName();
    //             System.out.println(dashName);
    //             break;    
    //         }
    //     }
    //     return dashName;
    // }








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







    // <-----------------------  ContactUsForm -------------------->

    @Override
    public void postContactData(ContactData contactData){
        this.contactBase.save(contactData);
    }









    @Override
    public void postInfoData(InfoData infoData){
        this.infoBase.save(infoData);
    }














    public String uploadImage(MultipartFile file) throws IOException {
        AlumniData imageData = repository.save(AlumniData.builder()
                .name(file.getOriginalFilename())
                .imageData(ImageUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName) {
        Optional<AlumniData> dbImageData = repository.findAlumniByName(fileName);
        byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
    
    
}
