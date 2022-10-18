/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class Carpeta extends Nodo {
    public ArrayList <Nodo> contenedor=new ArrayList();

    public Carpeta(String nombre,int tamanio) {
        this.setTipoN(Nodo.CARPETA);
        this.setNombre(nombre);
        this.setTamanio(tamanio);
    }
    //se crea carpeta por defecto
    public Carpeta() {
        this.setTipoN(Nodo.CARPETA);
        this.setNombre("Nueva Carpeta");
        this.setTamanio(0);
    }
    
    //para agregar dentro de la carpeta ya sea otra carpeta 
    public void agregar(Nodo tipoNodo){
        contenedor.add(tipoNodo);
    }
    public void eliminar(Nodo tipoNodo){
        contenedor.remove(tipoNodo);
    }
    public Nodo getNodo(int posicion) {
        return contenedor.get(posicion);
    }
    //para que busque si hay una carpeto o archivo y lo devuelva
    public ArrayList<Nodo> getNodos() {
        return contenedor;
    }

    @Override
    public void mostrar() {
        System.out.println("Carpeta: [" + this.getNombre() + "]");
        for (Nodo nodo : contenedor) {
            nodo.mostrar();
        }

    }
    
    
}
