package com.hello.hewwbf.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hello.hewwbf.Database.AdminDatabase;
import com.hello.hewwbf.Database.AlumniDatabase;
import com.hello.hewwbf.Database.CalendarDatabase;
import com.hello.hewwbf.Database.ContactUsDatabase;
import com.hello.hewwbf.Database.Database;
import com.hello.hewwbf.Database.FAQDatabase;
import com.hello.hewwbf.Database.InfoDatabase;
import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.AlumniData;
import com.hello.hewwbf.Model.CalendarData;
import com.hello.hewwbf.Model.ContactData;
import com.hello.hewwbf.Model.FAQData;
import com.hello.hewwbf.Model.InfoData;
import com.hello.hewwbf.Model.InfoScoreData;
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
    
    @Autowired
    private CalendarDatabase calBase;
    
    @Autowired
    private FAQDatabase faqBase;




    // !! ----------------------------------- User Form Start -------------------------------------- !!\\

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

    // !! ----------------------------------- User Form End -------------------------------------- !!\\









    // !! ----------------------------------- Admin Form Start -------------------------------------- !!\\

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

    @Override
    public boolean getAdminByNameSec(String adminName, String adminPassword) {
        boolean adminPresent = false;
        List<AdminData> list = this.adminBase.getAll();
        for (AdminData user : list) {
            if (user.getAdminName().equals(adminName)) {
                if (BCrypt.checkpw(adminPassword, user.getAdminPassword())) {
                    System.out.println("The password is a match!");
                    adminPresent = true;
                    // yesLogggedIn(user);
                    break;
                } else {
                    System.out.println("Wrong Admin password");
                }
            }
        }
        return adminPresent;
    }

    // !! ----------------------------------- Admin Form End -------------------------------------- !!\\









    // !! ----------------------------------- Contact Us Start -------------------------------------- !!\\

    @Override
    public void postContactData(ContactData contactData){
        this.contactBase.save(contactData);
    }

    // !! ----------------------------------- Contact Us End -------------------------------------- !!\\












    // !! ----------------------------------- Info Start -------------------------------------- !!\\

    @Override
    public void postInfoData(InfoData infoData){
        this.infoBase.save(infoData);
    }

    @Override
    public List<String> getCf(){
        List<InfoData> list = this.infoBase.getAll();
        List<String> CfNames = new ArrayList<>();
        for(InfoData user : list){
            CfNames.add(user.getCodeforcesusername());
        }
        System.out.println(CfNames);
        return CfNames;
    }

    @Override
    public List<InfoData> getGit(){
        return this.infoBase.getAll();
    }

    //////////////////////////////////////////////////////////////
    @Override
    public void putWebData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setWebscore(scoreData.getWebscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putAppData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setAppscore(scoreData.getAppscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putBcData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setBlockchainscore(scoreData.getBlockchainscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putMlData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setMlscore(scoreData.getMlscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putDesignData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                System.out.println("+++++++++++++++++++++++++++HELLO+++++++++++++++++++++++++++++++++++");
                info.setDesignscore(scoreData.getDesignscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                System.out.println(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putInfoSecData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setInfosecscore(scoreData.getInfosecscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    @Override
    public void putFossData(InfoScoreData scoreData){
        List<InfoData> list = this.infoBase.getAll();
        for (InfoData info : list) {
            if(info.getGithubownername().equals(scoreData.getGithubownername())){
                info.setFossscore(scoreData.getFossscore());
                InfoData scorePutter = info;
                this.infoBase.save(scorePutter);
                break;
            }
        }
    }
    ///////////////////////////////////////////////////////////////
    // !! ----------------------------------- Info End -------------------------------------- !!\\







    





    // !! ----------------------------------- Calendar Start -------------------------------------- !!\\

    @Override
    public List<CalendarData> getCalData(){
        return this.calBase.getAll();
    }

    @Override
    public void postCalData(CalendarData calendarData){
        this.calBase.save(calendarData);
    }

    @Override
    public void delCalData(String timer){
        List<CalendarData> list = this.calBase.getAll();
        CalendarData delCal = null;
        for(CalendarData cal : list){
            if(cal.getStart().equals(timer)){
                delCal = cal;
                System.out.println("deleted");
                break;
            }
        }
        this.calBase.delete(delCal);
    }
    // !! ----------------------------------- Calendar End -------------------------------------- !!\\

    // @Override
    // public void postAlumniForm(AlumniData alumniData){
    //     this.repository.save(alumniData);
    // }

    // @Override
    // public List<AlumniData> getAlumniForm(){
    //     return this.repository.getAll();
    // }




    // @Override
    // public String uploadImage(MultipartFile file) throws IOException {
    //     AlumniData imageData = repository.save(AlumniData.builder()
    //             .name(file.getOriginalFilename())
    //             .type(file.getContentType())
    //             .imageData(ImageUtils.compressImage(file.getBytes())).build());
    //     if (imageData != null) {
    //         return "file uploaded successfully : " + file.getOriginalFilename();
    //     }
    //     return null;
    // }
    // @Override
    // public byte[] downloadImage(String fileName) {
    //     Optional<AlumniData> dbImageData = repository.findByName(fileName);
    //     byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());
    //     return images;
    // }







//!! ----------------------------------- FAQ Start-------------------------------------- !!\\
    @Override
    public void postFaqData(FAQData faqData){
        this.faqBase.save(faqData);
    }

    @Override
    public List<FAQData> getAllFaqs(){
        return this.faqBase.getAll();
    }
//!! ----------------------------------- FAQ End-------------------------------------- !!\\
    
}
