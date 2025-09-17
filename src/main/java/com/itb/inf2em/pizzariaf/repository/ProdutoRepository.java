package com.itb.inf2em.pizzariaf.repository;

import com.itb.inf2em.pizzariaf.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
