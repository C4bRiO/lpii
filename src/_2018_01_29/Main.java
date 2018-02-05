package _2018_01_29;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//Personas ever = new Personas();
		
		
		/*ever.edad = 22;
		  ever.nombre = "asdasdas";
		  ever.Id = 1;*/
		
		//Personas perso2 = new Personas(2,"Enzo",0);
		
		//System.out.println(perso2.toString());
		
		
		/*Clientes cli = new Clientes(3,"random",44,258497);
		
		
		System.out.println( cli.toString() );*/
		
		
		ArrayList<Clientes> clientesList = new ArrayList<>();
		
		Clientes cli = new Clientes(1,"Ever",22,100000);
		
		
		clientesList.add(cli);
		
		 cli = new Clientes(2,"Jazmin",21,84654694);
		
		clientesList.add(cli);
		
		
		
		Iterator<Clientes> it = clientesList.iterator();
		
		
		/*while (it.hasNext()){
			System.out.println(it.next());
		}*/
		
		
		/*for (int i = 0;i < clientesList.size();i++) {
			System.out.println(clientesList.get(i));
		}*/
		
		
		while( it.hasNext() ){
			cli = (Clientes) it.next();
			
			System.out.println(cli);
		}
		
		
		clientesList.remove(0);
		
		
		for(int i= 0; i<clientesList.size(); i++){
			System.out.println(clientesList.get(i).getNombre() );
		}
		
		
		
		
		
		
		
		
		
	}
}
