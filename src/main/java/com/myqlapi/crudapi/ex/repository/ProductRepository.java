package com.myqlapi.crudapi.ex.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myqlapi.crudapi.ex.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Optional<Product> findByName(String name);

}
