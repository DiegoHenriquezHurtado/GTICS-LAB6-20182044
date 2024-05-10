package com.example.lab6_gtics.repository;

import com.example.lab6_gtics.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
