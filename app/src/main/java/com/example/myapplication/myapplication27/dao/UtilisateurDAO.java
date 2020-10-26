package com.example.myapplication.myapplication27.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import com.example.myapplication.myapplication27.bo.Utilisateur;

@Dao
public interface UtilisateurDAO {
    @Query("SELECT * FROM utilisateur")
    List<Utilisateur> getAll();

    @Query("SELECT * FROM utilisateur WHERE userId IN (:userIds)")
    List<Utilisateur> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM utilisateur WHERE prenom LIKE :prenom AND nom LIKE :nom LIMIT 1")
    Utilisateur findByName(String nom, String prenom);

    @Insert
    void insertAll(Utilisateur... users);

    @Delete
    void delete(Utilisateur users);
}
