package com.example.peoplediet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);


        Gallery gal_food_info = (Gallery) findViewById(R.id.gal_food_info);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this);
        gal_food_info.setAdapter(galleryAdapter);

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button1Activity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button2Activity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button3Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.o_exercise:
                startActivity(new Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse("https://www.youtube.com/watch?v=3xI1Vue_XDo"))
                        .setPackage("com.google.android.youtube"));
                return true;
            case R.id.upper_body:
                startActivity(new Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse("https://www.youtube.com/watch?v=Vx2yxXQ0Pkk"))
                        .setPackage("com.google.android.youtube"));
                return true;
            case R.id.lower_body:
                startActivity(new Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse("https://www.youtube.com/watch?v=pDFuLG0xrsU"))
                        .setPackage("com.google.android.youtube"));
                return true;
            case R.id.stomach:
                startActivity(new Intent(Intent.ACTION_VIEW)
                        .setData(Uri.parse("https://www.youtube.com/watch?v=ra0Nrnr2s6o&t=251s"))
                        .setPackage("com.google.android.youtube"));
                return true;
        }
        return false;
    }


}



