package com.imfe;

import java.util.ArrayList;
import java.util.List;

import com.imfe.model.Comestible;
import com.imfe.model.Hamburguesa;
import com.imfe.model.Hotdog;

public class Principal {
	
	public static void main (String[] args) {
		
		//Creamos una lista con objetos que implementan la interfaz comestible, por lo que podemos añadir a la lista tantas
		//burger como hotdog
		List<Comestible> lista = new ArrayList <Comestible>();
		
		//Creamos objetos distintos
		lista.add(new Hamburguesa("1"));
		lista.add(new Hamburguesa("2"));
		lista.add(new Hamburguesa("3"));
		lista.add(new Hamburguesa("4"));
		lista.add(new Hotdog("1"));
		
		System.out.println("Lista de precios");
		System.out.println("==================");
		for(Comestible c: lista) {
			System.out.println(c.toString() + " Precio ->" +c.precio());
			
		}
		
		//Ahora nos 'comemos' esos objetos comestibles
		/*Podemos llamar tranquilamente al método comer
		 ya que la interfaz nos obligó a implementar ese método
		 */
		for(Comestible c: lista) {
			System.out.println(c.comer());
		}
	}

}
