package com.example.tfsdangerous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;




public class MainActivity extends AppCompatActivity {
    private EditText txtnom, txtprenom, txtemail, txtphone;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button button;
    private String monTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnom = findViewById(R.id.nom);
        txtprenom = findViewById(R.id.prenom);
        txtemail = findViewById(R.id.email);
        txtphone = findViewById(R.id.phone);
        button=findViewById(R.id.button);
        radioGroup =findViewById(R.id.radioGroup);


        // mettre les valeurs dans des variables
        String nom=txtnom.getText().toString();
        String prenom=txtprenom.getText().toString();
        String email=txtemail.getText().toString();
        String phone=txtphone.getText().toString();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=findViewById(checkedId);
                switch(radioButton.getId()){
                    case R.id.teacher:
                        //Log.d("RDO", "Teacher");
                        monTab="Teacher";
                        break;
                    case R.id.student:
                        //Log.d( "RDO", "Student");
                        monTab="Student";
                        break;
                    case R.id.visitor:
                        monTab="Visitor";
                       // Log.d("RDO", "Visitor");
                        break;

                }

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,MainActivity2.class);
                intent.putExtra("Message1", txtnom.getText().toString());
                intent.putExtra("Message2", txtprenom.getText().toString());
                intent.putExtra("Message3", txtemail.getText().toString());
                intent.putExtra("Message4", txtphone.getText().toString());
                intent.putExtra("Message5", monTab);
                startActivity(intent);
                }


        });


        }
    }