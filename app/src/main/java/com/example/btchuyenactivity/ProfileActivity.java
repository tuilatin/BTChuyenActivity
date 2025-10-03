package com.example.btchuyenactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstance_144){
        super.onCreate(saveInstance_144);
        setContentView(R.layout.profile);

        ImageButton imgBtnBack_144 = findViewById(R.id.imgBtnBack_144);
        TextView textView_144 = findViewById(R.id.textView2_144);

        String userName_144 = getIntent().getStringExtra("username");
        textView_144.setText(userName_144);

        imgBtnBack_144.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v_144){
                finish();
            }
        });
    }
}
