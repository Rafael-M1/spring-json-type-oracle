package br.com.rafaelmuzzi.springbatch.model;

import org.hibernate.annotations.Type;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "SGP_LOCALIZACAO", schema = "SIGEPEN_WS_OWNER")
public class Localizacao {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "localizacao_seq")
	@SequenceGenerator(name = "localizacao_seq", sequenceName = "SIGEPEN_WS_OWNER.SGP_LOCALIZACAO_SEQ", allocationSize = 1)
	private Long id;
	private String texto;
	@Type(JsonType.class)
	private String alarmes;

	public Localizacao() {
	}

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

	public String getAlarmes() {
		return alarmes;
	}

	public void setAlarmes(String alarmes) {
		this.alarmes = alarmes;
	}

	@Override
	public String toString() {
		return "Localizacao [id=" + id + ", texto=" + texto + ", alarmes=" + alarmes + "]";
	}

}
