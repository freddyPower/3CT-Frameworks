package com.mx.lasancheza.servicio;

import java.util.List;

import javax.ejb.Remote;

import com.mx.lasancheza.domain.Persona;

@Remote
public interface PersonaServiceRemote {
	
	public List<Persona> listarPersonas();
	public void registrarPersona( Persona p );
	public Persona encontrarPersonaPorId( Persona p );
	public Persona encontrarPersonaPorEmail( Persona p );
	public void modificarPersona( Persona p );
	public void eliminarPersona( Persona p  );	
	
}
