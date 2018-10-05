package jchan1001.co.jp.unityplugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// Todo Fix AppCompatActivity Error
// AndroidJavaException: java.lang.NoClassDefFoundError: Failed resolution of: Landroid/support/v7/app/AppCompatActivity;
// java.lang.NoClassDefFoundError: Failed resolution of: Landroid/support/v7/app/AppCompatActivity;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Log.d("Unity Log", "Int : " + intent.getIntExtra("UNITY_INT", 0));
        Log.d("Unity Log", "String : " + intent.getStringExtra("UNITY_STRING"));
        Log.d("Unity Log", "String arr : " + intent.getStringArrayExtra("UNITY_STRING_ARR"));
    }

    public static void log(String tag, String msg) {
        Log.e(tag, msg);
    }
}
