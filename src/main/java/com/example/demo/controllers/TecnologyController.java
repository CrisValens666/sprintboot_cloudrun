package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.TecnologyModel;
import com.example.demo.services.TecnologyService;

@RestController
@RequestMapping("/tecnology")
public class TecnologyController {

    @Autowired
    TecnologyService tecnologyService;

    @GetMapping()
    public ArrayList<TecnologyModel> obtenerUsuarios(){
        return tecnologyService.obtenerUsuarios();
    }

    @PostMapping()
    public TecnologyModel guardarUsuario(@RequestBody TecnologyModel usuario){
        return this.tecnologyService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<TecnologyModel> obtenerUsuarioPorId(@PathVariable("id") Integer id) {
        return this.tecnologyService.obtenerPorId(id);
    }

//    @GetMapping("/query")
//    public ArrayList<TecnologyModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
//        return this.tecnologyService.obtenerPorPrioridad(prioridad);
//    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = this.tecnologyService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó la tecnologia con id " + id;
        }else{
            return "No pudo eliminar la tecnologia con id" + id;
        }
    }
}
