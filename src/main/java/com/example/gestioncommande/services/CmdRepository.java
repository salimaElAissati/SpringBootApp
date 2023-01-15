package com.example.gestioncommande.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CmdRepository extends JpaRepository<CommandeEntity, Integer> {
}
