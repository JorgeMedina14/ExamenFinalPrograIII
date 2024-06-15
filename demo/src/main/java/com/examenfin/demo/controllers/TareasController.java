package com.examenfin.demo.controllers;

import com.examenfin.demo.entities.Tareas;
import com.examenfin.demo.services.TareasService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/tareas")
public class TareasController {

    private TareasService tareasService;

    public TareasController(TareasService tareasService){
        this.tareasService = tareasService;
    }

    @GetMapping
    public List<Tareas> GetAll(){
        return tareasService.findAll();
    }

    @GetMapping(value="/{id}")
    public Tareas GetById(@PathVariable Long id){
        return tareasService.findById(id);
    }


    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Tareas tareas  ){
        tareasService.update(id, tareas);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        tareasService.delete(id);
    }



}
