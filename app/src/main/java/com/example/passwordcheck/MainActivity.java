package com.example.passwordcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView topMessage;
    private EditText pw1Input;
    private EditText pw2Input;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topMessage = (TextView) findViewById(R.id.topMessage);
        pw1Input = (EditText) findViewById(R.id.pw1Input);
        pw2Input = (EditText) findViewById(R.id.pw2Input);
        checkButton = (Button) findViewById(R.id.checkButton);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pw1 = pw1Input.getText().toString();
                String pw2 = pw2Input.getText().toString();
                if (pw1.equals(pw2)) {
                    topMessage.setText("THANK YOU");
                }
                else {
                    topMessage.setText("PASSWORDS MUST MATCH");
                }
            }
        });
    }
}