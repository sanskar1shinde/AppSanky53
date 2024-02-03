package com.example.appsanky53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class Imageswitch53 extends AppCompatActivity {

    private ImageSwitcher imgs;
    Button bNext, bPrev;
    int imageIds[]={R.drawable.imag1,R.drawable.imag2,R.drawable.imag3,R.drawable.imag4,R.drawable.imag5,R.drawable.imag6};
    int count=imageIds.length;
    static int CurrentIndex=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageswitch53);
        bNext=findViewById(R.id.b1);
        bPrev=findViewById(R.id.b2);
        imgs=findViewById(R.id.is1);

        imgs.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        });

        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        imgs.setInAnimation(in);
        imgs.setOutAnimation(out);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentIndex ++;
                if(CurrentIndex == count)
                    CurrentIndex=0;
                imgs.setImageResource(imageIds[CurrentIndex]);
                Toast.makeText(Imageswitch53.this, ""+CurrentIndex, Toast.LENGTH_SHORT).show();
            }
        });

        bPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentIndex == 0)
                    CurrentIndex=count;
                CurrentIndex --;
                imgs.setImageResource(imageIds[CurrentIndex]);
                Toast.makeText(Imageswitch53.this, ""+CurrentIndex, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
