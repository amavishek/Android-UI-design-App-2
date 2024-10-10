package com.exceldroid.uilover;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


    public class LoginActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.login_activity);

            Button btnLogin;

            btnLogin = findViewById(R.id.btnLogin);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent Login = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(Login);
                }
            });








        }
}
