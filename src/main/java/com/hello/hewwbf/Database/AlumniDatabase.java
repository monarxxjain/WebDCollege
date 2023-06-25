package com.hello.hewwbf.Database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.AlumniData;

public interface AlumniDatabase extends JpaRepository<AlumniData,Long>{
    // Optional<AlumniData> findByName(String alumniName);
    // @Query(value = "select * from alumni", nativeQuery = true)
    // public List<AlumniData> getAll();
}
