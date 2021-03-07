package com.prestigecab.prestigecab.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ITEMS")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "NAME", nullable = false, length = 50)
    private String nom;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 120)
    private String description;
    @Basic
    @Column(name = "PRICE",nullable = false)
    private long prix;
    @Basic
    @Column(name = "IMAGE_1",nullable = false,length = 250)
    private String image1;
    @Basic
    @Column(name = "IMAGE_2",nullable = false,length = 250)
    private String image2;
    @Basic
    @Column(name = "IMAGE_3",nullable = false,length = 250)
    private String image3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id && prix == items.prix && nom.equals(items.nom) && description.equals(items.description) && image1.equals(items.image1) && image2.equals(items.image2) && image3.equals(items.image3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, description, prix, image1, image2, image3);
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", image1='" + image1 + '\'' +
                ", image2='" + image2 + '\'' +
                ", image3='" + image3 + '\'' +
                '}';
    }
}