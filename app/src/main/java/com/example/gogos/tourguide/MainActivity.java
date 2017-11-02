package com.example.gogos.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openPyramidsActivity();
        openTempleOfPhilaeActivity();
        openEgyptianMuseumActivity();
        openTempleOfKarnakActivity();
    }

    public void openPyramidsActivity() {
        TextView pyramidsTextView = findViewById(R.id.pyramid_text_view);
        pyramidsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pyrmaidsIntent = new Intent(MainActivity.this, PyramidsActivity.class);
                startActivity(pyrmaidsIntent);
            }
        });
    }

    public void openTempleOfPhilaeActivity() {
        TextView philaeTextView = findViewById(R.id.temple_of_philae_textView);
        philaeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent philaeIntent = new Intent(MainActivity.this, TempleOfPhilaeActivity.class);
                startActivity(philaeIntent);
            }
        });
    }

    public void openEgyptianMuseumActivity() {
        TextView egyptianMuseumTextView = findViewById(R.id.egyptian_museum_text_view);
        egyptianMuseumTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent egyptianMuseumIntent = new Intent(MainActivity.this, EgyptianMuseumActivity.class);
                startActivity(egyptianMuseumIntent);
            }
        });
    }

    public void openTempleOfKarnakActivity() {
        TextView karnakTextView = findViewById(R.id.temple_of_karnak_text_view);
        karnakTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karnakIntent = new Intent(MainActivity.this, TempleOfKarnakActivity.class);
                startActivity(karnakIntent);
            }
        });
    }
}
