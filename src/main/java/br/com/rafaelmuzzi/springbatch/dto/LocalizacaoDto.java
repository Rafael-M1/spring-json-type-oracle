package br.com.rafaelmuzzi.springbatch.dto;

import java.util.Arrays;

public class LocalizacaoDto {
	private Long id;
	private String texto;
	private String[] alarmes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String[] getAlarmes() {
		return alarmes;
	}

	public void setAlarmes(String[] alarmes) {
		this.alarmes = alarmes;
	}

	@Override
	public String toString() {
		return "LocalizacaoDto [id=" + id + ", texto=" + texto + ", alarmes=" + Arrays.toString(alarmes) + "]";
	}

}
