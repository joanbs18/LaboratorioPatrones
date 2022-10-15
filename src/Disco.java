
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joans
 */
public class Disco{
   private String Nombre;
    private int espacio;
    private ArrayList<Almacenamiento> particiones;

    public Disco(String Nombre, int espacio) {
        this.Nombre = Nombre;
        this.espacio = espacio;
    }

    public Disco() {
        this.Nombre = "Disk 1";
        this.espacio = 1000;
    }

    
    
    
   
    public int getAlmacenamiento()) {
        
    }
    
    public void añadirParticion(Almacenamiento p){
        if (p.getAlmacenamiento()<this.espacio){
    if (!particiones.contains(p)){
        this.espacio-=p.getAlmacenamiento();
    particiones.add(p);
    }else{
        System.out.println("Existe");
    }
        }
    }
}
