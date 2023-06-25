package com.hello.hewwbf.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hello.hewwbf.Model.AdminData;
import com.hello.hewwbf.Model.AlumniData;
import com.hello.hewwbf.Model.CalendarData;
import com.hello.hewwbf.Model.ContactData;
import com.hello.hewwbf.Model.FAQData;
import com.hello.hewwbf.Model.InfoData;
import com.hello.hewwbf.Model.InfoScoreData;
import com.hello.hewwbf.Model.UserData;
import com.hello.hewwbf.Service.UserServiceImpl;

@Controller
@CrossOrigin
public class Mycontroller {

    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @GetMapping("/")
    public String akshatMap(Model model) {
        return "form1";
    }
    
    @GetMapping("/akshat1") 
    public String akshat1Map(Model model) {
        return "akshat1";
    }
    
    @GetMapping("/index")
    public String rootMap(Model model) {
        // model.addAttribute("username", "Monark Jain");
        return "index";
    }

    @GetMapping("/gallery") 
    public String newgalleryMap(Model model) {
        return "newGallery";
    }

    @GetMapping("/gallery/estrella") 
    public String estrellaMap(Model model) {
        return "newEstrella";
    }

    @GetMapping("/gallery/zephyr") 
    public String zephyrMap(Model model) {
        return "newZephyr";
    }

    @GetMapping("/gallery/afterdark") 
    public String afterdarkMap(Model model) {
        return "newAfterdark";
    }

    @GetMapping("/gallery/goonj") 
    public String goonjMap(Model model) {
        return "newGoonj";
    }

    @GetMapping("/gallery/utkrisht") 
    public String utkrishtMap(Model model) {
        return "newUtkrisht";
    }

    @GetMapping("/gallery/crotonia") 
    public String crotoniaMap(Model model) {
        return "newCrotonia";
    }

    @GetMapping("/aboutus") 
    public String aboutMap(Model model) {
        return "aboutus";
    }

    @GetMapping("/contactus") 
    public String contactMap(Model model) {
        return "contactus";
    }

    @GetMapping("/users")
    public String usersMap(Model model) {
        return "users";
    }

    @GetMapping("/form1")
    public String formMap(Model model) {
        return "form1";
    }




// ! <================================Start=========================================>
    // ** User Form **
    @ResponseBody
    @PostMapping("/post/form")
    public void postForm(@RequestBody UserData userData){
        this.userServiceImpl.postData(userData);
    }

    @ResponseBody
    @GetMapping("/get/users")
    public List<UserData> getData(){
        return this.userServiceImpl.getall();
    }
    

    @ResponseBody
    @PutMapping("/put/form")
    public void upData(@RequestBody UserData userNewData) {
        this.userServiceImpl.putData(userNewData);
    }

    @ResponseBody
    @GetMapping("/get/users/{userName}")
    public UserData getUser(@PathVariable String userName){
        return this.userServiceImpl.getUserByName(userName);
    }

    @ResponseBody
    @GetMapping("/get/user/{userName}/{password}")
    public boolean getUserByName(@PathVariable String userName,@PathVariable String password){
        System.out.println(userName + " " + password);
        return this.userServiceImpl.getUserByNameSec(userName,password);
    }
    // @ResponseBody
    // @GetMapping("/get/usersName")
    // public String getUsersNameDash(){
    //     return this.userServiceImpl.getDashName();
    // }
// ! <==============================End===========================================>













// ! <================================Start=========================================>

// ** Admin Form **

    @ResponseBody
    @PostMapping("/post/formadmin")
    public void postAdminForm(@RequestBody AdminData adminData) {
        this.userServiceImpl.postAdminData(adminData);
    }

    @ResponseBody
    @GetMapping("/get/admins")
    public List<AdminData> getAdmins() {
        return this.userServiceImpl.getallAdmins();
    }

    @ResponseBody
    @GetMapping("/get/admin/{adminName}")
    public boolean getAdmin(@PathVariable String adminName) {
        return this.userServiceImpl.getAdminByName(adminName);
    }

    @ResponseBody
    @GetMapping("/get/admin/{adminName}/{adminPassword}")
    public boolean getAdminByName(@PathVariable String adminName, @PathVariable String adminPassword) {
        System.out.println(adminName + " " + adminPassword);
        return this.userServiceImpl.getAdminByNameSec(adminName, adminPassword);
    }

// ! <==============================End===========================================>





    @ResponseBody
    @PostMapping("/post/faq")
    public void postFaq(@RequestBody FAQData faqData) {
        this.userServiceImpl.postFaqData(faqData);
    }

    @ResponseBody
    @GetMapping("/get/faqs")
    public List<FAQData> getFaqs() {
        return this.userServiceImpl.getAllFaqs();
    }










// ! <================================Start=========================================>

// ** Alumni Image **

    // @ResponseBody
    // @PostMapping("/post/alumni")
    // public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
    //     String uploadImage = userServiceImpl.uploadImage(file);
    //     return ResponseEntity.status(HttpStatus.OK)
    //             .body(uploadImage);
    // }

    // @ResponseBody
    // @GetMapping("/get/alumni/{fileName}")
    // public ResponseEntity<?> downloadImage(@PathVariable String fileName) {
    //     byte[] imageData = userServiceImpl.downloadImage(fileName);
    //     return ResponseEntity.status(HttpStatus.OK)
    //             .contentType(MediaType.valueOf("image/png"))
    //             .body(imageData);

    // }

// ! <================================End=========================================>






    // **ContactUsForm**
    @ResponseBody
    @PostMapping("/post/contact")
    public void postContactForm(@RequestBody ContactData contactData) {
        this.userServiceImpl.postContactData(contactData);
    }




    // **FullScreen**
    @ResponseBody
    @PostMapping("/post/info")
    public void postInfoForm(@RequestBody InfoData infoData) {
        this.userServiceImpl.postInfoData(infoData);
    }















// ! <================================DashBoard Start=========================================>

    // ** CodeForcesuserNameFetch **
    @ResponseBody
    @GetMapping("/get/cfUserName")
    public List<String> getCFUserNames() {
        return this.userServiceImpl.getCf();
    }


    // ** GithubUserNameFetch **
    @ResponseBody
    @GetMapping("/get/gitUserData")
    public List<InfoData> getGitUserData() {
        return this.userServiceImpl.getGit();
    }
///////////////////////////////////////////////////////////////////////////////
    // ** GithubScoreUpdate **
    @ResponseBody
    @PutMapping("/put/webscore")
    public void putWebScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putWebData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/appscore")
    public void putAppScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putAppData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/bcscore")
    public void putBlockChainScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putBcData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/mlscore")
    public void putMLScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putMlData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/designscore")
    public void putDesignScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putDesignData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/infosecscore")
    public void putInfoSecScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putInfoSecData(scoreData);
    }
    @ResponseBody
    @PutMapping("/put/fossscore")
    public void putFossScore(@RequestBody InfoScoreData scoreData) {
        this.userServiceImpl.putFossData(scoreData);
    }

///////////////////////////////////////////////////////////////////////////////

    // ** CalendarDataFetch **
    @ResponseBody
    @GetMapping("/get/calendar")
    public List<CalendarData> getCalendar() {
        return this.userServiceImpl.getCalData();
    }

    // ** CalendarDataPost **
    @ResponseBody
    @PostMapping("/post/calendar")
    public void postCalendar(@RequestBody CalendarData calendarData) {
        this.userServiceImpl.postCalData(calendarData);
    }

    // ** CalendarDataDelete **
    @ResponseBody
    @DeleteMapping("/del/calendar")
    public void delCalendar(@RequestBody String timer) {
        System.out.println(timer);
        this.userServiceImpl.delCalData(timer);
    }
    
// ! <================================DashBoard End=========================================>

    // @ResponseBody
    // @PostMapping("/post/alumni")
    // public void postAlumni(@RequestBody AlumniData alumniData){
    //     this.userServiceImpl.postAlumniForm(alumniData);
    // }
    // @ResponseBody
    // @GetMapping("/get/alumni")
    // public List<AlumniData> getAlumni(){
    //     return this.userServiceImpl.getAlumniForm();
    // }

}
