package com.br.gabdev.access_api_visit.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gabdev.access_api_visit.adapter.entities.ResidentEntity;

public interface ResidentRepository extends JpaRepository<ResidentEntity, Long>{

	ResidentEntity findByCpf(String cpf);
}
