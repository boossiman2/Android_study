package com.example.bsh.project9_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageButton ibZoomin, ibZoomout, ibRotate, ibBright, ibDark, ibGray;
    MyGraphicView graphicView;
    static float scaleX = 1, scaleY = 1;
    static float angle = 0;
    static float color = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout pictureLayout = (LinearLayout) findViewById(R.id.pictureLayout);
        graphicView = new MyGraphicView(this);
        pictureLayout.addView(graphicView);
        clickIcons();
    }
    private void clickIcons(){
        ibZoomin = (ImageButton)findViewById(R.id.ibZoomin);
        ibZoomout = (ImageButton)findViewById(R.id.ibZoomout);
        ibRotate = (ImageButton)findViewById(R.id.ibRotate);
        ibBright = (ImageButton)findViewById(R.id.ibBright);
        ibDark = (ImageButton)findViewById(R.id.ibDark);
        ibGray = (ImageButton)findViewById(R.id.ibGray);
        ibZoomin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                scaleX = scaleX + 0.2f;
                scaleY = scaleY + 0.2f;
                graphicView.invalidate();
            }
        });
        ibRotate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                angle += 20;
                graphicView.invalidate();
            }
        });
        ibBright.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                color += 0.2f;
                graphicView.invalidate();
            }
        });
    }
    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvs) {
            super.onDraw(canvs);
            int CenX = this.getWidth() / 2;
            int CenY = this.getHeight() /2 ;
            canvs.scale(scaleX,scaleY,CenX,CenY);
            canvs.rotate(angle, CenX, CenY);
            Paint paint = new Paint();

            ColorMatrix cm = new ColorMatrix(array);
            paint.setColorFilter(new ColorMatrixColorFilter(cm));

            Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.pic);
            int picX = (this.getWidth() - picture.getWidth()) / 2;
            int picY = (this.getHeight() - picture.getHeight()) / 2;
            canvs.drawBitmap(picture, picX, picY, paint);

            picture.recycle();
        }
    }
}

