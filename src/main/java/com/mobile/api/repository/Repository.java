package com.mobile.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobile.api.Model.Pessoa;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository <Pessoa, Integer> {

    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);

    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeOrderByIdade(String nome);
}
