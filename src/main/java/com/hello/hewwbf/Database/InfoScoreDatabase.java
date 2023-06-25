package com.hello.hewwbf.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.InfoScoreData;
public interface InfoScoreDatabase extends JpaRepository<InfoScoreData, Integer>{
    @Query(value = "select * from infoscore", nativeQuery = true)
    public List<InfoScoreData> getAll();
}
