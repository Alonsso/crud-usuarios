package co.edu.konrad.crudusuarios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Libro {
    @Id // Llave principal
    @GeneratedValue(strategy = GenerationType.AUTO) // campo autoincremental
    private Long id;

    @Column
    private String nom_libro;

    @Column
    private String autor;

    @Column
    private String editorial;

    @Column
    private String ano_pub;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nom_libro
     */
    public String getNom_libro() {
        return nom_libro;
    }

    /**
     * @param nom_libro the nom_libro to set
     */
    public void setNom_libro(String nom_libro) {
        this.nom_libro = nom_libro;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return String return the ano_pub
     */
    public String getAno_pub() {
        return ano_pub;
    }

    /**
     * @param ano_pub the ano_pub to set
     */
    public void setAno_pub(String ano_pub) {
        this.ano_pub = ano_pub;
    }

}
