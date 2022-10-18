/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos.Memento;


import Nodos.Nodo;

/**
 *
 * @author Francisco
 */
public class memento {
    private Nodo nodo;
 
    public memento(Nodo nodo){
        this.nodo= nodo; //se intancia el memento
    }
 
    public Nodo getEstadoSalvado()
    {
        return nodo; //se obtiene el memento creado
    }

    @Override
    public String toString() {
        return "memento{" + "carpeta=" + nodo + '}';
    }
    
}
