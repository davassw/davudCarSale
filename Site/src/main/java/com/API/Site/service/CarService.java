package com.API.Site.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.API.Site.entity.CarEntity;
import com.API.Site.repository.CarRepository;

@Service
public class CarService {
@Autowired
CarRepository Repository;
public List<CarEntity> 	GetAllCars(){
	return Repository.findAll();
}
public Optional<CarEntity> GetOneCar(Long id) {
	return Repository.findById(id);
	}
public void createCar(CarEntity carEntity) {
  Repository.save(carEntity);
}
}
