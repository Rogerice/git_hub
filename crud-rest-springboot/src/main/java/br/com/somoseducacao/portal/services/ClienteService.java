package br.com.somoseducacao.portal.services;

import java.util.List;

import br.com.somoseducacao.portal.domain.Cliente;

public interface ClienteService {

	List<Cliente> listarTodos();

	Cliente listarPorId(String id);

	Cliente cadastrar(Cliente cliente);

	Cliente atualizar(Cliente cliente);

	void remover(String id);

}
