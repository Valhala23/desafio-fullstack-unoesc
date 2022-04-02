package br.edu.unoesc.desafiofullstackunoesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.desafiofullstackunoesc.model.UnidadeFederativa;


public interface UFRepository extends JpaRepository<UnidadeFederativa, Long> {

  }
