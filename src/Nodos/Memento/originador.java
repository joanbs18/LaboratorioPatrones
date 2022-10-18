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
public class originador {
    
    private Nodo nodo;

    public Nodo getNodo() {
        return nodo;
    }
    
    public void set(Nodo nodo){
        this.nodo=nodo;
    }
    public memento salvandoParaMemento(){ 
        //Crea un objeto Memento con una copia del original y lo pasa por parametro
        return new memento(this.nodo); 
    }
     public void recuperandoDesdeMemento(memento m) 
    {
        this.nodo = m.getEstadoSalvado();
        System.out.println("Volvemos al anterior:\n "+this.nodo);
       
    }
}
