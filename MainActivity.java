package com.example.loginvalidation;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button b;
     un = ["abcd"];
    String psd = ["xyz"];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().in(un) &&
                        password.getText().toString().in(psd)) {
                    Toast.makeText(MainActivity.this,
                            "Login Success",
                            Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(MainActivity.this,
                            "Login Failed",
                            Toast.LENGTH_LONG).show();
            }
        });
    }
}
