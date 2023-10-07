package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Collections {

	public static void main(String[] args) {
		//Array
		//
		String[] listaDeCompras = new String[] {"Leche","Pan","Huevos"};
		
		//Esta impresion solo muestra el esacio de memoria
		System.out.println(listaDeCompras);
		
		/*
		//Imprimir info de listaDeCompras con un forEach
				//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
				for(String productoAImprimir : listaDeCompras) {
					System.out.println(productoAImprimir);
				}//foreach
				*/
		//Implementacion de un arrayList
		//Clse General (interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
		List<String>listaDeContactos = new ArrayList<>();
		
		
		//Agrega elementos del tipostring a mi arraylist llamadolista de contactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Marco");
	
		
		//Obtener un elemento de la lista-asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		
		System.out.println(datoFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(3);
		System.out.println(listaDeContactos);
		
		
		//implementacion de un conjutno (SET)
		
		//Sintaxis
		//Interface de donde impemento + tipo de dato que usare + nombre que le doy al conjutno + instancia de la clase especifica
		
		Set<String>cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de Corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de treboles");
		cartasDeJuego.add("Reina de Corazones");
		//No puedo saber posiciones, solo saber si lo contiene
		if (cartasDeJuego.contains("Reina de Corazones")) {
			System.out.println("La reina de treboles si esta en el conjunto");
		}else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		//Implementacion de un mapa (hashMap)
		Map<String,String> libretaDirecciones = new HashMap <>();
	
		//Agregar elementos a mi libreta de direcciones
		libretaDirecciones.put("Felipe","Tlalnepantla");
		libretaDirecciones.put("El Vaquero","Sonora");
		
		//metodo para sacar informacion de la libreta, creando una nueva variable
		
		String direccionDeFelipe = libretaDirecciones.get("Felipe");
		String direccionDelVaquero = libretaDirecciones.get("El vaquero");
		
		
		//impresion 
		System.out.println(direccionDelVaquero);//null
		
		
		
	}//metodo main 
	
		

	}//collections
	
	/*
	 * 
	 * Colecciones
	 * 
	 * -Arrays (arreglos)
	 * 
	 * Es una estructura de datos lineal que contiene elementos del mismo tipo, los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
	 * 
	 * 
	 * 
	 * -Es una estructura de datos fija, generalmente almacena datos del mismo tipo
	 * -La longitud de un array se establece al momento de crearlo, y no cambia.
	 * -Los arrays pueden contener datos primitivos y objetos.
	 * -No proporciona metodos adicionales para agregar o eliminar elementos.
	 * 
	 * 
	 * 
	 * 
	 * Un ejemplo de array es una lista de compras del supermercado.
	 * 
	 * 
	 * 
	 * 
	 * -ArrayList
	 * 
	 * Es una implementacion de una lista (List), es decir, queesta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
	 * 
	 * 
	 * Sus principales caracteristicas son:
	 * 
	 * 
	 * -Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un array list si se puede modificar.
	 * -Acceso rapio, podemos acceder a un elemento del arrayList por su posicion o indice.
	 * 
	 * -Coste elevado al momento de insertar o eliminar elemento. Si agrego un elemetno, tengo que recorrer todos los demas elementos.
	 * 
	 * 
	 * 
	 * 
	 * Set (conjunto)
	 * 
	 * 
	 * Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
	 * 
	 * -No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
	 * -No hay un orden especifico, los elementos se almacenan sin orden especifico.
	 * -La busqueda es mas sencilla, ya que al no tener elementos duplicaods se usa una funcion hash para encontrar elemento deseado.
	 * 
	 * 
	 * 
	 * Map(Mapas)
	 * 
	 * 
	 * Un mapa es una estructura de datos que almacena pares de clave-valor.
	 * 
	 * -Almacenamiento con pares K-V
	 * -Sin orden especifico (similar a un Set)
	 * -Busqueda rapida, la busqueda se hace por medio de un valor (Key, y usa una funcion interna hash para buscar eleentos.
	 * 
	 * 
	 * 
	 * Agenda telefonica (agregar, modificar, eliminar)
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	


