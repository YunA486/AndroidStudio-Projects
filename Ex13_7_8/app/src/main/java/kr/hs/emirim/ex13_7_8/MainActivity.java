package kr.hs.emirim.ex13_7_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progress;
    SeekBar seek;
    TextView textSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ProgressBar & SeekBar");

        progress = findViewById(R.id.progress1);
        seek = findViewById(R.id.seek1);
        textSeek = findViewById(R.id.text_seek);
        Button btnInc = findViewById(R.id.btn_inc);
        Button btnDec = findViewById(R.id.btn_dec);

        btnInc.setOnClickListener(btnListener);
        btnDec.setOnClickListener(btnListener);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                textSeek.setText("진행률 : " + progress +"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_inc:
                    progress.incrementSecondaryProgressBy(10);
                    break;
                case R.id.btn_dec:
                    progress.incrementSecondaryProgressBy(-10);
                    break;
            }
        }
    };
}