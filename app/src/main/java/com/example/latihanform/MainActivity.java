package com.example.latihanform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent; //digunakan untuk perpidahan halaman

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
//ketika button di klik
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //penamaan objek perpindahan halaman pada button
                                                        //halaman yg sekarang //halaman yg dituju
                Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(pindah); //menjalankan activiy intent
            }
        });
    }
}