package com.hello.hewwbf.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.FAQData;

public interface FAQDatabase extends JpaRepository<FAQData, Integer> {
    @Query(value = "select * from faq", nativeQuery = true)
    public List<FAQData> getAll();
}
