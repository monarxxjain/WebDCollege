package com.hello.hewwbf.Database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.hewwbf.Model.AlumniData;

public interface AlumniDatabase extends JpaRepository<AlumniData,Integer>{
    Optional<AlumniData> findAlumniByName(String alumniName);
}
