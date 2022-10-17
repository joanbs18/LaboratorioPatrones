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
        super(nombre+".mp3", tamanio);
    }

    public String reproducir() {
        return "Se esta reproduciendo...";
    }
    public String deneter() {
        
        return "Se esta deteniendo...";
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
