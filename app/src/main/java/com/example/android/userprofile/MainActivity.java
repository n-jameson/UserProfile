package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = (TextView) findViewById(R.id.name);
        String nameString = (String) getString(R.string.name);
        name.setText(nameString);
        TextView birthday = (TextView) findViewById(R.id.birthday);
        String birthdayString = (String) getString(R.string.birthday);
        birthday.setText(birthdayString);
        TextView country = (TextView) findViewById(R.id.country);
        String countryString = (String) getString(R.string.country);
        country.setText(countryString);

        ImageView profilePicture = (ImageView) findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.hss);
    }
}
