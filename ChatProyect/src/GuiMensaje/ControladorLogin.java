package GuiMensaje;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class ControladorLogin
{
    private AnchorPane anchorPane;
	private Button btnIniciar;
	private Button btnRegresar;
	private HBox hbox1;
	private HBox hbox2;
	private ImageView ImgIconoUsuario;
    private ImageView ImgIconoContraseña;
    private ImageView ImgIconoDavex;
	private Label lblTitulo;
	private Label lblMsj;
	private Label lblUsuario;
	private Label lblAlerta;
	private PasswordField pswClave;
	private TextField txtUsuario;
	private VBox vbox1;
	private VBox vbox2;
    private Rectangle rectangulo;
    private Rectangle rectangulo2;
    private Label lblUser;
	
	
	
	public ControladorLogin() 
	{
        
        
		lblTitulo = new Label("INICIAR SESIÓN");
		lblTitulo.setFont(new Font(28));
		lblTitulo.setTextFill(Color.BLACK);
		lblTitulo.setStyle("-fx-font-family: 'Bookshelf Symbol 7';");
        lblTitulo.setWrapText(true);
        lblTitulo.setPrefWidth(210);
        lblTitulo.setPrefHeight(80);
        lblTitulo.setLayoutX(311);
        lblTitulo.setLayoutY(41);

        ImgIconoUsuario= new ImageView("ImagenesLogin/userLogin.png");
        ImgIconoUsuario.setFitHeight(25);
        ImgIconoUsuario.setFitWidth(24);
        ImgIconoUsuario.setLayoutX(311);
        ImgIconoUsuario.setLayoutY(161);

        ImgIconoDavex= new ImageView("ImagenesLogin/Devax.jpg");
        ImgIconoDavex.setFitHeight(200);
        ImgIconoDavex.setFitWidth(200);
        ImgIconoDavex.setLayoutX(23);
        ImgIconoDavex.setLayoutY(86);


		txtUsuario = new TextField();
		txtUsuario.setPrefWidth(149);
        txtUsuario.setPrefHeight(25);
        txtUsuario.setPromptText("Ingresar Usuario");
        txtUsuario.setLayoutX(348);
        txtUsuario.setLayoutY(161);

		ImgIconoContraseña= new ImageView("ImagenesLogin/contraseña.png");
        ImgIconoContraseña.setFitHeight(25);
        ImgIconoContraseña.setFitWidth(25);
        ImgIconoContraseña.setLayoutX(311);
        ImgIconoContraseña.setLayoutY(219);
		
		pswClave = new PasswordField();
		pswClave.setPromptText("Ingresar contraseña");
		pswClave.setPrefHeight(25);
        pswClave.setPrefWidth(149);
        pswClave.setLayoutX(348);
        pswClave.setLayoutY(219);

        lblMsj= new Label("¿Olvidaste tu contraseña?");
        lblMsj.setPrefWidth(136);
        lblMsj.setPrefHeight(17);
        lblMsj.setWrapText(true);
        lblMsj.setLayoutX(353);
        lblMsj.setLayoutY(250);



        

		btnIniciar = new Button("Inciar Sesión");
		btnIniciar.setPrefHeight(25);
        btnIniciar.setPrefWidth(83);
        btnIniciar.setLayoutX(379);
        btnIniciar.setLayoutY(300);
		

		lblAlerta = new Label();
		lblAlerta.setStyle("-fx-font-weight: normal;\r\n" + "-fx-font-family: 'Bookshelf Symbol 7';\r\n" + "-fx-font-size: 150%;\r\n" + "-fx-text-fill: rgb(0,0,0);");
        lblAlerta.setWrapText(true);
        lblAlerta.setTextAlignment(TextAlignment.JUSTIFY);

		btnRegresar = new Button("Volver Intentar");
		btnRegresar.setCursor(Cursor.HAND);
		btnRegresar.setStyle("-fx-background-color: #3498DB;");
		btnRegresar.setFont(new Font(10));
		btnRegresar.setPrefWidth(80);
        btnRegresar.setPrefHeight(34);
		btnRegresar.setTextFill(Color.WHITE);
		

        rectangulo=new Rectangle();
        rectangulo.setFill(Color.DODGERBLUE);
        rectangulo.setWidth(360);
        rectangulo.setHeight(400);
        rectangulo.setLayoutX(242);

        
       rectangulo2= new Rectangle();
        


		
		anchorPane = new AnchorPane();
		anchorPane.setStyle("-fx-background-color: #FFFFFF; ");

		
	}


	//#region GETTERS AND SETTERS
	
	public AnchorPane getAnchorPane() {
		return anchorPane;
	}

	public void setAnchorPane(AnchorPane anchorPane) {
		this.anchorPane = anchorPane;
	}

	public Button getBtnIniciar() {
		return btnIniciar;
	}

	public void setBtnIniciar(Button btnIniciar) {
		this.btnIniciar = btnIniciar;
	}

	public Button getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(Button btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public HBox getHbox1() {
		return hbox1;
	}

	public void setHbox1(HBox hbox1) {
		this.hbox1 = hbox1;
	}

	public HBox getHbox2() {
		return hbox2;
	}

	public void setHbox2(HBox hbox2) {
		this.hbox2 = hbox2;
	}


	public Label getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(Label lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	

	public Label getLblUsuario() {
		return lblUsuario;
	}

	public void setLblUsuario(Label lblUsuario) {
		this.lblUsuario = lblUsuario;
	}

	public Label getLblAlerta() {
		return lblAlerta;
	}

	public void setLblAlerta(Label lblAlerta) {
		this.lblAlerta = lblAlerta;
	}

	public PasswordField getPswClave() {
		return pswClave;
	}

	public void setPswClave(PasswordField pswClave) {
		this.pswClave = pswClave;
	}

	public TextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(TextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public VBox getVbox1() {
		return vbox1;
	}

	public void setVbox1(VBox vbox1) {
		this.vbox1 = vbox1;
	}

	public VBox getVbox2() {
		return vbox2;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}
   

	//#endregion
	

	public Rectangle getRectangulo() {
        return rectangulo;
    }


    public void setRectangulo(Rectangle rectangulo) {
        this.rectangulo = rectangulo;
    }


    public Label getLblUser() {
        return lblUser;
    }


    public void setLblUser(Label lblUser) {
        this.lblUser = lblUser;
    }


	
	public VBox contenidoVbox2() {
		vbox2 = new VBox(13, lblAlerta, btnRegresar);
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setId("vbox");
		return vbox2;
	}
	
	public void notificar(String Usuarioname, String password) 
	{
		if(Usuarioname.equals("") || password.equals(""))
			lblAlerta.setText("¡ERROR 567! ¡Campos Vacios!");
		else
			lblAlerta.setText("Usuario o contraseña incorrecta \n vuelva intentarlo");
            lblAlerta.setTextAlignment(TextAlignment.JUSTIFY);	
	}
	
	public AnchorPane anchor() {
		anchorPane.getChildren().addAll(rectangulo, lblTitulo,ImgIconoDavex,ImgIconoUsuario,txtUsuario,ImgIconoContraseña,pswClave,lblMsj, btnIniciar);
        
		
    	return anchorPane;
	}
	
}
