package br.ufpi.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.ufpi.modelo.CategoriaLivro;
import br.ufpi.repositorio.RepositorioDeCategoriasLivro;
import br.ufpi.repositorio.RepositorioDeCategoriasLivroEmMemoria;

public class CategoriaLivroResource {
	RepositorioDeCategoriasLivro repositorio = new RepositorioDeCategoriasLivroEmMemoria();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(CategoriaLivro categoriaLivro) {
		repositorio.cadastrar(categoriaLivro);
		return Response.status(Status.CREATED).entity(categoriaLivro).build();// resposta
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(@QueryParam("nome") String nome) {
		if (nome != null) {
			CategoriaLivro categoriaLivro = repositorio.buscar(nome);
			return Response.status(Status.OK).entity(categoriaLivro).build();
		}
		List<CategoriaLivro> categoriasLivro = repositorio.listar();
		return Response.status(Status.OK).entity(categoriasLivro).build();
	}
}
