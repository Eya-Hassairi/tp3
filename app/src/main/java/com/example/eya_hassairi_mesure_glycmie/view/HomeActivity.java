package com.example.eya_hassairi_mesure_glycmie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eya_hassairi_mesure_glycmie.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init ();
        btnConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);//mnin jey w lwin mechi
                //ou bien Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();//ken 3andy niet retour ma naamlhech
            }
        });
    }

    private void init()
    {
        btnConsultation= findViewById(R.id.btnConsultation);
    }
}