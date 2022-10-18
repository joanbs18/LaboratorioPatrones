package Disco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joans
 */
public class Particion implements Almacenamiento {
private String letra;
private static int contador;
private Disco disk;
  private int tamaño;
  private String array[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private boolean estado; //ACTIVO O INACTIVO

    public Particion(int tamaño,Disco disco) {
        this.tamaño = tamaño;
        this.estado = true;
        disk= disco;
        this.letra=array[contador];
        contador+=1;
       
    }

    @Override
    public void sendPartition() {
        disk.añadirParticion(this);
    }

    public String getLetra() {
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

    @Override
    public String toString() {
        return "Particion{" + "Nombre=" + letra + ", disk=" + disk.getNombre() + ", tama\u00f1o=" + tamaño + ", estado=" + estado + '}';
    }

   

  

}
