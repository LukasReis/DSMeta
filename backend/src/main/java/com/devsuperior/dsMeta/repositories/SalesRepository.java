package com.devsuperior.dsMeta.repositories;

import org.springframework.stereotype.Repository;
import com.devsuperior.dsMeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SalesRepository extends JpaRepository<Sale, Long> {

}
