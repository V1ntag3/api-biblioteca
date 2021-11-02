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

import br.ufpi.modelo.Cliente;
import br.ufpi.repositorio.RepositorioDeClientes;
import br.ufpi.repositorio.RepositorioDeClientesEmMemoria;

public class ClienteResource {
	RepositorioDeClientes repositorio = new RepositorioDeClientesEmMemoria();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Cliente cliente) {
		repositorio.cadastrar(cliente);
		return Response.status(Status.CREATED).entity(cliente).build();// resposta
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(@QueryParam("nome") String nome) {
		if (nome != null) {
			Cliente cliente = repositorio.buscar(nome);
			return Response.status(Status.OK).entity(cliente).build();
		}
		List<Cliente> clientes = repositorio.listar();
		return Response.status(Status.OK).entity(clientes).build();
	}
}
