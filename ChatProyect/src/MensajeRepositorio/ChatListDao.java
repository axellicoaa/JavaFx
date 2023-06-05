package MensajeRepositorio;

import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Chat;
import MensajeDominio.Mensaje;
import MensajeDominio.Usuario;

public class ChatListDao 
{
    private UsuarioListDao usuario;
	private MensajeListDao mensaje;
	
	public ChatListDao() {
		usuario = new UsuarioListDao();
		mensaje = new MensajeListDao();
	}

	public UsuarioListDao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioListDao usuario) {
		this.usuario = usuario;
	}

	public MensajeListDao getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeListDao mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int UsuarioId){
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<Usuario> contactos = usuario.getUsuarios();
		
		for(Usuario l: contactos) {
			if(l.getId() == UsuarioId)
				continue;
			
			Mensaje ultimoMsj = mensaje.getUltimoMsj(UsuarioId, l.getId());
			
			if(ultimoMsj == null)
				continue;
			
			Usuario contacto = usuario.UsuarioId(l.getId());
			
			contactMsj.add(new Chat(contacto, ultimoMsj));
			
		}		
		
		return contactMsj;
		
	}
}
