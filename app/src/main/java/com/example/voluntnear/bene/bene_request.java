package com.example.voluntnear.bene;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.voluntnear.R;

public class bene_request extends AppCompatActivity {

    private ImageButton clinicButton;
    private ImageButton othersButton;
    private ImageButton accomButton;
    private ImageButton groButton;
    private ImageButton backbreqButton;

    //Store request type
    public static String reqType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bene_request);
        clinicButton = findViewById(R.id.clinicButton);
        othersButton = findViewById(R.id.othersButton);
        accomButton = findViewById(R.id.accomButton);
        groButton = findViewById(R.id.groButton);
        backbreqButton = findViewById(R.id.backbreqButton);

        backbreqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(bene_request.this, bene_home.class));
            }
        });

        clinicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reqType = "Clinic Visit";
                startActivity(new Intent(bene_request.this, bene_create.class));
            }
        });

        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reqType = "Other Requests";
                startActivity(new Intent(bene_request.this, bene_create.class));
            }
        });

        accomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reqType = "Accompany";
                startActivity(new Intent(bene_request.this, bene_create.class));
            }
        });

        groButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reqType = "Grocery Run";
                startActivity(new Intent(bene_request.this, bene_create.class));
            }
        });


    }
}