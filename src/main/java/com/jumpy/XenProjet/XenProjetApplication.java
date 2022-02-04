package com.jumpy.XenProjet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jumpy.XenProjet.service.IXenProjetInitService;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XenProjetApplication implements CommandLineRunner{
	@Autowired
	private IXenProjetInitService xenProjetService;

	public static void main(String[] args) {
		SpringApplication.run(XenProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		xenProjetService.initAgences();
		xenProjetService.initPointXen();
		xenProjetService.initEmploye();
		xenProjetService.initUtilisateurs();
		xenProjetService.initComptes();
		xenProjetService.initPointXen();
		
	}

}
