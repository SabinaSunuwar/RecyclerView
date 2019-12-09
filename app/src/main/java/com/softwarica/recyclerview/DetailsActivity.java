package com.softwarica.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgProfile;
    TextView tvName, tvPhonNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgProfile = findViewById(R.id.imgProfile);
        tvName = findViewById(R.id.tvName);
        tvPhonNo = findViewById(R.id.tvPhone);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            imgProfile.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvPhonNo.setText(bundle.getString("phone"));
        }
    }
}
