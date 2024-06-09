package br.com.rafaelmuzzi.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelmuzzi.springbatch.model.Localizacao;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long>{

}
