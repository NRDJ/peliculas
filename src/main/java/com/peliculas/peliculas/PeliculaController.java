package com.peliculas.peliculas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {
        private List<Pelicula> peliculas = new ArrayList<>();

        //constructor

        public PeliculaController() {
            peliculas.add(new Pelicula(1, "The Shawshank Redemption", 1994, 
            "Frank Darabont", "Drama", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        
            peliculas.add(new Pelicula(2, "The Godfather", 1972, 
            "Francis Ford Coppola", "Crime", 
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
            
            peliculas.add(new Pelicula(3, "The Dark Knight", 2008, 
            "Christopher Nolan", "Action", 
            "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
        
            peliculas.add(new Pelicula(4, "The Godfather: Part II", 1974,
            "Francis Ford Coppola", "Crime",
            "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate."));
            
            peliculas.add(new Pelicula(5, "Inception", 2010, 
            "Christopher Nolan", "Sci-Fi", 
            "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O."));
            
            peliculas.add(new Pelicula(6, "Pulp Fiction", 1994, 
            "Quentin Tarantino", "Crime", 
            "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
            
            peliculas.add(new Pelicula(7, "Fight Club", 1999, 
            "David Fincher", "Drama", 
            "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into something much, much more."));
            
            peliculas.add(new Pelicula(8, "Forrest Gump", 1994, 
            "Robert Zemeckis", "Drama", 
            "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart."));
        }
        
        //get all peliculas
        @GetMapping("/peliculas")
        //public list
        public List<Pelicula> getpeliculas() {
            return peliculas;
        }
    
        //get peliculas by id
        @GetMapping("/peliculas/{id}")
        //public Pelicula
        public Pelicula getPelicula(@PathVariable int id) {
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getId() == id) {
                    return pelicula;
                }
            }
            return null;
        }
}
