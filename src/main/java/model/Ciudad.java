package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "Ciudad")
public class Ciudad implements Serializable {
    @Id
    @Column(name = "RangoKM")
    int rangoKM ;
    @Column(name = "Nombre")
    String nombre;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Ciudad")
    public Ciudad ciudad;

    public Ciudad(int RangoKM, String nombre, Ciudad ciudad) {
        super();
        this.rangoKM = rangoKM;
        this.nombre = nombre;
    }

    public Ciudad() {
        super();
    }

    public int getRangoKM() {return rangoKM;}

    public void setRangoKM(int rangoKM) {this.rangoKM = rangoKM;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {
        return "Ciudad [ RangoKM=" + rangoKM + ", Nombre=" + nombre + "]";
    }
}
