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
public class Word extends Archivo{

    public Word(String nombre, int tamanio) {
        super(nombre+"docx", tamanio);
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
