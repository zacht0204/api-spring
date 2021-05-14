package com.luismanrique.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luismanrique.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
