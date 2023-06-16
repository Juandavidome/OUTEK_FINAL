/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.RolVO;
import ModeloVO.UsuarioVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.ConexionBd;
import util.Crud;


/**
 *
 * @author APRENDIZ
 */
public class UsuarioDAO extends ConexionBd implements Crud{
    //Declarar variables y/o objetos
    ConexionBd conec = new ConexionBd();
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    
    private String usuCedula="", usuNombre="", usuApellido="", usuCorreo="", usuDireccion="", usuTelefono="", usuPassword="", usuEstado="", usuRolId="";

    public UsuarioDAO() {
    }
    
    

    public UsuarioDAO(UsuarioVO usuVO){
        super();
        try {
            
            // Conectarse a la base de datos
            conexion = this.obtenerConexion();
            // Trae los datos del VO al DAO
            usuCedula = usuVO.getUsuCedula();
            usuNombre = usuVO.getUsuNombre();
            usuApellido = usuVO.getUsuApellido();
            usuTelefono = usuVO.getUsuTelefono();
            usuCorreo = usuVO.getUsuCorreo();
            usuDireccion = usuVO.getUsuDireccion();
            usuPassword = usuVO.getUsuPassword();
            usuEstado = usuVO.getUsuEstado();
            usuRolId = usuVO.getUsuRolId();
            
        } catch (Exception e) {
          Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            
        }
        
    }


    @Override
    public boolean agregarRegistro() {
        try {
            sql="INSERT INTO tblusuario (UsuCedula, UsuNombre, UsuApellido, UsuTelefono, UsuCorreo, UsuDireccion, usuPassword, usuRolId)values(?, ?, ?, ?, ?, ?, ?, ?);";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,usuCedula);
            puente.setString(2, usuNombre);
            puente.setString(3, usuApellido);
            puente.setString(4, usuTelefono);
            puente.setString(5, usuCorreo);
            puente.setString(6, usuDireccion);            
            puente.setString(7, usuPassword);
            puente.setString(8, usuRolId);
            puente.executeUpdate();
            operacion = true;
            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

            }
           
        }
        return operacion;
    }

   
    @Override
    public boolean actualizarRegistro() {
         try {
            sql="UPDATE tblUsuario SET UsuNombre = ?, UsuApellido = ?,UsuTelefono = ?,UsuCorreo = ?,UsuDireccion = ?,UsuPassword = ?,UsuRolId = ? WHERE UsuCedula = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuNombre);
            puente.setString(2, usuApellido);
            puente.setString(3, usuTelefono);
            puente.setString(4, usuCorreo);
            puente.setString(5, usuDireccion);            
            puente.setString(6, usuPassword);
            puente.setString(7, usuRolId);
            puente.setString(8, usuCedula);
            puente.executeUpdate();
            operacion = true;
            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

            }
           
        }
        return operacion;
    }
  public UsuarioVO consultarPorCedula(String cedula){
        UsuarioVO usuVO = null;
        
        try {
            conexion = this.obtenerConexion();
            sql= "select * from tblusuario where UsuCedula = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,cedula);
            mensajero=puente.executeQuery();
            while(mensajero.next())
            {
             usuVO = new UsuarioVO(cedula, mensajero.getString(2),mensajero.getString(3), mensajero.getString(5), 
                        mensajero.getString(6), mensajero.getString(4), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
            }       

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return usuVO;
    }
    
    public ArrayList<RolVO> listar(String cedula){
        
        ArrayList<RolVO> listaroles = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT UsuRolId, UsuCedula FROM tblusuario where UsuCedula=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1,cedula);
            mensajero = puente.executeQuery();
            while(mensajero.next())
            {
             RolVO rolVO= new RolVO(mensajero.getString(1), mensajero.getString(2));
            listaroles.add(rolVO);
           }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return listaroles;
    }
    public boolean eliminarRegistro() 
    {    
         try 
         {
             UsuarioVO usuVO= new UsuarioVO();
            conexion = this.obtenerConexion();
            sql = "UPDATE tblUsuario SET UsuEstado = 'Inactivo' WHERE UsuCedula = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuCedula);
            puente.executeUpdate();
         }
        catch (Exception e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }
    public boolean reactivarRegistro() 
    {    
         try 
         {
             UsuarioVO usuVO= new UsuarioVO();
            conexion = this.obtenerConexion();
            sql = "UPDATE tblUsuario SET UsuEstado = 'Activo' WHERE UsuCedula = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuCedula);
            puente.executeUpdate();
         }
        catch (Exception e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }
    public UsuarioVO consultarCedula(String Usuario)
    {
      UsuarioVO usuVO =null;
      try
      {
        conexion = this.obtenerConexion();
        sql = "select UsuCedula, UsuNombre, UsuPassword from outek.tblusuario where UsuCedula=?;";
        puente = conexion.prepareStatement(sql);
        puente.setString(1, Usuario);
        mensajero = puente.executeQuery();
        while(mensajero.next())
        {
            usuVO= new UsuarioVO(mensajero.getString(1), mensajero.getString(2),mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),mensajero.getString(8), mensajero.getString(9));
        }
      }
       catch (Exception e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return usuVO;
    }
    
    public boolean actualizarRegistroCliente() {
         try {
            sql="UPDATE tblUsuario SET UsuNombre = ?, UsuApellido = ?,UsuTelefono = ?,UsuCorreo = ?,UsuDireccion = ? WHERE UsuCedula = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuNombre);
            puente.setString(2, usuApellido);
            puente.setString(3, usuTelefono);
            puente.setString(4, usuCorreo);
            puente.setString(5, usuDireccion);
            puente.setString(6, usuCedula);
            puente.executeUpdate();
            operacion = true;
            
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);

            }
           
        }
        return operacion;
    }
     public ArrayList<UsuarioVO> listar(){
        
        ArrayList<UsuarioVO> lista = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT u.*, r.RolDenominacion FROM tblUsuario u INNER JOIN tblRol r ON u.UsuRolId = r.RolId;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while(mensajero.next())
            {
             UsuarioVO usuVO= new UsuarioVO(mensajero.getString(1), mensajero.getString(2),mensajero.getString(3), mensajero.getString(4), 
                        mensajero.getString(5), mensajero.getString(6), mensajero.getString(7),mensajero.getString(8), mensajero.getString(9));
            lista.add(usuVO);
           }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return lista;
    }
     public UsuarioVO buscar(String cedula)
    {
      UsuarioVO c =new UsuarioVO();
      sql="select*from tblusuario where UsuCedula="+cedula;
      try
      {
        conexion = this.obtenerConexion();
        puente = conexion.prepareStatement(sql);
        mensajero = puente.executeQuery();
        while(mensajero.next())
        {
            c.setUsuCedula(mensajero.getString(1));
            c.setUsuNombre(mensajero.getString(2));
            c.setUsuDireccion(mensajero.getString(3));
            c.setUsuEstado(mensajero.getString(4));

        }
      }
      catch(Exception e)
      {
          
      }
      return c;
    }
}

    


