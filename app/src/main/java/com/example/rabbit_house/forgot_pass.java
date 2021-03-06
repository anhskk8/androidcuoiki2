package com.example.rabbit_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class forgot_pass extends AppCompatActivity {
    Button btnDangNhap, btnHuy;
    TextView tvTam1, tvTam2, tvTam3;
    EditText edtTam1, edtTam2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        this.setTitle(getResources().getString(R.string.ttQuenpass));
        btnDangNhap = (Button) findViewById(R.id.btnLogin);
        btnHuy = (Button) findViewById(R.id.btnExit);
        tvTam1 = (TextView) findViewById(R.id.tvTam1);
        tvTam2 = (TextView) findViewById(R.id.tvTam2);
        tvTam3 = (TextView) findViewById(R.id.tvTam3);
        edtTam1 = (EditText) findViewById(R.id.edtTam1);
        edtTam2 = (EditText) findViewById(R.id.edtTam2);
        tvTam1.setText("Username");
        tvTam2.setText("UserID");
        tvTam3.setText("");
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtTam1.getText().toString().equals("admin") && edtTam2.getText().toString().equals("NV0001"))
                {
                    tvTam1.setText("Pass");
                    tvTam2.setText("NL Pass");
                    edtTam1.setText("");
                    edtTam2.setText("");
                    tvTam3.setText("");
                    btnDangNhap.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            if (edtTam1.getText().toString().equals(edtTam2.getText().toString())){
                                Intent login = new Intent(forgot_pass.this, loginGamen.class);
                                Bundle bundle= new Bundle();
                                bundle.putSerializable("pass",);
                                startActivity(login);
                            }
                            else{
                                tvTam3.setText("Pass khong khop");
                            }
                        }
                    });
                }
                else{
                    tvTam3.setText("Sai User ho???c ID");
                }
            }
        });

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}