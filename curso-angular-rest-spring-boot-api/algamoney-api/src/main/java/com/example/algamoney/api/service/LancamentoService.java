package com.example.algamoney.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.LancamentoRepository;


@Service
public class LancamentoService {
	
	@Autowired
	LancamentoRepository lancamentoRepository;
	
	public Lancamento buscarLancamentoPeloCodigo(Long codigo) {
		Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
		if (!lancamentoSalvo.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return lancamentoSalvo.get();
	}


}
