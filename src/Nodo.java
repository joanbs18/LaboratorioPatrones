/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Francisco
 */
public abstract class Nodo {
    public static  final int ARCHIVO =1;
    public static  final int CARPETA =2;
    
    private String nombre="";
    private int tipoN;
    private int tamanio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoN() {
        return tipoN;
    }

    public void setTipoN(int tipoN) {
        this.tipoN = tipoN;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public abstract void mostrar();
    
}
