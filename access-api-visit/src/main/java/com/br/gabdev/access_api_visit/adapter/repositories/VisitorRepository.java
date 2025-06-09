package com.br.gabdev.access_api_visit.adapter.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gabdev.access_api_visit.adapter.entities.VisitorEntity;

public interface VisitorRepository extends JpaRepository<VisitorEntity, Long>{
	
	public Optional<VisitorEntity> findByCpf(String cpf);
	
	public Optional<VisitorEntity> findByRg(String rg);
	
}
