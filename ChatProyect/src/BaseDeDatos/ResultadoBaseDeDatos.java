package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;

import MensajeDominio.Mensaje;
import MensajeDominio.Usuario;
import MensajeRepositorio.MensajeListDao;
import MensajeRepositorio.UsuarioListDao;

public class ResultadoBaseDeDatos {

    public static void main(String[] args) {
		
		UsuarioListDao usuarioListDao= new UsuarioListDao();
		MensajeListDao mensajeListDao= new MensajeListDao();

		try {
			Connection conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BaseChat", "postgres", "0943883991");
			Statement stm = conect.createStatement();
			String queryInsert;
			String queryCreate;
			String queryDrop;
			
			queryDrop = "drop table mensajes, usuarios";
			
			stm.execute(queryDrop);
			//#region
			queryCreate = "create table usuarios (\r\n"
					+ "	id_usuario serial not null,\r\n"
					+ "	nombre character varying not null,\r\n"
					+ "	apellido character varying not null,\r\n"
					+ "	Usuarioname character varying not null,\r\n"
					+ "	imagen varchar not null,\r\n"
					+ "	clave character varying not null,\r\n"
					+ "	estado character varying not null,\r\n"
					+ "	constraint pk_userId primary key (id_usuario)\r\n"
					+ ");\r\n"
					+ "\r\n"
					+ "create table mensajes (\r\n"
					+ "	id_mensajes serial not null,\r\n"
					+ "	usuario1 integer not null,\r\n"
					+ "	usuario2 integer not null,\r\n"
					+ "	mensaje character varying not null,\r\n"
					+ "	fecha timestamp not null,\r\n"
					+ "	constraint pk_mensajeId primary key (id_mensajes),\r\n"
					+ "	constraint fk_usuario1 foreign key (usuario1) references usuarios (id_usuario),\r\n"
					+ "	constraint fk_usuario2 foreign key (usuario2) references usuarios (id_usuario)\r\n"
					+ ");";
			
			stm.execute(queryCreate);
			//#endregion

			for(Usuario user: usuarioListDao.getUsuarios()) {
	
				queryInsert = "INSERT INTO public.usuarios (nombre, apellido, Usuarioname, imagen, clave, estado)"
						+ "VALUES ('"+user.getNombre()+"', '"+user.getApellido()+"', '"+user.getUsuarioname()+"', '"+user.getImagen()+"', '"+user.getClave()+"', '"+user.getEstado()+"');";
							
				stm.execute(queryInsert);
	
			}
			
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd MMM, YYYY  HH:mm");
			
			for(Mensaje msj: mensajeListDao.getMensajes()) {
				
				queryInsert = "INSERT INTO public.mensajes (usuario1, usuario2, mensaje, fecha)"
						+ "VALUES ('"+msj.getUsuario1().getId()+"', '"+msj.getUsuario2().getId()+"', '"+msj.getMensaje()+"', '"+dt.format(msj.getFecha())+"');";
				
				stm.execute(queryInsert);
						 
			}
		
			System.out.println("Base de datos conectada de forma exitosa");
			
		}
		
		catch (SQLException e) {
			
			System.out.println("No se pudo establecer la conexión");
			e.printStackTrace();
		}	
			
		
	}
    
}
