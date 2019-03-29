package com.example.evaluacion1_pdm_00127417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mp1, mp2, mp3, mp4, mp5, mp6, mp7, mp8,mp9, user, correo, tot;

    private Button bCompartir;

    private String jsonFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mp1 = findViewById(R.id.tv_p1_second);
        mp2 = findViewById(R.id.tv_p2_second);
        mp3 = findViewById(R.id.tv_p3_second);
        mp4 = findViewById(R.id.tv_p4_second);
        mp5 = findViewById(R.id.tv_p5_second);
        mp6 = findViewById(R.id.tv_p6_second);
        mp7 = findViewById(R.id.tv_p7_second);
        mp8 = findViewById(R.id.tv_p8_second);
        mp9 = findViewById(R.id.tv_p9_second);

        user = findViewById(R.id.tv_user_second);
        correo = findViewById(R.id.tv_correo_second);
        tot = findViewById(R.id.tv_totalPro);

        bCompartir = findViewById(R.id.action_compatir);

        Intent mIntent = getIntent();

        if(mIntent != null){
            mp1.setText(mIntent.getStringExtra("pro1"));
            mp2.setText(mIntent.getStringExtra("pro2"));
            mp3.setText(mIntent.getStringExtra("pro3"));
            mp4.setText(mIntent.getStringExtra("pro4"));
            mp5.setText(mIntent.getStringExtra("pro5"));
            mp6.setText(mIntent.getStringExtra("pro6"));
            mp7.setText(mIntent.getStringExtra("pro7"));
            mp8.setText(mIntent.getStringExtra("pro8"));
            mp9.setText(mIntent.getStringExtra("pro9"));
            user.setText(mIntent.getStringExtra("user"));
            correo.setText(mIntent.getStringExtra("correo"));
            tot.setText((String.valueOf(Integer.parseInt(mIntent.getStringExtra("pro1")) + Integer.parseInt(mIntent.getStringExtra("pro2")) +
                    Integer.parseInt(mIntent.getStringExtra("pro3")) + Integer.parseInt(mIntent.getStringExtra("pro4")) + Integer.parseInt(mIntent.getStringExtra("pro5"))
            + Integer.parseInt(mIntent.getStringExtra("pro6")) + Integer.parseInt(mIntent.getStringExtra("pro7")) + Integer.parseInt(mIntent.getStringExtra("pro8")) +
                    Integer.parseInt(mIntent.getStringExtra("pro9")))));
        }

        jsonFinal = "{ Usuario: " + user.getText().toString() + ", Correo: " + correo.getText().toString() + ", Producto 1: " + mp1.getText().toString() + ", Producto 2: " + mp2.getText().toString() +
                ", Producto 3: " + mp3.getText().toString() + ", Producto 4: " + mp4.getText().toString() + ", Producto 5: " + mp5.getText().toString() + ", Producto 6: " + mp6.getText().toString() +
                ", Producto 7: " + mp7.getText().toString() + ", Producto 8: " + mp8.getText().toString() + ", Producto 9: " + mp9.getText().toString() + ", Total productos: "+ tot.getText().toString() +"}";

        bCompartir.setOnClickListener(v->{
            Intent tIntent = new Intent();
            tIntent.setType("text/plain");
            tIntent.setAction(Intent.ACTION_SEND);
            tIntent.putExtra(Intent.EXTRA_TEXT,jsonFinal);
            startActivity(tIntent);
        });

    }
}
