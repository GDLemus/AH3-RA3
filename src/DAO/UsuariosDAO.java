
package DAO;

import java.util.LinkedList;
import MODEL.UsuariosGT;


public interface UsuariosDAO {
    
    public LinkedList<UsuariosGT> listar();
    
    public void crear(UsuariosGT usuarios);
    
    public UsuariosGT obtener(int usuario_id);
    
    public void modificar(UsuariosGT usuarios);
    
    public void eliminar(int usuario_id);

    public UsuariosGT consultar(String text, String text0);
    
    
}
