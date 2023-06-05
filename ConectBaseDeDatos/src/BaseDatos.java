import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BaseDatos {

	public static void mostrarUsuarios(Connection con) {
		
		PreparedStatement query;
		
	try {
					
	            String sql = "SELECT * FROM Usuario;";
	            query = con.prepareStatement(sql);
	            
	            
	            ResultSet resultSet = query.executeQuery();
	            
	            while(resultSet.next()) {
	            	int id = resultSet.getInt("id_Usuario");
	            	String name = resultSet.getString("nombre");
	            	String lastname = resultSet.getString("apellido");
	            	String username = resultSet.getString("nombreUsuario");
                    String contraseña = resultSet.getString("contraseña");
	            	
	            	System.out.println(id +" "+ name +" "+ lastname + " " + username + " " + contraseña );
                    
	            }			
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void IngresarUsuario (Scanner sc, Connection conect){
        System.out.println("Ingrese su nombre");
        String nombre= sc.next();
        System.out.println("Ingrese su Apellido");
        String apellido= sc.next();
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario= sc.next();
        System.out.println("Digite su contraseña");
        String contraseña= sc.next();
        System.out.println("<<<<<<< Usuario Agregado >>>>>>>");
        System.out.println("<<<<<<< Está de vuelta en el menú de opciones >>>>>>>>");

        PreparedStatement query;
        try{
            String sql = "Insert into Usuario (nombre, apellido, nombreUsuario, contraseña) values (?,?,?,?);";
            query= conect.prepareStatement(sql);
            
            query.setString(1, nombre);
            query.setString(2, apellido);
            query.setString(3, nombreUsuario);
            query.setString(4, contraseña);
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void ModificarUsuario(Scanner sc, Connection conect){

        int id= sc.nextInt();
        String nombre= sc.next();
        String apellido= sc.next();
        String nombreUsuario= sc.next();
        String contraseña= sc.next();
        System.out.println("<<<<<<< Está de vuelta en el menú de opciones >>>>>>>>");

        PreparedStatement query;
        try{
            String sql = "update Usuario set nombre=?, apellido=?, nombreUsuario=?, contraseña=? where id_Usuario = ?;";
            query= conect.prepareStatement(sql);
            query.setString(1, nombre);
            query.setString(2, apellido);
            query.setString(3, nombreUsuario);
            query.setString(4, contraseña);
            query.setInt(5, id);
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
       
    }
    public static void EliminarUsuario(Scanner sc, Connection conect){
        int id= sc.nextInt();
        System.out.println("Usuario Eliminado");
        System.out.println("<<<<<<< Está de vuelta en el menú de opciones >>>>>>>>");

        PreparedStatement query;
        try{
            String sql = "delete from Usuario where id_Usuario = ?;";
            query= conect.prepareStatement(sql);
            query.setInt(1, id);
            query.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
        Connection conn = null;
        String url = "jdbc:postgresql://localhost:5432/Conect";
        String usuario = "postgres";
        String contrasena = "0943883991";
        
        try {
            conn = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		int options = -1;
		
		do {
			System.out.println("██████ Seleccione una opción ██████");
			System.out.println("<1> Mostrar usuarios");
			System.out.println("<2> Ingresar usuarios");
			System.out.println("<3> Modificar usuario");
			System.out.println("<4> Eliminar usuarios");
			System.out.println("<0> salir");
			
			options = ingreso.nextInt();
			
			if(options == 1) {
				System.out.println("Usuarios");
				mostrarUsuarios(conn);
                System.out.println("<<<<<<< Está de vuelta en el menú de opciones >>>>>>>>");
			}else if(options == 2) {
				System.out.println("Ingresar usuario");
                IngresarUsuario(ingreso, conn);			
			}else if(options == 3) {
				System.out.println("Modificar usuario");
                ModificarUsuario(ingreso, conn);
			}else if(options == 4) {
				System.out.println("Eliminar usuario");
                EliminarUsuario(ingreso, conn);
			}
			
		}while(options != 0);
		
		System.out.println("!!!!!!!! Saliendo del menú de opciones !!!!!!");
		
	}

}



