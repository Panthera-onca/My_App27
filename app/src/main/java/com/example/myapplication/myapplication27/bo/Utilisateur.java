package com.example.myapplication.myapplication27.bo;

import androidx.room.Entity;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@Entity
public class Utilisateur {

    @PrimaryKey (autoGenerate = true)
    private int userId;

    @ColumnInfo (name = "nom")
    private String nom;

    @ColumnInfo (name = "prenom")
    private String prenom;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;


    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "userId=" + userId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
