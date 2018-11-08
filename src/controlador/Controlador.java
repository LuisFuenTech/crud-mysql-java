/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Consultas;
import modelo.Producto;
import vista.Vista;

/**
 *
 * @author Luis Fuentes
 */
public class Controlador implements ActionListener{
    private final Producto producto;
    private final Consultas consultas;
    private final Vista vista;
    
    public Controlador(Producto producto, Consultas consultas, Vista vista){
        this.producto = producto;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.buscar_bt.addActionListener(this);
        this.vista.limpiar_bt.addActionListener(this);
        this.vista.eliminar_bt.addActionListener(this);
        this.vista.guardar_bt.addActionListener(this);
        this.vista.modificar_bt.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Productos");
        vista.setLocationRelativeTo(null);
        vista.id_tf.setVisible(false);
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == vista.guardar_bt){
            producto.setCodigo(vista.codigo_tf.getText());
            producto.setNombre(vista.nombre_tf.getText());
            producto.setPrecio(Double.parseDouble(vista.precio_tf.getText()));
            producto.setCantidad(Integer.valueOf(vista.cantidad_tf.getText()));
            
            if(consultas.registrar(producto)){
                JOptionPane.showMessageDialog(null, "Producto registrado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al registrar");
                limpiar();
            }
        }
        
        if(ae.getSource() == vista.modificar_bt){
            producto.setId(Integer.parseInt(vista.id_tf.getText()));
            
            producto.setCodigo(vista.codigo_tf.getText());
            producto.setNombre(vista.nombre_tf.getText());
            producto.setPrecio(Double.valueOf(vista.precio_tf.getText()));
            producto.setCantidad(Integer.valueOf(vista.cantidad_tf.getText()));
            
            if(consultas.modificar(producto)){
                JOptionPane.showMessageDialog(null, "Producto modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
            
        }
        
        if(ae.getSource() == vista.eliminar_bt){
            producto.setId(Integer.valueOf(vista.id_tf.getText()));
                      
            if(consultas.eliminar(producto)){
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }
        
        if(ae.getSource() == vista.buscar_bt){
            producto.setCodigo(vista.codigo_tf.getText());
                      
            if(consultas.buscar(producto)){
                vista.id_tf.setText(String.valueOf(producto.getId()));
                vista.codigo_tf.setText(producto.getCodigo());
                vista.nombre_tf.setText(producto.getNombre());
                vista.precio_tf.setText(String.valueOf(producto.getPrecio()));
                vista.cantidad_tf.setText(String.valueOf(producto.getCantidad()));
            }else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
                limpiar();
            }
        }
        
        if(ae.getSource() == vista.limpiar_bt){
            limpiar();
        }
    }
    
    public void limpiar(){
        vista.codigo_tf.setText(null);
        vista.nombre_tf.setText(null);
        vista.precio_tf.setText(null);
        vista.cantidad_tf.setText(null);
        
    }
}
