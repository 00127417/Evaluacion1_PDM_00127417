package com.example.evaluacion1_pdm_00127417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mLinear1, mLinear2, mLinear3, mLinear4, mLinear5, mLinear6, mLinear7, mLinear8, mLinear9;

    private TextView mTv1, mTv2, mTv3, mTv4, mTv5, mTv6, mTv7, mTv8, mTv9;

    private EditText user, correo;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinear1 = findViewById(R.id.ll_p1);
        mLinear2 = findViewById(R.id.ll_p2);
        mLinear3 = findViewById(R.id.ll_p3);
        mLinear4 = findViewById(R.id.ll_p4);
        mLinear5 = findViewById(R.id.ll_p5);
        mLinear6 = findViewById(R.id.ll_p6);
        mLinear7 = findViewById(R.id.ll_p7);
        mLinear8 = findViewById(R.id.ll_p8);
        mLinear9 = findViewById(R.id.ll_p9);

        mTv1 = findViewById(R.id.tv_p1);
        mTv2 = findViewById(R.id.tv_p2);
        mTv3 = findViewById(R.id.tv_p3);
        mTv4 = findViewById(R.id.tv_p4);
        mTv5 = findViewById(R.id.tv_p5);
        mTv6 = findViewById(R.id.tv_p6);
        mTv7 = findViewById(R.id.tv_p7);
        mTv8 = findViewById(R.id.tv_p8);
        mTv9 = findViewById(R.id.tv_p9);

        mButton = findViewById(R.id.action_enviar);

        user = findViewById(R.id.et_user);
        correo = findViewById(R.id.et_correo);

        mLinear1.setOnClickListener(this);
        mLinear2.setOnClickListener(this);
        mLinear3.setOnClickListener(this);
        mLinear4.setOnClickListener(this);
        mLinear5.setOnClickListener(this);
        mLinear6.setOnClickListener(this);
        mLinear7.setOnClickListener(this);
        mLinear8.setOnClickListener(this);
        mLinear9.setOnClickListener(this);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int aux;
        int mView = v.getId();

        switch (mView) {
            case R.id.ll_p1:
                aux = Integer.parseInt(mTv1.getText().toString());
                aux = aux + 1;
                mTv1.setText(String.valueOf(aux));
                break;

            case R.id.ll_p2:
                aux = Integer.parseInt(mTv2.getText().toString());
                aux = aux + 1;
                mTv2.setText(String.valueOf(aux));
                break;

            case R.id.ll_p3:
                aux = Integer.parseInt(mTv3.getText().toString());
                aux = aux + 1;
                mTv3.setText(String.valueOf(aux));
                break;

            case R.id.ll_p4:
                aux = Integer.parseInt(mTv4.getText().toString());
                aux = aux + 1;
                mTv4.setText(String.valueOf(aux));
                break;

            case R.id.ll_p5:
                aux = Integer.parseInt(mTv5.getText().toString());
                aux = aux + 1;
                mTv5.setText(String.valueOf(aux));
                break;

            case R.id.ll_p6:
                aux = Integer.parseInt(mTv6.getText().toString());
                aux = aux + 1;
                mTv6.setText(String.valueOf(aux));
                break;

            case R.id.ll_p7:
                aux = Integer.parseInt(mTv7.getText().toString());
                aux = aux + 1;
                mTv7.setText(String.valueOf(aux));
                break;

            case R.id.ll_p8:
                aux = Integer.parseInt(mTv8.getText().toString());
                aux = aux + 1;
                mTv8.setText(String.valueOf(aux));
                break;

            case R.id.ll_p9:
                aux = Integer.parseInt(mTv9.getText().toString());
                aux = aux + 1;
                mTv9.setText(String.valueOf(aux));
                break;

            case R.id.action_enviar:

                String p1 = mTv1.getText().toString();
                String p2 = mTv2.getText().toString();
                String p3 = mTv3.getText().toString();
                String p4 = mTv4.getText().toString();
                String p5 = mTv5.getText().toString();
                String p6 = mTv6.getText().toString();
                String p7 = mTv7.getText().toString();
                String p8 = mTv8.getText().toString();
                String p9 = mTv9.getText().toString();
                String userName = user.getText().toString();
                String correoUser = correo.getText().toString();

                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                mIntent.putExtra("pro1", p1);
                mIntent.putExtra("pro2", p2);
                mIntent.putExtra("pro3", p3);
                mIntent.putExtra("pro4", p4);
                mIntent.putExtra("pro5", p5);
                mIntent.putExtra("pro6", p6);
                mIntent.putExtra("pro7", p7);
                mIntent.putExtra("pro8", p8);
                mIntent.putExtra("pro9", p9);
                mIntent.putExtra("user", userName);
                mIntent.putExtra("correo", correoUser);


                startActivity(mIntent);

                break;
        }

    }
}
