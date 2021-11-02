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

import br.ufpi.modelo.Biblioteca;
import br.ufpi.repositorio.RepositorioDeBibliotecas;
import br.ufpi.repositorio.RepositorioDeBibliotecasEmMemoria;

@Path("biblioteca")
public class BibliotecaResource {
	RepositorioDeBibliotecas repositorio = new RepositorioDeBibliotecasEmMemoria();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Biblioteca biblioteca) {
		repositorio.cadastrar(biblioteca);
		return Response.status(Status.CREATED).entity(biblioteca).build();// resposta
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(@QueryParam("nome") String nome) {
		if (nome != null) {
			Biblioteca biblioteca = repositorio.buscar(nome);
			return Response.status(Status.OK).entity(biblioteca).build();
		}
		List<Biblioteca> bibliotecas = repositorio.listar();
		return Response.status(Status.OK).entity(bibliotecas).build();
	}
}
