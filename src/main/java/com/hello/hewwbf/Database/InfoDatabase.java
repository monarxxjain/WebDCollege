package com.hello.hewwbf.Database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.hewwbf.Model.InfoData;

public interface InfoDatabase extends JpaRepository<InfoData, Integer> {
    
}
