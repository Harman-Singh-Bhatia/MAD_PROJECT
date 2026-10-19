package com.mad_project_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity11 extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main11);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        e1 = findViewById(R.id.editTextMedName);
        e2 = findViewById(R.id.editTextDosage);
        e3 = findViewById(R.id.editTextDuration);
        b1 = findViewById(R.id.buttonSaveMed);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
                    Toast.makeText(MainActivity11.this, "Please enter all details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity11.this, "Medication Saved Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
