package kr.hs.emirim.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondsAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconds);

        Button btnClose = findViewById(R.id.btn_close);
        btnClose.setOnClickListener(btnCloseListener);
    }
    View.OnClickListener btnCloseListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}