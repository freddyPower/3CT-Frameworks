package com.mx.lasancheza.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.mx.lasancheza.domain.Persona;
import com.mx.lasancheza.servicio.PersonaServiceRemote;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote {

	public List<Persona> listarPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add( new Persona( 1 , "Luis" , "Sanchez" , "Angeles" , "fred@mail.com" , "53030152" ) );
		personas.add( new Persona( 2 , "Angelica" , "Madrid" , "Jimenez" , "angelicad@mail.com" , "53030152" ) );
		personas.add( new Persona( 3 , "Ian" , "Robles" , "Gonzalez" , "iand@mail.com" , "53030152" ) );
		
		return personas;
	}

	public void registrarPersona(Persona p) {
		

	}

	public Persona encontrarPersonaPorId(Persona p) {
		return p;
		

	}

	public Persona encontrarPersonaPorEmail(Persona p) {
		return p;

	}

	public void modificarPersona(Persona p) {
		

	}

	public void eliminarPersona(Persona p) {
		

	}

}
