package MensajeRepositorio;

import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Usuario;

public class UsuarioListDao 
{
    private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UsuarioListDao() 
	{
		
		usuarios.add(new Usuario(1, "Axel", "Licoa", "AxelIsma06", "ImagenesUsuario/Axel.jpeg", "Axel05", "En linea"));
		usuarios.add(new Usuario(6, "Mi Amor ♥", "Macias", "claro12", "ImagenesUsuario/MiAmor.jpeg", "claro", "En Linea"));
		usuarios.add(new Usuario(7, "Mile FTW ♥", "Movil", "claro12", "ImagenesUsuario/Milenna.jpeg", "claro", "En Linea"));
		usuarios.add(new Usuario(8, "Mami U ♥", "Movil", "claro12", "ImagenesUsuario/MamiU.jpeg", "claro", "En Linea"));
		usuarios.add(new Usuario(9, "Mamita ♥", "Movil", "claro12", "ImagenesUsuario/MamiEve.jpeg", "claro", "En Linea"));
		usuarios.add(new Usuario(10, "Yeita ♥", "Movil", "claro12", "ImagenesUsuario/Yeita.jpeg", "claro", "En Linea"));
		usuarios.add(new Usuario(2, "Evelyn", "Rosales", "EveRosa01", "ImagenesUsuario/Eve.jpeg", "Eve1234", "Desconectado"));
		usuarios.add(new Usuario(3, "Melissa", "Arias", "MeliAri14", "ImagenesUsuario/Meli.jpeg", "meli1234", "En linea"));
		usuarios.add(new Usuario(4, "Domenica", "Ordoñez", "Francheska", "ImagenesUsuario/Dome.jpeg", "ordoñez", "Desconectado"));
		usuarios.add(new Usuario(5, "Claro", "Movil", "claro12", "ImagenesUsuario/Claro.svg.png", "claro", "En Linea"));
		
	}
	
	public List<Usuario> getUsuarios() 
	{
		return usuarios;
	}

	public Usuario UsuarioId(int id) {
		for(Usuario Usuario: usuarios) {
			if(Usuario.getId() == id)
				return Usuario;
		}
		return null;
	}
	
	public Usuario UsuarioName(String Usuarioname) {
		for(Usuario Usuario: usuarios) {
			if(Usuario.getUsuarioname().equals(Usuarioname))
				return Usuario;
		}
		return null;
	}
	
	public Usuario password(String Usuarioname, String clave) {
		for(Usuario Usuario: usuarios) {
			if(Usuario.getUsuarioname().equals(Usuarioname) && Usuario.getClave().equals(clave))
				return Usuario;
		}
		return null;
	}
}
