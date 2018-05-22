package com.taruc.myfirstapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // declare
    private Button buttonSend;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        buttonSend = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
    }

    public void sendMessage (View V) {
        // get message from editText
        String message = editText.getText().toString();

        // Use intent to communicate with another activity
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", message);
        startActivity(intent);

    }
}
