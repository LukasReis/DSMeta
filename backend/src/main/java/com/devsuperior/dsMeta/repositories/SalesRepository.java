package com.devsuperior.dsMeta.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.devsuperior.dsMeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

@Repository
public interface SalesRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);


}