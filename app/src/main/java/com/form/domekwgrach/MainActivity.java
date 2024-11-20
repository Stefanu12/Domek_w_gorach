package com.form.domekwgrach;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int likeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView likeCounter = findViewById(R.id.like_counter);
        Button buttonLike = findViewById(R.id.button_like);
        Button buttonUnlike = findViewById(R.id.button_unlike);
        Button buttonSave = findViewById(R.id.button_save);

        buttonLike.setOnClickListener(v -> {
            likeCount++;
            likeCounter.setText(likeCount + " polubień");
        });

        buttonUnlike.setOnClickListener(v -> {
            if (likeCount > 0) {
                likeCount--;
                likeCounter.setText(likeCount + " polubień");
            }
        });

        buttonSave.setOnClickListener(v -> {
        });
    }
}
