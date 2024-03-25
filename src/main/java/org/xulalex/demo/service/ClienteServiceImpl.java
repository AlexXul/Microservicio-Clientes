package org.xulalex.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xulalex.demo.model.entities.Cliente;
import org.xulalex.demo.model.repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public void registrarCliente(Cliente cliente) {
        clienteRepository.insert(cliente);

    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(String id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarCliente(String id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
