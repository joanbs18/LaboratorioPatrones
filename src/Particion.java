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

    public Particion(int tamaño,Disco disco) {
        this.tamaño = tamaño;
        this.estado = true;
        disk= disco;
       
    }

    @Override
    public void sendPartition() {
        disk.añadirParticion(this);
    }

    public char getLetra() {
        return letra;
    }

    public Disco getDisk() {
        return disk;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean isEstado() {
        return estado;
    }

   

  

}
