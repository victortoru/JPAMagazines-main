package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    @JoinColumn(name = "id_coche")
    public Coches coches;
}
