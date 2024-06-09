package br.com.rafaelmuzzi.springbatch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelmuzzi.springbatch.dto.LocalizacaoDto;
import br.com.rafaelmuzzi.springbatch.model.Localizacao;
import br.com.rafaelmuzzi.springbatch.repository.LocalizacaoRepository;
import br.com.rafaelmuzzi.springbatch.utils.JsonUtils;

@Service
public class LocalizacaoService {

	@Autowired
	private LocalizacaoRepository localizacaoRepository;
	
	public Localizacao save(LocalizacaoDto localizacaoDto) {
		System.out.println(localizacaoDto.getAlarmes().toString());
		return this.localizacaoRepository.save(fromDtoToEntity(localizacaoDto));
	}
	
	public List<Localizacao> saveAll(List<LocalizacaoDto> listLocalizacao) {
		return this.localizacaoRepository.saveAll(listLocalizacao.stream().map(this::fromDtoToEntity).toList());
	}
	
	private Localizacao fromDtoToEntity(LocalizacaoDto localizacaoDto) {
		Localizacao localizacao = new Localizacao();
		localizacao.setTexto(localizacaoDto.getTexto());
		localizacao.setAlarmes(JsonUtils.convertStringArrayToJson(localizacaoDto.getAlarmes()));
		return localizacao;
	}
}
