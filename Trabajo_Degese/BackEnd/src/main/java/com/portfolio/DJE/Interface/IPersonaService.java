package com.portfolio.DJE.Interface;

import com.portfolio.DJE.Entity.Persona;
import java.util.List;




public interface IPersonaService {
    
    
    //Trae una lista de personas
    public List<Persona> getPersona();
    
    //Guarda un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Borra un objeto pero lo busca por id
    public void deletePersona(Long id);
    
    //Busca una persona por id
    public Persona findPersona(Long id);
}
