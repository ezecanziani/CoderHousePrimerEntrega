package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.entity.Client;
import com.coderhouse.entity.Products;

@SpringBootApplication
public class PrimeraEntregaApplication implements CommandLineRunner {

	@Autowired
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeraEntregaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
		
			
			Products products1 = new Products("html", 0);
			Products products2 = new Products("css", 1);
			Products products3 = new Products("c++", 2);
			Products products4 = new Products("java", 3);
			
			Client client1 = new Client("ezequiel", "canziani", "43143888");
			Client client2 = new Client("diego", "canziani", "36143888");
		    Client client3 = new Client("cristian", "canziani", "21392861");
		    Client client4 = new Client("conrado", "canziani", "53143888");
			
			dao.persisirClient(client1);
			dao.persisirClient(client2);
			dao.persisirClient(client3);
			dao.persisirClient(client4);
			
			dao.persisirProductos(products1);
			dao.persisirProductos(products2);
			dao.persisirProductos(products3);
			dao.persisirProductos(products4);
			
		}catch( Exception e) {
		e.printStackTrace(System.err);
		}
		
	}

}
