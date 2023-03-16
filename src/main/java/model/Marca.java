package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "Marca")
public class Marca implements Serializable {
    @Id
    @Column(name = "Unidades")
    int unidades ;
    @Column(name = "Modelo")
    String modelo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Marca")
    public Marca marca ;

    public Marca(int Unidades, String modelo, Marca marca) {
        super();
        this.unidades = unidades;
        this.modelo = modelo;
    }

    public Marca() {
        super();
    }

    public int getUnidades() {return unidades;}

    public void setUnidades(int unidades) {this.unidades = unidades;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    @Override
    public String toString() {
        return "Marca [ Unidades=" + unidades + ", Modelo=" + modelo + "]";
    }
}