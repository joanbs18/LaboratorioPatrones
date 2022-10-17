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
    private ArrayList <Nodo> contenedor=new ArrayList();

    public Carpeta(String nombre,int tamanio) {
        this.setTipoN(Nodo.CARPETA);
        this.setNombre(nombre);
        this.setTamanio(tamanio);
    }
    //para agregar dentro de la carpeta ya sea otra carpeta 
    public void agregar(Nodo tipoNodo){
        contenedor.add(tipoNodo);
    }
    public void eliminar(Nodo tipoNodo){
        contenedor.remove(tipoNodo);
    }
    //para que busque si si hay una carpeto o archivo y lo devuelva
    public Nodo obtener(Nodo tipoNodo){
        Nodo nodo=null;
        for (int i = 0; i < contenedor.size(); i++) {
            if(contenedor.contains(tipoNodo)){
                nodo=contenedor.get(i);
            }else{
                nodo= nodo;
            }
        }
        return nodo;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
