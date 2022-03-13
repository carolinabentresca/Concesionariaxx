package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO4",
         schema = "ROOT"
)
public class Producto4 implements java.io.Serializable {

    private int id;
    private String marca;
    private String modelo;
    private String color;
    private Double precio;
    private Double cuota;

    public Producto4() {
    }

    public Producto4(int id) {
        this.id = id;
    }

    public Producto4(int id, String marca, String modelo, String color, Double precio, Double cuota) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.cuota = cuota;
    }

    @Id

    @Column(name = "ID", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "MARCA", length = 30)
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name = "MODELO", length = 50)
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Column(name = "COLOR", length = 30)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "PRECIO", precision = 52, scale = 0)
    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Column(name = "CUOTA", precision = 52, scale = 0)
    public Double getCuota() {
        return this.cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

}
