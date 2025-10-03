package com.example.btchuyenactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends Activity {
    @Override
    public void onCreate(Bundle saveInstance_144){
        super.onCreate(saveInstance_144);
        setContentView(R.layout.profile);

        ImageButton imgBtnBack_144 = findViewById(R.id.imgBtnBack_144);
        imgBtnBack_144.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v_144){
                finish();
            }
        });
    }
}
