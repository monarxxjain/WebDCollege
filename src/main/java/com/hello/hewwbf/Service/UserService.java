package com.hello.hewwbf.Service;


import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.AlumniData;
import com.hello.hewwbf.Model.CalendarData;
import com.hello.hewwbf.Model.ContactData;
import com.hello.hewwbf.Model.FAQData;
import com.hello.hewwbf.Model.InfoData;
import com.hello.hewwbf.Model.InfoScoreData;
import com.hello.hewwbf.Model.UserData;


public interface UserService {
    public void postData(UserData userData);

    public List<UserData> getall();

    public void putData(UserData userNewData);

    public UserData getUserByName(String userName);

    public boolean getUserByNameSec(String userName, String password);

    public void postAdminData(AdminData adminData);

    public List<AdminData> getallAdmins();

    public boolean getAdminByName(String adminName);

    public boolean getAdminByNameSec(String adminName, String adminPassword);

    public void postContactData(ContactData contactData);

    public void postInfoData(InfoData infoData);

    // public String getDashName();

    public List<String> getCf();

    public List<InfoData> getGit();

    public void putWebData(InfoScoreData scoreData);

    public void putAppData(InfoScoreData scoreData);

    public void putBcData(InfoScoreData scoreData);

    public void putMlData(InfoScoreData scoreData);

    public void putDesignData(InfoScoreData scoreData);

    public void putInfoSecData(InfoScoreData scoreData);

    public void putFossData(InfoScoreData scoreData);

    public List<CalendarData> getCalData();

    public void postCalData(CalendarData calendarData);

    public void delCalData(String timer);

    // public void postAlumniForm( AlumniData alumniData);

    // public List<AlumniData> getAlumniForm();

    // public String uploadImage(Multipa ;

    public void postFaqData(FAQData faqData);

    public List<FAQData> getAllFaqs();

}
