package com.portfolio.gp.Interface;

import com.portfolio.gp.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    

    //traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);

    //Eliminar un objeto pero lo busco por Id
    public void deletePersona(Long id);

    //Bucar una persona por Id
    public Persona findPersona(Long id);

    public Persona getPerfil();

}
