package com.API.Site.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Site.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
