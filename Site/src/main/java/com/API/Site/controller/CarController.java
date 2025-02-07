package com.API.Site.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.API.Site.entity.CarEntity;
import com.API.Site.service.CarService;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/cars")
public class CarController {
@Autowired
CarService service;
@GetMapping("get-all")
public List<CarEntity> findAll(){
	return service.GetAllCars();
}
@GetMapping("/{id}")
public Optional<CarEntity> getCar(@PathVariable Long id){
	return service.GetOneCar(id);
}
@PostMapping("ok-ok")
@ResponseStatus(HttpStatus.CREATED)
public void create(@RequestBody CarEntity entity) {
	service.createCar(entity);
}
}
