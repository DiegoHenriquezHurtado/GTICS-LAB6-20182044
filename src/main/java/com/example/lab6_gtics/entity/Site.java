package com.example.lab6_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SiteID" , nullable = false)
    private Integer idSite;

    @Column(name = "SiteName", length = 255)
    private String siteName;

    @ManyToOne
    @JoinColumn(name = "LocationID",nullable = false)
    private Location location;

    @Column(name = "InstallationDate")
    private Date installationDate;

    @Column(name = "Latitude", length = 45)
    private String latitude;

    @Column(name = "Longitude", length = 45)
    private String longitude;
}
