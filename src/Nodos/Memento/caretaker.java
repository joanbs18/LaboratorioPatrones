/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos.Memento;

import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class caretaker {
    // Se almacenan los estados anteriores de un archivo o carpeta para poder recuperar
    private ArrayList<memento> estadosSalvados = new ArrayList<>();

    public void addMemento(memento m) {
        estadosSalvados.add(m);
    }

    public memento getMemento(int posicion) {
        return estadosSalvados.get(posicion);
    }

    
}
