package ru.gulov.university;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DetailUniverseActivity extends AppCompatActivity {

    int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_universe);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            position = bundle.getInt("count", 1);
            Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_SHORT).show();
        }


    }
}