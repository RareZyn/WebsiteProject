package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editFirstName; // Declare the EditText variable
    EditText editLastName;
    EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);

    }

    public void onBtnClick(View view) {
        TextView txtFirst = findViewById(R.id.txtFirstName);
        TextView txtLast = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        String firstName = editFirstName.getText().toString(); // Get the text from the EditText
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        txtFirst.setText(firstName);
        txtLast.setText(lastName);
        txtEmail.setText(email);
    }
}
