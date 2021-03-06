package kr.hs.emirim.project_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView imgV = findViewById(R.id.imgV);
        TextView text1 = findViewById(R.id.text_result1);
        TextView text2 = findViewById(R.id.text_result2);
        Intent intent = getIntent();
        double w = intent.getDoubleExtra("weight", 0);
        double h = intent.getDoubleExtra("height", 0);
        // BMI 단위 : ㎏/㎡ (체중 / 키의 제곱)
        double bmi = w / Math.pow(h/100, 2);

        String bmiStr = "";
        int imgSrcId = 0;
        int bmiCommentId = 0;

        if(bmi < 18.5){
            bmiStr = "저";
            bmiCommentId = R.string.bmi_comment1;
            imgSrcId = R.drawable.bmi_1;
        }else if(bmi < 24){
            bmiStr = "정상";
            bmiCommentId = R.string.bmi_comment2;
            imgSrcId = R.drawable.bmi_2;
        }else if(bmi < 30){
            bmiStr = "과";
            bmiCommentId = R.string.bmi_comment3;
            imgSrcId = R.drawable.bmi_3;
        }else if(bmi < 35){
            bmiStr = "비만";
            bmiCommentId = R.string.bmi_comment4;
            imgSrcId = R.drawable.bmi_4;
        }else if(bmi < 40){
            bmiStr = "고도비만";
            bmiCommentId = R.string.bmi_comment5;
            imgSrcId = R.drawable.bmi_5;
        }else{
            bmiStr = "초고도비만";
            bmiCommentId = R.string.bmi_comment6;
            imgSrcId = R.drawable.bmi_6;
        }
        imgV.setImageResource(imgSrcId);
        text1.setText(String.format("귀하의 BMI지수는 %.2f(㎏/㎡)이므로 %s 체중입니다.", bmi, bmiStr));
        text2.setText(bmiCommentId);
    }
}