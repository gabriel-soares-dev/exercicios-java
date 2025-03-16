package com.br.gabdev.access_api_visit.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gabdev.access_api_visit.adapter.entities.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Long>{

}
