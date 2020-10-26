package com.example.myapplication.myapplication27;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import java.util.List;

import com.example.myapplication.myapplication27.bo.Utilisateur;
import com.example.myapplication.myapplication27.dao.AppDatabase;
import com.example.myapplication.myapplication27.dao.Connexion;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "ACOS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Utilisateur u1 = new Utilisateur();
                u1.setNom("Cosson");
                u1.setPrenom("Anthony");

                Utilisateur u2 = new Utilisateur();
                u2.setPrenom("Nickolas");
                u2.setNom("Cosson");
                AppDatabase db = Connexion.getConnexion(MainActivity.this);
                db.utilisateurDAO().insertAll(u1, u2);
                List<Utilisateur> utilisateurs = db.utilisateurDAO().getAll();
                for(Utilisateur item : utilisateurs){
                    Log.i(TAG, item.toString());
                }
            }
        }).start();
    }
}