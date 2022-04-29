package kr.hs.emirim.project11_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Gallery Movie Poster");
        ImageView imgvLarge = findViewById(R.id.imgv_large);
        Gallery gallery = findViewById(R.id.gallery1);
        GalleryAdapter adapter = new GalleryAdapter(this, imgvLarge);
        gallery.setAdapter(adapter);
    }
}