package com.hello.hewwbf.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;;

@Entity
@Table(name = "alumni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlumniData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] alumniPic;
    
    
    // private String alumniPic;
    private String alumniName;
    private String alumniEmail;
    private String alumniGradYear;
    private String alumniPos;
    private String alumniAch;


}
