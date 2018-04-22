package com.example.pea.picassofromurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imagefromurl;
    ImageView glagefromurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagefromurl =(ImageView)findViewById(R.id.iv_image_from_url);
        glagefromurl =(ImageView)findViewById(R.id.gl_image_from_url);

        Picasso.with(getApplicationContext())
                .load("http://i.imgur.com/DvpvklR.png")
                .into(imagefromurl);

        Glide.with(getApplicationContext())
                .load("http://i.imgur.com/DvpvklR.png")
                .into(glagefromurl);


    }
}
