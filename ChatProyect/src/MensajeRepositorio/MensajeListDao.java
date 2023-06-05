package MensajeRepositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import MensajeDominio.Mensaje;
import MensajeDominio.Usuario;

public class MensajeListDao 
{
    private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UsuarioListDao usuario = new UsuarioListDao();
	
	public MensajeListDao() 
	{
		Usuario Axel = usuario.UsuarioId(1);
		Usuario Evelyn = usuario.UsuarioId(2);
		Usuario Melissa = usuario.UsuarioId(3);
		Usuario Domenica = usuario.UsuarioId(4);
		Usuario Claro= usuario.UsuarioId(5);
		Usuario MiAmor=usuario.UsuarioId(6);
		Usuario Milenna=usuario.UsuarioId(7);
		Usuario MamiU= usuario.UsuarioId(8);
		Usuario Mamita= usuario.UsuarioId(9);
		Usuario Yeita= usuario.UsuarioId(10);
		
		//!CONVERSACIONES DE Axel
		mensajes.add(new Mensaje(2, Evelyn, Axel, LocalDateTime.of(2023, 03, 07, 15, 20), "Amigo, no hemos hecho estadistica"));
		mensajes.add(new Mensaje(1, Axel, Evelyn, LocalDateTime.of(2023, 03, 07, 15, 30), "Ya fue, estamos enteritos, no puede cer"));
		mensajes.add(new Mensaje(1, Axel, Evelyn, LocalDateTime.of(2023, 03, 07, 15, 30), " :( "));
		
		mensajes.add(new Mensaje(6, MiAmor, Axel, LocalDateTime.of(2023, 03, 07, 15, 20), "Hola Amor, Buenas tardes ♥ \nYa viene para la casa?"));
		mensajes.add(new Mensaje(1, Axel, MiAmor, LocalDateTime.of(2023, 03, 07, 15, 30), "Hola Amor, sí, saliendo de la U voy para allá ♥"));
		
		mensajes.add(new Mensaje(7, Milenna, Axel, LocalDateTime.of(2023, 03, 8, 07, 00), "Hola Amigo, Buenos días ♥"));
		mensajes.add(new Mensaje(7, Milenna, Axel, LocalDateTime.of(2023, 03, 8, 07, 00), "Cómo estás?"));
		mensajes.add(new Mensaje(1, Axel, Milenna, LocalDateTime.of(2023, 03, 8, 07, 02), "Buenoooooooos días alegriaaaaaaaa\n Bien de momento amiga jajaj\n y tú? ♥"));
		

		 mensajes.add(new Mensaje(1, Axel, Melissa, LocalDateTime.of(2023, 03, 07, 18, 30), "Meli"));
		 mensajes.add(new Mensaje(1, Axel, Melissa, LocalDateTime.of(2023, 03, 07, 18, 30), "Meli"));
		 mensajes.add(new Mensaje(1, Axel, Melissa, LocalDateTime.of(2023, 03, 07, 18, 30), "Meli"));
		 mensajes.add(new Mensaje(3, Melissa, Axel, LocalDateTime.of(2023, 03, 07, 19, 00), "¿Qué pasó amigo?"));
		 mensajes.add(new Mensaje(1, Axel, Melissa, LocalDateTime.of(2023, 03, 07, 19, 05), "Compalte Modelamiento"));
		
		
		mensajes.add(new Mensaje(4, Domenica, Axel, LocalDateTime.of(2023, 03, 06, 12, 30),  "Oe"));
		mensajes.add(new Mensaje(4, Domenica, Axel, LocalDateTime.of(2023, 03, 06, 12, 30),  "Oe"));
		mensajes.add(new Mensaje(4, Domenica, Axel, LocalDateTime.of(2023, 03, 06, 12, 30),  "Oe"));
		mensajes.add(new Mensaje(4, Domenica, Axel, LocalDateTime.of(2023, 03, 06, 12, 30),  "Ya hiciste Ingles?"));
		mensajes.add(new Mensaje(1, Axel, Domenica, LocalDateTime.of(2023, 03, 06, 12, 30), "Ni si quiera sabia que habia tarea xd"));
		
		
		mensajes.add(new Mensaje(5, Claro, Axel, LocalDateTime.of(2023, 02, 06, 11, 00), "Este Carnaval mira YouTube con GIGAS GRATIS! En tus paquetes desde $3 recibe 3GB GRATIS para YouTube x3dias! Activa aqui https://r.miclaro.com.ec"));
		mensajes.add(new Mensaje(5, Claro, Axel, LocalDateTime.of(2023, 02, 06, 11, 00), "Este Carnaval mira YouTube con GIGAS GRATIS! En tus paquetes desde $3 recibe 3GB GRATIS para YouTube x3dias! Activa aqui https://r.miclaro.com.ec"));

		mensajes.add(new Mensaje(8, MamiU, Axel, LocalDateTime.of(2023, 03, 04, 13, 30), "Axel"));
		mensajes.add(new Mensaje(8, MamiU, Axel, LocalDateTime.of(2023, 03, 04, 13, 30), "Dónde estás?"));
		mensajes.add(new Mensaje(8, MamiU, Axel, LocalDateTime.of(2023, 03, 04, 13, 30), "Ya ven rápido para la casa"));
		mensajes.add(new Mensaje(1, Axel, MamiU, LocalDateTime.of(2023, 03, 04, 13, 30), "Ya vooooooooy :) "));


		
		
		//!CONVERSACIONES DE EVELYN
		
		mensajes.add(new Mensaje(3, Melissa, Evelyn, LocalDateTime.of(2022, 11, 16, 12, 30), "Ni sabes pueeeeeeeees, que me tope con el inombrable"));
		mensajes.add(new Mensaje(2, Evelyn, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Con el cacas jajajajajajaja"));
		mensajes.add(new Mensaje(2, Evelyn, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "¿Cuándo y cómo?"));
		mensajes.add(new Mensaje(3, Melissa, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "De camino el trabajo\nCha madre oe que coraje"));
		
		mensajes.add(new Mensaje(2, Evelyn, Domenica, LocalDateTime.of(2022, 11, 15, 13, 30), "Dome donde carajos estás el profesor ya está tomando lista"));
		mensajes.add(new Mensaje(3, Domenica, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Voy"));
		mensajes.add(new Mensaje(3, Domenica, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Voy"));
		mensajes.add(new Mensaje(3, Domenica, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Voy"));
		mensajes.add(new Mensaje(3, Domenica, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Voy"));
		
		
		mensajes.add(new Mensaje(2, Evelyn, Axel, LocalDateTime.of(2022, 11, 15, 13, 30), "Amigo, dile a la profe de modelamiento que el bus no avanza :( )"));
		mensajes.add(new Mensaje(2, Evelyn, Axel, LocalDateTime.of(2022, 11, 15, 13, 30), "Y guardame puesto xd )"));

		mensajes.add(new Mensaje(5, Claro, Evelyn, LocalDateTime.of(2023, 02, 06, 11, 00), "Este Carnaval mira YouTube con GIGAS GRATIS! En tus paquetes desde $3 recibe 3GB GRATIS para YouTube x3dias! Activa aqui https://r.miclaro.com.ec"));
		mensajes.add(new Mensaje(5, Claro, Evelyn, LocalDateTime.of(2023, 02, 06, 11, 00), "Este Carnaval mira YouTube con GIGAS GRATIS! En tus paquetes desde $3 recibe 3GB GRATIS para YouTube x3dias! Activa aqui https://r.miclaro.com.ec"));

		mensajes.add(new Mensaje(2, Evelyn, Yeita, LocalDateTime.of(2022, 11, 15, 13, 30), "Pela las papas"));
		mensajes.add(new Mensaje(10, Yeita, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Solo hay 3 :( "));
		mensajes.add(new Mensaje(2, Evelyn, Yeita, LocalDateTime.of(2022, 11, 15, 13, 30), "Muy poquitas, no alcanzan"));
		mensajes.add(new Mensaje(10, Yeita, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Ya puse azar 6 maduros xd"));
		
		mensajes.add(new Mensaje(9, Mamita, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "¿Ya comiste hija?"));
		mensajes.add(new Mensaje(9, Mamita, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Tu hermana te quiere hablar"));
		mensajes.add(new Mensaje(2, Evelyn, Mamita, LocalDateTime.of(2022, 11, 15, 13, 30), "Ya comí \nEn ante"));
		
		

		
		
		//!CONVERSACIONES DE DOMENICA
		
		mensajes.add(new Mensaje(4, Axel, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola por donde vienes"));
		mensajes.add(new Mensaje(1, Domenica, Axel, LocalDateTime.of(2022, 11, 16, 12, 30), "Se daño el bus, llegare tarde"));
		
		mensajes.add(new Mensaje(3, Domenica, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Como vas con programacion? "));
		mensajes.add(new Mensaje(4, Melissa, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "tengo un poco de codigo en mi error"));

		
	
		
		
		
		
		
	}
	
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}    
}
