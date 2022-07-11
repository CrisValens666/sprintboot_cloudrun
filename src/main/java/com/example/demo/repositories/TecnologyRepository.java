package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.TecnologyModel;

@Repository
public interface TecnologyRepository extends CrudRepository<TecnologyModel, Integer>{

}
