package kr.hs.emirim.chapter4_9ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    int angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRoate = findViewById(R.id.btn_rotate);
        imgv = findViewById(R.id.imgv);

        btnRoate.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener(){
        public void onClick(View v){
            angle += 10;
            imgv.setRotation(angle);
        }
    };
}