package com.hello.hewwbf.Service;


import java.util.List;

import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.CalendarData;
import com.hello.hewwbf.Model.ContactData;
import com.hello.hewwbf.Model.InfoData;
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

    public void postContactData(ContactData contactData);

    public void postInfoData(InfoData infoData);

    // public String getDashName();

    public List<String> getCf();

    public List<String> getGit();

    public List<CalendarData> getCalData();

    public void postCalData(CalendarData calendarData);

    public void delCalData(String timer);
}
