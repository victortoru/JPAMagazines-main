package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "Coches")
public class Coches implements Serializable{
    @Id
    @Column(name = "Carroceria")
    String carroceria;
    @Column(name = "Combustible")
    String combustible;
    @Column(name = "Plazas")
    int plazas;
    @Column(name = "Precio")
    int precio;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca")
    Marca marca;

    public Coches(String carroceria, String combustible, int plazas, int precio, int i) {
        super();
        this.carroceria = carroceria;
        this.combustible = combustible;
        this.plazas = plazas;
        this.precio = precio;
    }

    public Coches() {
        super();
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPrecio() {return  precio; }

    public void setPrecio(int precio) {this.precio = precio; }

    @Override
    public String toString() {
        return "Coches [ Carroceria=" + carroceria + ", Combustible=" + combustible + ", Plazas=" + plazas
                + ", Precio=" + precio + "]";
    }
}
