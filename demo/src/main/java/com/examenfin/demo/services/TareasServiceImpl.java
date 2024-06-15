package com.examenfin.demo.services;

import com.examenfin.demo.entities.Tareas;
import com.examenfin.demo.repositories.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareasServiceImpl implements TareasService{
    @Autowired
    private TareasRepository repository;

    @Override
    public List<Tareas> findAll(){
        return repository.findAll();
    };
    @Override
    public Tareas findById(Long id){
        return repository.findById(id).orElse(null);
    };
    @Override
    public void create(Tareas tareas){
        repository.save(tareas);
    };
    @Override
    public void update(Long id, Tareas tareas){
        if (repository.existsById(id)){
            tareas.setId(id);
            repository.save(tareas);
        }

    };
    @Override
    public void delete(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    };
}
