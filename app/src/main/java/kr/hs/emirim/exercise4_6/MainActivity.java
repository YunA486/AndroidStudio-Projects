package kr.hs.emirim.exercise4_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox checkEnabled, checkClickable, checkRotation;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_7);
        checkEnabled = findViewById(R.id.check_enabled);
        checkClickable = findViewById(R.id.check_clickable);
        checkRotation = findViewById(R.id.check_rotation);

        btn = findViewById(R.id.btn);

        checkEnabled.setOnCheckedChangeListener(checkListener);
        checkClickable.setOnCheckedChangeListener(checkListener);
        checkRotation.setOnCheckedChangeListener(checkListener);
    }

    CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton v, boolean b) {
            switch (v.getId()){
                case R.id.check_enabled:
                    if(b)
                        btn.setEnabled(true);
                    else
                        btn.setEnabled(false);
                    break;
                case R.id.check_clickable:
                    if(b)
                        btn.setClickable(true);
                    else
                        btn.setClickable(false);
                    break;
                case R.id.check_rotation:
                    if(b)
                        btn.setRotation(45);
                    else
                        btn.setRotation(0);
                    break;
            }
        }
    };
}