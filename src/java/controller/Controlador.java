package controller;

import java.util.List;
import model.ProductoDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    ModelAndView mv = new ModelAndView();
    List datos;

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView index() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "producto1.htm", method = RequestMethod.GET)
    public ModelAndView lista1() {
        try {
            datos = ProductoDao.listarProducto1();
            mv.addObject("lista", datos);
            mv.setViewName("producto1");
        } catch (Exception e) {
            e.getMessage();
        }

        return mv;
    }

    @RequestMapping(value = "producto2.htm", method = RequestMethod.GET)
    public ModelAndView lista2() {
        try {
            datos = ProductoDao.listarProducto2();
            mv.addObject("lista", datos);
            mv.setViewName("producto2");
        } catch (Exception e) {
            e.getMessage();
        }

        return mv;
    }

    @RequestMapping(value = "producto3.htm", method = RequestMethod.GET)
    public ModelAndView lista3() {
        try {
            datos = ProductoDao.listarProducto3();
            mv.addObject("lista", datos);
            mv.setViewName("producto3");
        } catch (Exception e) {
            e.getMessage();
        }

        return mv;
    }

    @RequestMapping(value = "producto4.htm", method = RequestMethod.GET)
    public ModelAndView lista4() {
        try {
            datos = ProductoDao.listarProducto4();
            mv.addObject("lista", datos);
            mv.setViewName("producto4");
        } catch (Exception e) {
            e.getMessage();
        }

        return mv;
    }
}
