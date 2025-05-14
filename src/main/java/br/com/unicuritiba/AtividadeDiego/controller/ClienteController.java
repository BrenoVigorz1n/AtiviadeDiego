package br.com.unicuritiba.AtividadeDiego.controller;

import br.com.unicuritiba.AtividadeDiego.model.Cliente;
import br.com.unicuritiba.AtividadeDiego.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<Object> criarCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(service.salvarCliente(cliente));
    }
}
