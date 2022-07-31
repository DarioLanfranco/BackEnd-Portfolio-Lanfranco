package com.lanfranco.portfolio.Interface;

import com.lanfranco.portfolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona(Persona persona); //objeto del tipo persona llamado persona
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id); //tipo de dato y nombre del campo a buscar
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
