package org.xulalex.demo.model.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public record Cliente(String id, String nombre, String apellido, String correo, String direccion, int telefono) {
}
