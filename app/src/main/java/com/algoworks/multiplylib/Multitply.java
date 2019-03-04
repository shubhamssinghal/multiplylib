package com.algoworks.multiplylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Multitply extends AppCompatActivity {

    EditText edt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);

        btn=findViewById(R.id.btn);
        edt=findViewById(R.id.edt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Multitply.this, "Text "+edt.getText().toString().trim(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
