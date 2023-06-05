package MensajeDominio;

public class Usuario
{
    private int id;
	private String nombre;
	private String apellido;
	private String Usuarioname;
	private String imagen;
	private String clave;
	private String estado;
	
	public Usuario(int id, String nombre, String apellido, String Usuarioname, String imagen, String clave, String estado) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.Usuarioname = Usuarioname;
		this.imagen = imagen;
		this.clave = clave;
		this.estado = estado;
	}
	
	public Usuario(int id, String Usuarioname) {
		this.id = id;
		this.Usuarioname = Usuarioname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuarioname() {
		return Usuarioname;
	}

	public void setUsuarioname(String Usuarioname) {
		this.Usuarioname = Usuarioname;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}    
}
