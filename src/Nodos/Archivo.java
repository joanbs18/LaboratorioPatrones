/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

/**
 *
 * @author Francisco
 */
public abstract class Archivo extends Nodo {

    public Archivo(String nombre,int tamanio) {
        this.setTipoN(Nodo.ARCHIVO);
        this.setNombre(nombre);
        this.setTamanio(tamanio);
    }
    public abstract void abrir();//para heredar a los archivos demas archivos
    public abstract void cerrar();

    @Override
    public void mostrar() {
        // qui muestra el archivo pero no se si tiene que ser con retorno para la 
        // interfaz grafica.
    }
    
    
}
