package com.hello.hewwbf.Database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.hewwbf.Model.ContactData;

public interface ContactUsDatabase extends JpaRepository<ContactData,Integer> {
    
}
