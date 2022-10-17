/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos.TiposArchivos;

import Nodos.Archivo;
import Nodos.Carpeta;

/**
 *
 * @author Francisco
 */
public class Creador extends CreadorAbstract{

    public void Creador() {
    }
    

    @Override
    public Archivo Crear(int tipo, String nombre, int tamanio) {
      Archivo objeto;
      switch(tipo){
          case AUDIO:
              objeto=new Audio(nombre,tamanio);
              
          case VIDEO:
              objeto=new Video(nombre,tamanio);
          case WORD:
              objeto=new Word(nombre,tamanio);
          case TEXTO:
              objeto=new Texto(nombre,tamanio);
          case EXCEL:
              objeto=new Excel(nombre,tamanio);
          case POWERPOINT:
              objeto=new PowerPoint(nombre,tamanio);
          default:
              objeto=null;
      }
      return objeto;
    }
    
    
}
