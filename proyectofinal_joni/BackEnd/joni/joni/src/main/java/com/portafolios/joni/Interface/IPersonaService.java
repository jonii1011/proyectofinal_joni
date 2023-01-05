/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolios.joni.Interface;

import com.portafolios.joni.Entity.Persona;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public interface IPersonaService {
      public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    
    public Persona findPersona(Long id);
}

