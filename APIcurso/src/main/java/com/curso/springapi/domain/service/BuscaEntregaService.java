package com.curso.springapi.domain.service;

import org.springframework.stereotype.Service;

import com.curso.springapi.domain.exception.EntidadeNaoEncontradaException;
import com.curso.springapi.domain.model.Entrega;
import com.curso.springapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
