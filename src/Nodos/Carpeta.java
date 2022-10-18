/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Carpeta extends Nodo {

    public static ArrayList<Nodo> contenedor = new ArrayList();

    public Carpeta(String nombre, int tamanio) {
        this.setTipoN(Nodo.CARPETA);
        this.setNombre(nombre);
        this.setTamanio(tamanio);
    }

    public static boolean verificar(String nombre) {
        for (int i = 0; i < contenedor.size(); i++) {
            if (contenedor.get(i).getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "El nombre de la carpeta ya existe. Por favor, nombre distinto a la carpeta.", "Se ha producido un error.", JOptionPane.ERROR_MESSAGE);
                nombre = JOptionPane.showInputDialog(null, "Escriba un nombre para su carpeta", "CARPETA", JOptionPane.QUESTION_MESSAGE);
                return true;
            }
        }
        return false;
    }

    //se crea carpeta por defecto
    public Carpeta() {
        this.setTipoN(Nodo.CARPETA);
        this.setNombre("Nueva Carpeta");
        this.setTamanio(0);
    }

    //para agregar dentro de la carpeta ya sea otra carpeta 
    public void agregar(Nodo tipoNodo) {
        contenedor.add(tipoNodo);
    }

    public void eliminar(Nodo tipoNodo) {
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
