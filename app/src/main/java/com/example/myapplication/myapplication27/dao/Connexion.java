package com.example.myapplication.myapplication27.dao;

import androidx.room.Room;
import android.content.Context;

public class Connexion {
    public static AppDatabase getConnexion(Context context){
        return Room.databaseBuilder(context, AppDatabase.class, "database-name").build();
    }
}
