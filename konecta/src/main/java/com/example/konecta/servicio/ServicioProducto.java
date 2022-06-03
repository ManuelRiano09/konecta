package com.example.konecta.servicio;

import com.example.konecta.modelo.Producto;
import com.example.konecta.repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServicioProducto {

    @Autowired
    RepositorioProducto repositorioProducto;


    public void guardarProducto(){

        LocalDate date = LocalDate.now();

        Producto producto = new Producto(1,"leche", "none", 1200, 80, "lacteo", 10, date);

        repositorioProducto.save(producto);
    }
    public void eliminarProducto(){

        Producto producto2 = new Producto();
        producto2.setId(1);
        repositorioProducto.delete(producto2);
    }

    public List<Producto> listarProducto(){
        return repositorioProducto.findAll();
    }


}
