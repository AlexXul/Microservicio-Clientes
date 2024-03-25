package org.xulalex.demo.service;

import org.xulalex.demo.model.entities.Cliente;

import java.util.List;

public interface ClienteService {
    public void registrarCliente(Cliente cliente);
    public void actualizarCliente(Cliente cliente);
    public void eliminarCliente(String id);
    public List<Cliente> listarCliente();
    public Cliente buscarCliente(String id);
}
