package ru.gulov.university;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UniversitiesActivity extends AppCompatActivity {


    ConstraintLayout u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universities);

        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        u3 = findViewById(R.id.u3);
        u4 = findViewById(R.id.u4);
        u5 = findViewById(R.id.u5);
        u6 = findViewById(R.id.u6);
        u7 = findViewById(R.id.u7);
        u8 = findViewById(R.id.u8);
        u9 = findViewById(R.id.u9);
        u10 = findViewById(R.id.u10);
        u11 = findViewById(R.id.u11);


        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 1);
                startActivity(intent);
            }
        });

        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 2);
                startActivity(intent);
            }
        });


        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 3);
                startActivity(intent);
            }
        });


        u4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 4);
                startActivity(intent);
            }
        });


        u5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 5);
                startActivity(intent);
            }
        });


        u6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 6);
                startActivity(intent);
            }
        });


        u7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 7);
                startActivity(intent);
            }
        });


        u8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 8);
                startActivity(intent);
            }
        });


        u9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 9);
                startActivity(intent);
            }
        });


        u10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 10);
                startActivity(intent);
            }
        });


        u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UniversitiesActivity.this, DetailUniverseActivity.class);
                intent.putExtra("count", 11);
                startActivity(intent);
            }
        });


    }
}