package com.helha.FreshBread.repositorys;

import com.helha.FreshBread.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoProduct extends JpaRepository<Product, Long> { }
