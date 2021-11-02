package br.ufpi.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.ufpi.modelo.Livro;
import br.ufpi.repositorio.RepositorioDeLivros;
import br.ufpi.repositorio.RepositorioDeLivrosEmMemoria;

@Path("livro")
public class LivroResource {
	RepositorioDeLivros repositorio = new RepositorioDeLivrosEmMemoria();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Livro livro) {
		repositorio.cadastrar(livro);
		return Response.status(Status.CREATED).entity(livro).build();// resposta
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(@QueryParam("nome") String nome) {
		if(nome!=null) {
			Livro livro = repositorio.buscar(nome);
			return Response.status(Status.OK).entity(livro).build();
		}
		List<Livro> livros = repositorio.listar();
		return Response.status(Status.OK).entity(livros).build();
	}
}
