package com.yengue.demospring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yengue.demospring.entities.Produit;

public interface ProduitDAO extends JpaRepository<Produit, Long> {

}
