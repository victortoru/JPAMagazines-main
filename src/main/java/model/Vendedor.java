package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Access(AccessType.FIELD)
@Table(name = "Vendedor")
public class Vendedor implements Serializable {
    @Id
    @Column(name = "Profesional")
    boolean profesional ;
    @Column(name = "Particular")
    boolean particular;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Vendedor")
    public Vendedor vendedor ;

    public Vendedor(boolean profesional, boolean particular, Vendedor vendedor) {
        super();
        this.profesional = profesional;
        this.particular = particular;
    }

    public Vendedor() {
        super();
    }

    public boolean getProfesional() {return profesional;}

    public void setProfesional(boolean profesional) {this.profesional = profesional;}

    public boolean getParticular() {return particular;}

    public void setParticular(boolean particular) {this.particular = particular;}

    @Override
    public String toString() {
        return "Vendedor [ Profesional=" + profesional + ", Particular=" + particular + "]";
    }
}