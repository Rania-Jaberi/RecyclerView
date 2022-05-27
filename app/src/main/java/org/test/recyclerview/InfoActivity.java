package org.test.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private TextView name,description,age;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        name = findViewById(R.id.nameId);
        description= findViewById(R.id.descriptionId);
        age = findViewById(R.id.ageId);
        extras = getIntent().getExtras();
        if (extras != null){
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
            age.setText(extras.getString("age"));

        }
    }
}