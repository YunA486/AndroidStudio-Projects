package kr.hs.emirim.project11_2;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.aladdin, R.drawable.breaking, R.drawable.eclipse, R.drawable.lalaland, R.drawable.maleficent,
                       R.drawable.midnight, R.drawable.notebook, R.drawable.showman, R.drawable.titanic, R.drawable.twlight};

    public GalleryAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setImageResource(posterIds[i]);
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imgv;
    }
}
