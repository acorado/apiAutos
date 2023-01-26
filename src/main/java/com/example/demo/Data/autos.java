package com.example.demo.Data;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity // This tells Hibernate to make a table out of this class


@NamedNativeQuery(name="adm_cursos.findByMunicipio",
query="SELECT * FROM zonas where municipio = ? ",
resultClass = autos.class)


public class autos {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String marca;
    private String modelo;
    private String precio;
    private String imagen;
    private String anio;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }


    


  

    


    
}
