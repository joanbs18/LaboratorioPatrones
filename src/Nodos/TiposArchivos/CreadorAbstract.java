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
public abstract class CreadorAbstract {
    public static final int AUDIO=1;
    public static final int VIDEO=2;
    public static final int WORD=3;
    public static final int TEXTO=4;
    public static final int EXCEL=5;
    public static final int POWERPOINT=6;

    public abstract Archivo Crear(int tipo,String nomre,int tamanio) ;

}
