/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos.TiposArchivos;

import Nodos.Archivo;

/**
 *
 * @author Francisco
 */
public class Audio extends Archivo{

    public Audio(String nombre, int tamanio) {
        super(nombre, tamanio);
    }

    public void reproducir() {
        System.out.println("Se esta reproduciendo...");
    }
    public void deneter() {
        System.out.println("Se esta deteniendo...");
    }
    
    @Override
    public void abrir() {
        System.out.println("Se esta abriendo...");
    }

    @Override
    public void cerrar() {
        System.out.println("Se esta cerrando...");
    }
    
}
