
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joans
 */
public class Disco {

    private static Disco instancia;
    private String Nombre;
    private int tamañoTotal;
    private int espacioDisponible;
    private boolean estado=false;
    private ArrayList<Almacenamiento> particiones = new ArrayList();

    private Disco() {

    }

    public static Disco getInstancia() {
        if (instancia == null) {
            instancia = new Disco();
        }

        return instancia;
    }

    public void crearDisco() {
        if(!estado){
            estado=true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre del Disco");
        this.Nombre = leer.nextLine();
        System.out.println("Tamaño de MB del disco");
        this.tamañoTotal = leer.nextInt();
        this.espacioDisponible=this.tamañoTotal;
        }
    }

    public void añadirParticion(Particion p) {
        if (p.getTamaño() < this.espacioDisponible) {
            if (!particiones.contains(p)) {
                this.espacioDisponible -= p.getTamaño();
                particiones.add(p);
                System.out.println("Listo");
            } else {
                System.out.println("Existe");
            }
        }else{
            System.out.println("No tienes sufiente espacio");
        }
    }

    public int getEspacioDisponible() {
        return espacioDisponible;
    }

}
