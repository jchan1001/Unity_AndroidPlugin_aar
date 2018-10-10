package jchan1001.co.jp.unityplugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.unity3d.player.UnityPlayer;

// Todo Fix AppCompatActivity Error
// AndroidJavaException: java.lang.NoClassDefFoundError: Failed resolution of: Landroid/support/v7/app/AppCompatActivity;
// java.lang.NoClassDefFoundError: Failed resolution of: Landroid/support/v7/app/AppCompatActivity;
public class MainActivity extends Activity {

    Button mCallUnityButtonChangeRed;
    Button mCallUnityButtonChangeGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Log.d("Unity Log", "Int : " + intent.getIntExtra("UNITY_INT", 0));
        Log.d("Unity Log", "String : " + intent.getStringExtra("UNITY_STRING"));
        Log.d("Unity Log", "String arr : " + intent.getStringArrayExtra("UNITY_STRING_ARR"));
        Log.d("Unity Log", "Intent : " + intent.getIntExtra("UNITY_INTENT",0));
        byte[] imageData = intent.getByteArrayExtra("UNITY_IMAGE_DATE");
        Log.d("Unity Log", "Byte arr : " + imageData);
        Bitmap bmp = BitmapFactory.decodeByteArray(imageData, 0, imageData.length);
        ImageView imageView2 = findViewById(R.id.image_view);
        imageView2.setImageBitmap(bmp);

        mCallUnityButtonChangeRed = findViewById(R.id.Button1);
        mCallUnityButtonChangeRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // script name, method
                UnityPlayer.UnitySendMessage("Script", "ChangeButtonColorRed", "");
            }
        });

        mCallUnityButtonChangeGreen = findViewById(R.id.Button2);
        mCallUnityButtonChangeGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // script name, method
                UnityPlayer.UnitySendMessage("Script", "ChangeButtonColorGreen", "");
            }
        });
    }
}
