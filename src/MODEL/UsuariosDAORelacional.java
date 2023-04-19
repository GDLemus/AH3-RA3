
package MODEL;

import DAO.UsuariosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class UsuariosDAORelacional implements UsuariosDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<UsuariosGT> listar() {
    
        String sql = "select * from usuarios ";
        LinkedList<UsuariosGT> listar = new LinkedList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                listar.add(new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
            }
            return listar;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    

    @Override
    public void crear(UsuariosGT usuarios) {
      
        String sql = "insert into usuarios(nombre,apellido,telefono,direccion,correo_electronico,fecha_nacimiento,contrasenia,activo) values (?,?,?,?,?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuarios.getNombre());
            ps.setString(2, usuarios.getApellido());
            ps.setInt(3, usuarios.getTelefono());
            ps.setString(4, usuarios.getDireccion());
            ps.setString(5, usuarios.getCorreo_electronico());
            ps.setString(6, usuarios.getFecha_nacimiento());
            ps.setString(7, usuarios.getContrasenia());
            ps.setInt(8, usuarios.getActivo());
            ps.executeUpdate();
             
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }

    @Override
    public UsuariosGT obtener(int usuario_id) {
        String sql = "select * from usuarios where usuario_id= ?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario_id);
            rs = ps.executeQuery();
            if (rs.next()) {
                UsuariosGT usu = new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10));
                return usu;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }
            
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

            
    @Override
    public void modificar(UsuariosGT usuarios) {
        String sql = "update usuarios set nombre=?, apellido=?, telefono=?, direccion=?, correo_electronico=?, fecha_nacimiento=?, contrasenia=?, activo=? where usuario_id=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuarios.getNombre());
            ps.setString(2, usuarios.getApellido());
            ps.setInt(3, usuarios.getTelefono());
            ps.setString(4, usuarios.getDireccion());
            ps.setString(5, usuarios.getCorreo_electronico());
            ps.setString(6, usuarios.getFecha_nacimiento());
            ps.setString(7, usuarios.getContrasenia());
            ps.setInt(8, usuarios.getActivo());
            ps.setInt(9, usuarios.getUsuario_id());
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println(e);
        
        }
    }

    @Override
    public void eliminar(int usuario_id) {
    String sql = "delete from usuarios where usuario_id=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, usuario_id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
    
    public UsuariosGT consultar(String correo_electronico, String contrasenia){
    
    
        String sql = "select * from usuarios where correo_electronico= ? and contrasenia = ?";
    
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo_electronico);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
        
            if (rs.next()) {
                UsuariosGT sgt = new UsuariosGT(rs.getString(2), rs.getString(3), rs.getInt(8));
                return sgt;
            }
        
        } catch (Exception e) {
        }
    
    return null;
    }
    
}
