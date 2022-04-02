package br.edu.unoesc.desafiofullstackunoesc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.desafiofullstackunoesc.model.AuxilioEmergencial;

public interface AuxilioEmRepository extends JpaRepository<AuxilioEmergencial, Long> {

  }
