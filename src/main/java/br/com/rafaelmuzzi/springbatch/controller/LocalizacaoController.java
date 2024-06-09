package br.com.rafaelmuzzi.springbatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelmuzzi.springbatch.dto.LocalizacaoDto;
import br.com.rafaelmuzzi.springbatch.model.Localizacao;
import br.com.rafaelmuzzi.springbatch.service.LocalizacaoService;


@RestController
@RequestMapping("/localizacoes")
public class LocalizacaoController {

	@Autowired
	private LocalizacaoService localizacaoService;
	
	@PostMapping()
	public  ResponseEntity<Localizacao> save(@RequestBody LocalizacaoDto localizacao) {
		
		return new ResponseEntity<Localizacao>(
				this.localizacaoService.save(localizacao),
				HttpStatus.OK);
	}
	
	@PostMapping("/lista")
	public  ResponseEntity<List<Localizacao>> saveAll(@RequestBody List<LocalizacaoDto> listLocalizacao) {
		return new ResponseEntity<List<Localizacao>>(
				this.localizacaoService.saveAll(listLocalizacao), 
				HttpStatus.OK);
	}
}
