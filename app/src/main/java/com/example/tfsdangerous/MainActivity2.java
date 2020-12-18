package com.example.tfsdangerous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;

public class MainActivity2 extends AppCompatActivity {
    public RatingBar TFSMandatedRating2;
    public TextView nom2, prenom2, email2, phone2, rolet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom2 = findViewById(R.id.nom2);
        prenom2 = findViewById(R.id.prenom2);
        email2 = findViewById(R.id.email2);
        phone2 = findViewById(R.id.phone2);
        rolet = findViewById(R.id.rolet);
        TFSMandatedRating2 = findViewById(R.id.TFSMandatedRating2);
        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String Lname = extras.getString("Message1");
            nom2.setText(Lname);
            String Fname = extras.getString("Message2");
            prenom2.setText(Fname);
            String email = extras.getString("Message3");
            email2.setText(email);
            String phone = extras.getString("Message4");
            phone2.setText(phone);
            String role = extras.getString("Message5");
            rolet.setText(role);
        }
    }
}