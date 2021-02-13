package com.example.appsindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

    public class MainActivity extends AppCompatActivity {
        private Button buttonprincipal;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ImageView logoImage = (ImageView) findViewById(R.id.logoImage);
            logoImage.setImageResource(R.drawable.logo);

            Button buttonPrincipal = (Button) findViewById(R.id.buttonPrincipal);
            buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMenuActivity();
                }

            });
        }

        public void openMenuActivity(){
            Intent intent = new Intent(this, empty.class);
            startActivity(intent);
        }
    }
