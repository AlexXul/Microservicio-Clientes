package org.xulalex.demo.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xulalex.demo.model.entities.Cliente;
import org.xulalex.demo.service.ClienteService;

import java.util.List;
import java.util.Random;

@RestController
public class ClienteRestController {
    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"todoOk\" : true }";
    }

    @GetMapping("/clientes")
    public List<Cliente> getCliente(){
        List<Cliente> lista = clienteService.listarCliente();
        return lista;
    }
    @GetMapping("/cliente/{id}")
    public Cliente getCliente(@PathVariable String id) {
        Cliente cliente = clienteService.buscarCliente(id);
        return cliente;
    }
    @PostMapping("registrar/cliente")
    public Cliente addCliente(@RequestBody Cliente newCliente){
        String id = String.valueOf(new Random().nextInt());
        Cliente cliente = new Cliente(id,newCliente.nombre(), newCliente.apellido(), newCliente.direccion(), newCliente.correo(), newCliente.telefono());
        clienteService.registrarCliente(cliente);
        return cliente;
    }
    @DeleteMapping("/cliente/{id}")
    public String eliminarCliente(@PathVariable String id){
        clienteService.eliminarCliente(id);
        return "Cliente eliminado";
    }

}
