package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Usuario;

public class UsuarioBaseDeDatos {

    private Usuario usuario;
	private String url;
	private String user;
	private String clave;
	
	public UsuarioBaseDeDatos() {
		url = "jdbc:postgresql://localhost:5432/BaseChat";
		user = "postgres";
		clave = "0943883991";
	}
	
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios";			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuarios.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			connect.close();			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public Usuario userId(int id) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where id_usuario = " + id;			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;		
	}
	
	public Usuario userName(String username) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where Usuarioname = '" + username + "'";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public Usuario password(String username, String password) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where Usuarioname = '" + username + "' and clave = '" + password + "'";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		return usuario;
	}
    
}
