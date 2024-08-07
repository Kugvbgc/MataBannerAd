package com.khair.matabannerad;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class MainActivity extends AppCompatActivity {
    LinearLayout banner_container;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner_container=findViewById(R.id.banner_container);
        lodBannerAd();
    }
    //-----------------------------------------------/////////-----------------------------------
    //===========================================================================================
private void lodBannerAd(){
    adView = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);
    banner_container.addView(adView);
    adView.loadAd();
}




    //-----------------------------------------------/////////-----------------------------------
    //===========================================================================================

}