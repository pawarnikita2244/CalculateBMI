package com.ulpatsolution.wscube.BMI;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ulpatsolution.wscube.R;

public class bmidemo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmidemo);

        LinearLayout L;
        TextView txtresult;
        EditText edtweight,edtheightft,edtheightI;
        Button btncalculate;

        edtweight=findViewById(R.id.edtweight);
        edtheightft=findViewById(R.id.edtweight1);
        edtheightI=findViewById(R.id.edtweight2);
        btncalculate=findViewById(R.id.btncal);
        txtresult=findViewById(R.id.textresult);
        L=findViewById(R.id.linearname);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt= Integer.parseInt(edtweight.getText().toString());
                int feet=Integer.parseInt(edtheightft.getText().toString());
                int inch=Integer.parseInt(edtheightI.getText().toString());

                int totalinch=feet*12+inch;
                double totalcm=totalinch*2.53;

                double totalm=totalcm/100;
                double bmi=wt/(totalm*totalm);

                if(bmi>25)
                {
                    txtresult.setText("you are over weight");

                }
                else if(bmi<18)
                {
                    txtresult.setText("you are underweight");
                }
                else
                {
                    txtresult.setText("you are healthy");
                }
            }
        });
    }
}
