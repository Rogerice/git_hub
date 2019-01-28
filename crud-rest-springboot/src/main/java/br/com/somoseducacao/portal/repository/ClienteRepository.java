package br.com.somoseducacao.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.somoseducacao.portal.domain.Cliente;


public interface ClienteRepository extends CrudRepository <Cliente, String> {

	

}
