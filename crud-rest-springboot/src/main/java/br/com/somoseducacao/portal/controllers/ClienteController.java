package br.com.somoseducacao.portal.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somoseducacao.portal.domain.Cliente;
import br.com.somoseducacao.portal.services.ClienteService;
import br.com.somoseducacao.portal.util.ResponsesErros;

@RestController
@RequestMapping(path = "/CLIENTES_CADASTRO")
public class ClienteController {
	
	
  

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<ResponsesErros<List<Cliente>>> listarTodos() {
		return ResponseEntity.ok(new ResponsesErros<List<Cliente>>(this.clienteService.listarTodos()));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable @RequestBody String id) {
		return ResponseEntity.ok(this.clienteService.listarPorId(id));

	}

	@PostMapping
	public ResponseEntity<ResponsesErros<Cliente>> cadastrar(@Valid @RequestBody Cliente cliente,
			BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new ResponsesErros<Cliente>(erros));

		}
		return ResponseEntity.ok(new ResponsesErros<Cliente>(this.clienteService.cadastrar(cliente)));

	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<ResponsesErros<Cliente>> atualizar(@PathVariable(name = "id") String id,
			@RequestBody Cliente cliente, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new ResponsesErros<Cliente>(erros));
		}

		cliente.setId(id);
		return ResponseEntity.ok(new ResponsesErros<Cliente>(this.clienteService.cadastrar(cliente)));

	}

	@DeleteMapping(path = "/{id}")
		public ResponseEntity<ResponsesErros<Integer>> remover(@PathVariable(name = "id") String id) {
		this.clienteService.remover(id);
		return ResponseEntity.ok(new ResponsesErros<Integer>(1));

	}

}
