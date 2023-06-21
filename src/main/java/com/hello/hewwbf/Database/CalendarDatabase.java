package com.hello.hewwbf.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.CalendarData;

public interface CalendarDatabase extends JpaRepository<CalendarData,Integer>{
    @Query(value = "select * from calendar", nativeQuery = true)
    public List<CalendarData> getAll();
}
