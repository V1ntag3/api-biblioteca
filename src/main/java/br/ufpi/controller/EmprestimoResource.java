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

import br.ufpi.modelo.Emprestimo;
import br.ufpi.repositorio.RepositorioDeEmprestimos;
import br.ufpi.repositorio.RepositorioDeEmprestimosEmMemoria;

@Path("emprestimo")
public class EmprestimoResource {

		RepositorioDeEmprestimos repositorio = new RepositorioDeEmprestimosEmMemoria();

		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cadastrar(Emprestimo emprestimo) {
			repositorio.cadastrar(emprestimo);
			return Response.status(Status.CREATED).entity(emprestimo).build();// resposta
		}

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Response listar(@QueryParam("nome") String nome) {
			if (nome != null) {
				Emprestimo emprestimo = repositorio.buscar(nome);
				return Response.status(Status.OK).entity(emprestimo).build();
			}
			List<Emprestimo> emprestimos = repositorio.listar();
			return Response.status(Status.OK).entity(emprestimos).build();
		}

}