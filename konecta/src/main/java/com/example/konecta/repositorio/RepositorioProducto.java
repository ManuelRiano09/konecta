package com.example.konecta.repositorio;

import com.example.konecta.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer> {
}
