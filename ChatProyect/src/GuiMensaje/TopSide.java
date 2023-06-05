package GuiMensaje;

import MensajeDominio.Usuario;
import MensajeRepositorio.UsuarioListDao;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class TopSide 
{
    private UsuarioListDao usuario = new UsuarioListDao();
	private Circle imagen;
	private Button logout;
	private MenuBar menu;
	private Menu opciones;
	private MenuItem itnCerrarSesion;
	private MenuItem itnAñadirContactos;
	private MenuItem itnBuscarContactos;
	private MenuItem itnConfig;
	private Label nombre;
	private Label estado;
	private HBox topleft;
	private HBox topright;
	private Usuario Usuario;
	
	public TopSide(String Usuarioname) {
		Usuario =  usuario.UsuarioName(Usuarioname);
		nombre = new Label(Usuario.getNombre());
		imagen = new Circle(20);
		menu= new MenuBar();
		opciones= new Menu("⁝");
		opciones.setStyle("-fx-font-color:  #fdfefe ");
		itnCerrarSesion= new MenuItem("Cerrar Sesion");
		itnBuscarContactos= new MenuItem("Buscar Contactos");
		itnAñadirContactos= new MenuItem("Nuevo Contacto");
		itnConfig= new MenuItem("Configuración");
		opciones.getItems().addAll(itnCerrarSesion,itnBuscarContactos,itnAñadirContactos,itnConfig);
		menu.getMenus().add(opciones);
		menu.setBackground(Background.fill(Color.DODGERBLUE));
		menu.setTranslateX(15);
		logout = new Button("Logout");
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
	}
	
	public TopSide() {
		imagen = new Circle(20);
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
		topright = new HBox(10);
		topright.setStyle("-fx-padding: 6px 10px 0 10px;\r\n"
				+ "	-fx-pref-height: 61px;\r\n"
				+ "	-fx-alignment: center-left;\r\n"
				+ "	-fx-border-color: rgba(244,244,244,0.75)");
		topright.setAlignment(Pos.CENTER_LEFT);
	}

	public UsuarioListDao getUsuarioList() {
		return usuario;
	}

	public void setUsuario(UsuarioListDao usuario) {
		this.usuario = usuario;
	}

	public Circle getImagen() {
		return imagen;
	}

	public void setImagen(Circle imagen) {
		this.imagen = imagen;
	}

	public Button getLogout() {
		return logout;
	}

	public void setLogout(Button logout) {
		this.logout = logout;
	}

	public Label getNombre() {
		return nombre;
	}

	public void setNombre(Label nombre) {
		this.nombre = nombre;
	}

	public Label getEstado() {
		return estado;
	}

	public void setEstado(Label estado) {
		this.estado = estado;
	}
	
	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	public HBox getTopleft() {
		return topleft;
	}

	public void setTopleft(HBox topleft) {
		this.topleft = topleft;
	}

	public HBox getTopright() {
		return topright;
	}

	public void setTopright(HBox topright) {
		this.topright = topright;
	}


	

	public MenuBar getMenu() {
		return menu;
	}

	public void setMenu(MenuBar menu) {
		this.menu = menu;
	}

	public Menu getOpciones() {
		return opciones;
	}

	public void setOpciones(Menu opciones) {
		this.opciones = opciones;
	}

	public MenuItem getItnCerrarSesion() {
		return itnCerrarSesion;
	}

	public void setItnCerrarSesion(MenuItem itnCerrarSesion) {
		this.itnCerrarSesion = itnCerrarSesion;
	}

	public MenuItem getItnAñadirContactos() {
		return itnAñadirContactos;
	}

	public void setItnAñadirContactos(MenuItem itnAñadirContactos) {
		this.itnAñadirContactos = itnAñadirContactos;
	}

	public MenuItem getItnBuscarContactos() {
		return itnBuscarContactos;
	}

	public void setItnBuscarContactos(MenuItem itnBuscarContactos) {
		this.itnBuscarContactos = itnBuscarContactos;
	}

	public HBox topLeft() {
		imagen.setFill(new ImagePattern(new Image(Usuario.getImagen())));
		topleft = new HBox(10, imagen, nombre, menu);
		topleft.setStyle("-fx-padding: 5px, 3px, 5px, 3px;\r\n"
				+ "	-fx-background-color: rgba(30, 144, 255);\r\n"
				+ "	-fx-background-radius: 0px;\r\n"
				+ "	-fx-pref-height: 61px;\r\n"
				+ "	-fx-alignment: center-left;\r\n"
				+ "	-fx-border-color: rgba(30, 144, 255)	");
		topleft.setAlignment(Pos.CENTER);
		return topleft;
	}
	
	public HBox topRight(int UsuarioId) {
		Usuario =  usuario.UsuarioId(UsuarioId);
		nombre = new Label(Usuario.getNombre());
		nombre.setStyle("-fx-font-family: 'Bookshelf Symbol 7';\r\n"
				+ "	-fx-text-fill: black;\r\n"
				+ "	-fx-font-weight: bold;\r\n"
				+ "	-fx-font-size: 130%;");
		estado = new Label(Usuario.getEstado());
		estado.setStyle("-fx-font-family: 'Bookshelf Symbol 7';\r\n"
				+ "	-fx-text-fill: black;\r\n"
				+ "	-fx-font-weight: normal;\r\n"
				+ "	-fx-font-size: 90%;");
		imagen.setFill(new ImagePattern(new Image(Usuario.getImagen())));
		VBox vbox = new VBox(5, nombre, estado);
		
		
		topright.getChildren().addAll(imagen, vbox);
		return topright;
	}
	
	public void styles() {
		nombre.setStyle("-fx-font-family: 'Bookshelf Symbol 7';\r\n"
				+ "	-fx-font-weight: bold;\r\n"
				+ "	-fx-font-size: 130%;\r\n"
				+ "	-fx-pref-width: 140px;\r\n"
				+ "	-fx-text-fill: black;");		
	}
	
}
