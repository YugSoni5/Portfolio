package com.yugsoni.Portfolio.repository;

import com.yugsoni.Portfolio.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepo extends JpaRepository<Contacts, Long> {

}
