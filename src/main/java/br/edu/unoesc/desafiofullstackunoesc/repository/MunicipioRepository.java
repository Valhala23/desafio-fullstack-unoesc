package br.edu.unoesc.desafiofullstackunoesc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.desafiofullstackunoesc.model.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

  }
