
package ru.gulov.university;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class DetailUniverseActivity extends AppCompatActivity {

    int position = 0;

    TextView f1, f2, f3, f4, f5, f6, f7, s1, s2, s3, s4, s5, s6, s7;
    ConstraintLayout fac8, fac9, fac10, fac11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            position = bundle.getInt("count", 1);
            Toast.makeText(getApplicationContext(), position+"", Toast.LENGTH_SHORT).show();
        }

        if(position==1) {
            setContentView(R.layout.activity_detail_universe);

            fac8 = findViewById(R.id.fac8);
            fac9 = findViewById(R.id.fac9);
            fac10 = findViewById(R.id.fac10);
            fac11 = findViewById(R.id.fac11);

            fac8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.uim.ru/"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
            fac9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://vk.com/prouim"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
            fac10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://krasnodar.ucheba.ru/uz/17686"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
            fac11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 46.61037580, 39.14418178);
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);

                }
            });



            f1 = findViewById(R.id.fac1);
            f2 = findViewById(R.id.fac2);
            f3 = findViewById(R.id.fac3);
            f4 = findViewById(R.id.fac4);
            f5 = findViewById(R.id.fac5);
            f6 = findViewById(R.id.fac6);
            f7 = findViewById(R.id.fac7);

            s1 = findViewById(R.id.sample1);
            s2 = findViewById(R.id.sample2);
            s3 = findViewById(R.id.sample3);
            s4 = findViewById(R.id.sample4);
            s5 = findViewById(R.id.sample5);
            s6 = findViewById(R.id.sample6);
            s7 = findViewById(R.id.sample7);


            f1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.VISIBLE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.GONE);
                }
            });

            f2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.VISIBLE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.GONE);
                }
            });

            f3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.VISIBLE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.GONE);
                }
            });

            f4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.VISIBLE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.GONE);
                }
            });

            f5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.VISIBLE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.GONE);
                }
            });

            f6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.VISIBLE);
                    s7.setVisibility(View.GONE);
                }
            });

            f7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s1.setVisibility(View.GONE);
                    s2.setVisibility(View.GONE);
                    s3.setVisibility(View.GONE);
                    s4.setVisibility(View.GONE);
                    s5.setVisibility(View.GONE);
                    s6.setVisibility(View.GONE);
                    s7.setVisibility(View.VISIBLE);
                }
            });


        }

        else if (position==2){
            setContentView(R.layout.activity_detail_universe2);
        }


    }
}