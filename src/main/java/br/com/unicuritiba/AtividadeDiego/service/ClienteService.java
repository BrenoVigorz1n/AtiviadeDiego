package br.com.unicuritiba.AtividadeDiego.service;

import br.com.unicuritiba.AtividadeDiego.model.Cliente;
import br.com.unicuritiba.AtividadeDiego.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ResponseEntity<Cliente> salvarCliente(Cliente cliente){
        return ResponseEntity.ok(repository.save(cliente));
    }
}
