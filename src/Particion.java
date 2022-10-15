/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joans
 */
public class Particion implements Almacenamiento {
private char letra;
private Disco disk;
  private int tamaño;
    private boolean estado; //ACTIVO O INACTIVO

    public Particion(int tamaño) {
        this.tamaño = tamaño;
        this.estado = true;
    }

    @Override
    public int getAlmacenamiento() {
        return tamaño;
    }

}
