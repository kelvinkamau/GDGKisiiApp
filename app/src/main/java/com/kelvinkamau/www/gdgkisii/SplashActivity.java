package com.kelvinkamau.www.gdgkisii;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wang.avi.AVLoadingIndicatorView;

public class SplashActivity extends AppCompatActivity {
    public static int SPLASH_TIMER = 5000;
    private AVLoadingIndicatorView avi;
    private TextView textView;
    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        String indicator=getIntent().getStringExtra("indicator");
        avi= (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator(indicator);
        avi.smoothToShow();

        Typeface proReg = Typeface.createFromAsset(getAssets(), "fonts/ProductSans.ttf");
        textView =(TextView)findViewById(R.id.textView);
        textView.setTypeface(proReg);

        title =(TextView)findViewById(R.id.title);
        title.setTypeface(proReg);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        } ,SPLASH_TIMER );
    }


}
