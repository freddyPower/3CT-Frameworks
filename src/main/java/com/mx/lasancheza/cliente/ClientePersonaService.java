package com.mx.lasancheza.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.mx.lasancheza.domain.Persona;
import com.mx.lasancheza.servicio.PersonaServiceRemote;

public class ClientePersonaService {
	public static void main(String[] args) {
		System.out.println("Iniciando llamada al EJB");
		try {
			
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/Administrador/PersonaServiceImpl!com.mx.lasancheza.servicio.PersonaServiceRemote");
			List<Persona> listaPersonas = personaService.listarPersonas();
			
			for( Persona persona : listaPersonas ) {				
				System.out.println(persona);
			}
			System.out.println("Fin de llamada al EJB del cliente");
			
		} catch (NamingException e) {
			System.out.println("Excepcion al iniciar el contexto: " +  e.getMessage());			
		}
	}
}
