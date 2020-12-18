package com.example.tfsdangerous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    public RatingBar TFSMandatedRating;
    public EditText nom, prenom, email, phone;
    public RadioGroup radioGroup;
    public RadioButton radioButton;
    public Button button;
    public String monTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        TFSMandatedRating = findViewById(R.id.TFSMandatedRating);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        radioGroup =findViewById(R.id.radioGroup);
        radioGroup=setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            
                                              }
        radioGroup=setOnChe(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChange(RadioGroup group, int checkedID){
                switch(radioButton.getId()){
                    case R.id.teacher:
                        Log.d("RDO", "Teacher");
                        break;
                    case R.id.student:
                        Log.d( "RDO", "Student");
                        break;
                    case R.id.visitor:
                        Log.d("RDO", "Visitor");
                        break;

                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,MainActivity2.class);
                intent.putExtra("Message1", nom.getText());
                intent.putExtra("Message2", prenom.getText());
                intent.putExtra("Message3", email.getText());
                intent.putExtra("Message4", phone.getText());
                intent.putExtra("Message 5", monTab);
                startActivity(intent);
                }


        });


        }
    }