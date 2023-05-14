package service;

import exception.PeliculaNoHabilitadaException;
import model.Pelicula;

public interface IGrillaDePEliculas {
    Pelicula getPelicula(String string) throws PeliculaNoHabilitadaException;
}
