package com.helha.FreshBread.repositorys;

import com.helha.FreshBread.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoOrder extends JpaRepository<Order, Long> { }
