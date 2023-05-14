package service.impl;

import exception.PeliculaNoHabilitadaException;
import model.IP;
import model.Pelicula;
import service.IGrillaDePEliculas;

public class GrillaDePeliculasProxy implements IGrillaDePEliculas {
   private IP n1;
   private GrillaDePeliculas grillaDePeliculas;

    public GrillaDePeliculasProxy(IP n1, GrillaDePeliculas grillaDePeliculas) {
        this.n1 = n1;
        this.grillaDePeliculas = grillaDePeliculas;
    }

    public boolean verificarPais(Pelicula pelicula){
        if((n1.getN1() < 50) && "Argentina".equalsIgnoreCase(pelicula.getPais())){
            return true;
        }
        return false;
    }

    public IP getN1() {
        return n1;
    }

    public void setN1(IP n1) {
        this.n1 = n1;
    }

    @Override
    public Pelicula getPelicula(String nombre) throws PeliculaNoHabilitadaException{
        Pelicula pelicula = grillaDePeliculas.getPelicula(nombre);
        if(!verificarPais(pelicula)){
            throw new PeliculaNoHabilitadaException("no puede verlo");
        }
        return null;
    }

}
