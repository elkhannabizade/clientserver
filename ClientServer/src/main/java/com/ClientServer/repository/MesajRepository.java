package com.ClientServer.repository;

import com.ClientServer.entity.Mesaj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesajRepository extends JpaRepository<Mesaj, Integer> {
}
