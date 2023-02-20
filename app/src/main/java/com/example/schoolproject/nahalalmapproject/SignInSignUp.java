package com.example.schoolproject.nahalalmapproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInSignUp extends AppCompatActivity {
    Button sisu_btn_google, sisu_btn_email;
    TextView sisu_tv_subtitle, sisu_tv_title,sisu_tv_create_account;
    Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_sign_up);

        connectViews();

        sisu_btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignInSignUp.this, "PLACE HOLDER CREATE LINK", Toast.LENGTH_SHORT).show();

                d =new Dialog(SignInSignUp.this);
                d.setContentView(R.layout.alert_dialog_email_login);

                EditText ad_el_et_email =  d.findViewById(R.id.ad_el_et_email);
                EditText ad_el_et_password = d.findViewById(R.id.ad_el_et_password);
                Button ad_el_btn_submit = d.findViewById(R.id.ad_el_btn_submit);

                d.show();

                ad_el_btn_submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(SignInSignUp.this, "CLicked submit", Toast.LENGTH_SHORT).show();
                        //check if email and password are valid
                        if(ad_el_et_email.getText().toString().equals("t@test.com") && ad_el_et_password.getText().toString().equals("12345678")){
                            Toast.makeText(SignInSignUp.this, "Email and password are valid", Toast.LENGTH_SHORT).show();
                            //login user to account
                            d.dismiss();
                        }else{
                            Toast.makeText(SignInSignUp.this, "Email and password are invalid", Toast.LENGTH_SHORT).show();
                            //show error message

                        }
                    }
                });
            }
        });
    }

    private void connectViews() {
        sisu_btn_google = (Button) findViewById(R.id.sisu_btn_google);
        sisu_btn_email = (Button) findViewById(R.id.sisu_btn_email);
        sisu_tv_subtitle = (TextView) findViewById(R.id.sisu_tv_subtitle);
        sisu_tv_title = (TextView) findViewById(R.id.sisu_tv_title);
        sisu_tv_create_account = (TextView) findViewById(R.id.sisu_tv_create_account);

        sisu_btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignInSignUp.this, "PLACE HOLDER CREATE LINK", Toast.LENGTH_SHORT).show();
            }
        });
    }
}