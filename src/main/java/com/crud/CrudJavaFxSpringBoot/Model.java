package com.crud.CrudJavaFxSpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity

@Data
public class Model {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre, telefono;

    public String toString(){
        return "ID: "+id+"  -  Nombre: "+nombre+"  -  Telefono: "+telefono;
    }

}
