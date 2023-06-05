package BaseDeDatos;

import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Chat;
import MensajeDominio.Mensaje;
import MensajeDominio.Usuario;

public class ChatBaseDeDatos {
    private UsuarioBaseDeDatos usuario;
	private MensajeBaseDeDatos mensaje;
	
	public ChatBaseDeDatos() {
		usuario = new UsuarioBaseDeDatos();
		mensaje = new MensajeBaseDeDatos();
	}

	public UsuarioBaseDeDatos getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBaseDeDatos usuario) {
		this.usuario = usuario;
	}

	public MensajeBaseDeDatos getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeBaseDeDatos mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int userId){
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<Usuario> contactos = usuario.getUsuarios();
		
		for(Usuario l: contactos) {
			if(l.getId() == userId)
				continue;
			
			Mensaje ultimoMsj = mensaje.getUltimoMsj(userId, l.getId());
			
			if(ultimoMsj == null)
				continue;
			
			Usuario contacto = usuario.userId(l.getId());
			
			contactMsj.add(new Chat(contacto, ultimoMsj));
			
		}		
		
		return contactMsj;
		
	}
    
}
