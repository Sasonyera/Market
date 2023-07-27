package com.platzi.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name="clientes")
public class Cliente {
private String nombre;

private String apellidos;
private Integer celular;
private String direccion;
@Column(name="correo_electronico")
private String correoElectronico;
}
