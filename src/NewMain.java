/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author joans
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Disco c= Disco.getInstancia();
       c.crearDisco();
       Particion p1= new Particion(200,c);
       Particion p2= new Particion(200,c);
       p1.sendPartition();
       p2.sendPartition();
        System.out.println(c.getEspacioDisponible());
        System.out.println(p2);
    }
    
}
