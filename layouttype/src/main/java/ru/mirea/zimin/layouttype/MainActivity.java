package ru.mirea.zimin.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView myTextView = (TextView) findViewById(R.id.editTextTextPersonName4);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button2);
        button.setText("Mirea Button");

        CheckBox checkBox = findViewById(R.id.check_box);
        checkBox.setChecked(true);

    }
}