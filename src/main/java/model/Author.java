package model;

import javax.persistence.Id;
import java.io.Serializable;

public class Author implements Serializable {
    @Id
    int authorId;
    String name, nationality, birthYear;
    boolean active;

    public Author(int authorId, String name, String nationality, String birthYear,
                  boolean active) {
        super();
        this.birthYear = birthYear;
        this.name = name;
        this.nationality = nationality;
        this.active = active;
        this.authorId = authorId;
    }

    public Author() {

    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Autor [id_autor=" + authorId + ", nom=" + name + ", any_naixement=" + birthYear
                + ", nacionalitat=" + nationality + ", actiu=" + active
                + "]";
    }


}
