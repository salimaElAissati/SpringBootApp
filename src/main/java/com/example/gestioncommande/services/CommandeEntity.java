package com.example.gestioncommande.services;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "commande", schema = "public", catalog = "listeCommande")
public class CommandeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name_cli")
    private String nameCli;
    @Basic
    @Column(name = "products")
    private String products;
    @Basic
    @Column(name = "prix")
    private String prix;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCli() {
        return nameCli;
    }

    public void setNameCli(String nameCli) {
        this.nameCli = nameCli;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandeEntity that = (CommandeEntity) o;
        return id == that.id && Objects.equals(nameCli, that.nameCli) && Objects.equals(products, that.products) && Objects.equals(prix, that.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameCli, products, prix);
    }
}
