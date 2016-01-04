package br.com.tf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tf.models.Ocorrencia;
import br.com.tf.service.OcorrenciaService;


@RestController
public class OcorrenciaController {

	
	@Autowired
	private OcorrenciaService service;
	
		
	@RequestMapping(value = "/api/ocorrencias" , method = RequestMethod.POST)
	public ResponseEntity<Ocorrencia> salvar(@RequestBody Ocorrencia ocorrencia) {
		
		ocorrencia = service.salvar(ocorrencia);
		
		return new ResponseEntity<Ocorrencia>(ocorrencia, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/ocorrencias" , method = RequestMethod.GET)
	public ResponseEntity<List<Ocorrencia>> listar() {
		
		List<Ocorrencia> ocorrencias = service.listar();
		
		return new ResponseEntity<List<Ocorrencia>>(ocorrencias, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/ocorrencias" , method = RequestMethod.PUT)
	public ResponseEntity<Ocorrencia> editar(@RequestBody Ocorrencia ocorrencia) {
		
		ocorrencia = service.salvar(ocorrencia);
		
		return new ResponseEntity<Ocorrencia>(ocorrencia, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/api/ocorrencias" , method = RequestMethod.DELETE)
	public ResponseEntity deletar(@RequestBody Ocorrencia ocorrencia) {
		
		service.deletar(ocorrencia);
		
		return new ResponseEntity(HttpStatus.OK);
	}
}
