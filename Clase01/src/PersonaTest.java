import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    ArrayList<Persona> lista;
    Persona p1;
   public void agrega(Persona p){
        if (p.cumple()){
            lista.add(p);
        }
    }
    @BeforeEach
    void doBefore(){
          lista = new ArrayList<>();

    }
    @Test
    void test1(){
        agrega(  new Persona("Juan", "Lope",18));
        agrega(  new Persona("pedro", "ramire",20));
        agrega(  new Persona("analaura", "gonzale",22));
        agrega(  new Persona("luzandra", "rodrigue",32));
        agrega(  new Persona("julian", "fagunde",33));
        assertEquals(4, lista.size());
    }
    @Test
    void test2(){
        agrega(  new Persona("Juan", "Lope",18));
        agrega(  new Persona("pedro", "ramire",17));
        agrega(  new Persona("ana", "gonzale",22));
        agrega(  new Persona("luz", "rodrigue",12));
        agrega(  new Persona("julian", "fagunde",33));

        assertEquals(1, lista.size());
   }
}