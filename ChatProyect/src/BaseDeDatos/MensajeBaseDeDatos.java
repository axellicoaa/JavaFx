package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Mensaje;
import MensajeDominio.Usuario;

public class MensajeBaseDeDatos {

    private UsuarioBaseDeDatos usuarios = new UsuarioBaseDeDatos();
	private List<Mensaje> resultado;
	private String url;
	private String user;
	private String clave;
	
	public MensajeBaseDeDatos() {
		url = "jdbc:postgresql://localhost:5432/BaseChat";
		user = "postgres";
		clave = "0943883991";
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2){
		resultado = new ArrayList<Mensaje>();
		int idmsj;
		Usuario user1;
		Usuario user2;
		LocalDateTime fecha;
		String mensaje;
	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from mensajes where usuario1 = " + usuario1 + " and usuario2 = " + usuario2 + " or usuario1 = " + usuario2 + " and usuario2 = " + usuario1;
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				idmsj = rs.getInt(1);
				user1 = usuarios.userId(rs.getInt(2));
				user2 = usuarios.userId(rs.getInt(3));
				mensaje = rs.getString(4);
				fecha = rs.getTimestamp(5).toLocalDateTime();
				Mensaje ms = new Mensaje(idmsj, user1, user2, fecha, mensaje);
				resultado.add(ms);
			}
			
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		resultado = conversaciones(usuario1, usuario2);
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);
	}
	
	public void addMensajes(Mensaje mensaje) {
		try {			
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "insert into mensajes (usuario1, usuario2, mensaje, fecha)\r\n"
					+ "values (" + mensaje.getUsuario1().getId() + ", " + mensaje.getUsuario2().getId() + ", '" + mensaje.getMensaje() + "', '" + mensaje.getFecha() + "');";
			stm.execute(query);
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
    
}
