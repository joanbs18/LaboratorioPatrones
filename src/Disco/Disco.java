package Disco;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author joans
 */
public class Disco {

    int tParticiones;
    private static Disco instancia;
    private String Nombre;
    private int tamañoTotal;
    private int espacioDisponible = 0;
    private boolean estado = false;
    private ArrayList<Almacenamiento> particiones = new ArrayList();

    private Disco() {

    }

    public static boolean verificar(){
        return instancia == null;
    }
    
    public static Disco getInstancia() {
        if (instancia == null) {
            instancia = new Disco();
        }

        return instancia;
    }

    public void crearDisco() {
        if (!estado) {
            estado = true;
            Scanner leer = new Scanner(System.in);
            this.Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del disco", "DISCO", JOptionPane.QUESTION_MESSAGE);
            String tamannio = JOptionPane.showInputDialog(null, "Ingrese el tamaño del disco", "DISCO", JOptionPane.QUESTION_MESSAGE);
            this.tamañoTotal = Integer.parseInt(tamannio);
            this.espacioDisponible = this.tamañoTotal;
        }
    }

    public void añadirParticion(Particion p) {
        if (p.getTamaño() < this.espacioDisponible && tParticiones <= 23) {
            if (!particiones.contains(p)) {
                this.espacioDisponible -= p.getTamaño();
                particiones.add(p);
            } else {
                JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE);
                p = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes sufiente espacio", "ERROR", JOptionPane.ERROR_MESSAGE);
            p = null;
        }
    }

    public int getEspacioDisponible() {
        return espacioDisponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTamañoTotal() {
        return tamañoTotal;
    }

    public boolean isEstado() {
        return estado;
    }

}
