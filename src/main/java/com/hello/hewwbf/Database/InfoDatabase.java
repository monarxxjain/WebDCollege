package com.hello.hewwbf.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.InfoData;

public interface InfoDatabase extends JpaRepository<InfoData, Integer> {
    @Query(value = "select * from info", nativeQuery = true)
    public List<InfoData> getAll();
}
