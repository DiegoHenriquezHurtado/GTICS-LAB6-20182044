package com.example.lab6_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketID" , nullable = false)
    private Integer idTicket;

    @ManyToOne
    @JoinColumn(name = "SiteID")
    private Site site;

    @ManyToOne
    @JoinColumn(name = "TechnicianID")
    private Technician technician;

    @Column(name = "Status", length = 50)
    private String status;

    @Column(name = "OpenedDate")
    private Timestamp openedDate;

    @Column(name = "ClosedDate")
    private Timestamp closedDate;
}
