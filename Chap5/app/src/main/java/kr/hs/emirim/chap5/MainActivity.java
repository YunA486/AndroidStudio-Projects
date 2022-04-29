package kr.hs.emirim.chap5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearDog, linearCat, linearSnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        linearDog = findViewById(R.id.linear_dog);
        linearCat = findViewById(R.id.linear_cat);
        linearSnail = findViewById(R.id.linear_snail);

        Button btnDog = findViewById(R.id.btn_dog);
        Button btnCat = findViewById(R.id.btn_cat);
        Button btnSnail = findViewById(R.id.btn_snail);

        btnDog.setOnClickListener(btnLinear);
        btnCat.setOnClickListener(btnLinear);
        btnSnail.setOnClickListener(btnLinear);
    }

    View.OnClickListener btnLinear = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearDog.setVisibility(View.INVISIBLE);
            linearCat.setVisibility(View.INVISIBLE);
            linearSnail.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_dog:
                    linearDog.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_cat:
                    linearCat.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_snail:
                    linearSnail.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}