package com.example.myapplication.myapplication27.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.myapplication.myapplication27.bo.Utilisateur;

@Database(entities = {Utilisateur.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UtilisateurDAO utilisateurDAO();

}
