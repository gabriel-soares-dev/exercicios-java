package com.br.gabdev.access_api_visit.adapter.repositories;

import com.br.gabdev.access_api_visit.adapter.entities.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);

}
