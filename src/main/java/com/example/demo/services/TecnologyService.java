package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TecnologyModel;
import com.example.demo.repositories.TecnologyRepository;

@Service
public class TecnologyService {
	
    @Autowired
    TecnologyRepository tecnologyRepository;
    
    public ArrayList<TecnologyModel> obtenerUsuarios(){
        return (ArrayList<TecnologyModel>) tecnologyRepository.findAll();
    }

    public TecnologyModel guardarUsuario(TecnologyModel tecnology){
        return tecnologyRepository.save(tecnology);
    }

    public Optional<TecnologyModel> obtenerPorId(Integer id){
        return tecnologyRepository.findById(id);
    }


//    public ArrayList<TecnologyModel>  obtenerPorPrioridad(Integer prioridad) {
//        return tecnologyRepository.findByPrioridad(prioridad);
//    }

    public boolean eliminarUsuario(Integer id) {
        try{
        	tecnologyRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
