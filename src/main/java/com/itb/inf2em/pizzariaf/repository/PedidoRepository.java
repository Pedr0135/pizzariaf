package com.itb.inf2em.pizzariaf.repository;


import com.itb.inf2em.pizzariaf.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
