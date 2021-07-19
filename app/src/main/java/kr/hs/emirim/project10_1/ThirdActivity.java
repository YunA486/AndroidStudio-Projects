package kr.hs.emirim.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btnThirdClose = findViewById(R.id.btn_third_close);
        btnThirdClose.setOnClickListener(btnThirdCloseListener);
    }

    View.OnClickListener btnThirdCloseListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}