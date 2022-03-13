package model;

import entity.Producto1;
import entity.Producto2;
import entity.Producto3;
import entity.Producto4;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Query;

public class ProductoDao {

    //Lista Producto1
    public static List<Producto1> listarProducto1() {
        List<Producto1> lista = null;
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("from Producto1");
            lista = query.list();
            ss.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
        return lista;
    }

    //Lista Producto2
    public static List<Producto2> listarProducto2() {
        List<Producto2> lista = null;
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("from Producto2");
            lista = query.list();
            ss.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
        return lista;
    }

    //Lista Producto3
    public static List<Producto3> listarProducto3() {
        List<Producto3> lista = null;
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("from Producto3");
            lista = query.list();
            ss.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
        return lista;
    }

    //Lista Producto4
    public static List<Producto4> listarProducto4() {
        List<Producto4> lista = null;
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("from Producto4");
            lista = query.list();
            ss.close();
        } catch (HibernateException e) {
            e.getMessage();
        }
        return lista;
    }
}
