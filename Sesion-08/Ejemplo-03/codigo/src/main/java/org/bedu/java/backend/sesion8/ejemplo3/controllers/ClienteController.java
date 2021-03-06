package org.bedu.java.backend.sesion8.ejemplo3.controllers;

import org.bedu.java.backend.sesion8.ejemplo3.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId){
        return ResponseEntity.ok(Cliente.builder().id(1L).correoContacto("cliente@contacto.com").nombre("Nombre").build());
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.created(URI.create("1")).build();
    }
}
