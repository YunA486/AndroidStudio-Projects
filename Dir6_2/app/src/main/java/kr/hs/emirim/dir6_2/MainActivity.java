package kr.hs.emirim.dir6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = findViewById(R.id.flipper);
        Button btnStart = findViewById(R.id.btn_start);
        Button btnStop = findViewById(R.id.btn_stop);

        flipper.setFlipInterval(1000);
        btnStart.setOnClickListener(btnListener);
        btnStop.setOnClickListener(btnListener);

    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_start:
                    flipper.startFlipping();
                    break;
                case R.id.btn_stop:
                    flipper.stopFlipping();
                    break;
            }
        }
    };
}