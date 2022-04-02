package br.edu.unoesc.desafiofullstackunoesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>
{

}
