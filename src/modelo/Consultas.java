/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gilberto cuadro
 */
public class Consultas extends ConexionLocal{
    
    public boolean registrar(Producto producto){
        PreparedStatement ps;
        Connection con = getConnection();
        
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES(?,?,?,?)";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            //con.close();

        }
    }
    
    public boolean modificar(Producto producto){
        PreparedStatement ps;
        Connection con = getConnection();
        
        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getId());
            ps.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            //con.close();

        }
    }
    
    public boolean eliminar(Producto producto){
        PreparedStatement ps;
        Connection con = getConnection();
        
        String sql = "DELETE FROM producto WHERE id=?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getId());
            ps.executeUpdate();
            
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            //con.close();

        }
    }
    
    public boolean buscar(Producto producto){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        
        String sql = "SELECT * FROM producto WHERE codigo=?";
        
        try{
            
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                producto.setId(Integer.parseInt(rs.getString("id")));
                producto.setCodigo(rs.getString("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(Double.valueOf(rs.getString("precio")));
                producto.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                
                return true;
            }
            
            return false;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            //con.close();

        }
    }
    
}
