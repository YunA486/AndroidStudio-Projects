package kr.hs.emirim.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
// Change ViewFLipper

public class MainActivity extends AppCompatActivity {
    String[] imgNames = {"masterpiece1", "masterpiece2", "masterpiece3", "masterpiece4", "masterpiece5", "masterpiece6", "masterpiece7", "masterpiece8", "masterpiece9"};
    int[] imgVIds = {R.id.img01, R.id.img02, R.id.img03, R.id.img04, R.id.img05, R.id.img06, R.id.img07, R.id.img08, R.id.img09};
    int[] voteCount = new int[imgVIds.length];
    ImageView[] image = new ImageView[imgNames.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.title);
        setContentView(R.layout.activity_main);

        for(int i=0; i<imgNames.length; i++){
            final int index;
            index = i;
            image[index] = findViewById(imgVIds[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(), imgNames[index] + " 총" + voteCount[index] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }
        Button btnFinish = findViewById(R.id.btn_done);
        btnFinish.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), ResultActivity2.class);
            intent.putExtra("voteCount", voteCount);
            intent.putExtra("imgNames", imgNames);
            startActivity(intent);
        }
    };
}