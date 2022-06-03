package com.example.konecta.controller;

import com.example.konecta.modelo.Producto;
import com.example.konecta.servicio.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Test {

    @Autowired
    ServicioProducto servicioProducto;

    @RequestMapping("/hola")
    public String hola(Model modelo) {


        modelo.addAttribute("mensaje","se guardo");
        servicioProducto.guardarProducto();
        return "hola";


    }
    @RequestMapping("/eliminar")
    public String eliminar(Model modelo){

        modelo.addAttribute("mensaje","se elimino");
        servicioProducto.eliminarProducto();
        return "hola";
    }
    @RequestMapping("/listar")
    public String listar(Model modelo){

      List<Producto> productos = new ArrayList();
      productos =  servicioProducto.listarProducto();
      modelo.addAttribute("mensaje",productos);


        return "hola";
    }
}
