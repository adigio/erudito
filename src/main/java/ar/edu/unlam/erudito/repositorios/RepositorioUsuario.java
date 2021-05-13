package ar.edu.unlam.erudito.repositorios;

import ar.edu.unlam.erudito.modelo.Usuario;

// Interface que define los metodos del Repositorio de Usuarios.
public interface RepositorioUsuario {
	
	Usuario consultarUsuario (Usuario usuario);
}
