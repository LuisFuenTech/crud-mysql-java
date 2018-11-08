package Crud_mvc;

import controlador.Controlador;
import modelo.Consultas;
import modelo.Producto;
import vista.Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gilberto cuadro
 */
public class Crud_mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto();
        Consultas consultas = new Consultas();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(producto, consultas, vista);
        
        controlador.iniciar();
        vista.setVisible(true);
    }
    
}
