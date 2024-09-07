package com.peliculas.peliculas;

public class Pelicula {

    //create the following private variables: id, titulo, año, director, género y sinopsis.
    private int id;
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String sinopsis;

    //create the following constructor: Pelicula(int id, String titulo, int año, String director, String genero, String sinopsis)
    public Pelicula(int id, String titulo, int año, String director, String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //create the following getters and setters for the private variables
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    
}
