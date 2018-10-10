package jchan1001.co.jp.unityplugin.Controller;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import jchan1001.co.jp.unityplugin.MainActivity;

import static android.util.Log.println;

public class UnityController {

    int testInt;
    String testString;
    String testStringArr[] = new String[10];
    byte[] testImageData;

    static UnityController uc;

    public static UnityController getUnityController( ) {
        if (uc == null) {
            uc = new UnityController();
            return uc;
        } else {
            return uc;
        }
    }

    public void moveActivity(Context unityContext, Intent unityIntent) {
        Intent intent = new Intent(unityContext.getApplicationContext(), MainActivity.class);
        intent.putExtra("UNITY_INT", getInt());
        intent.putExtra("UNITY_STRING", getString());
        intent.putExtra("UNITY_STRING_ARR", getStringArr());
        intent.putExtra("UNITY_INTENT", unityIntent.getIntExtra("testok", 0));
        intent.putExtra("UNITY_IMAGE_DATE", getImageData());
        unityContext.startActivity(intent);
    }

    public static void log(String type, String msg) {
        switch (type){
            case "d":
                println(Log.DEBUG, "Unity Log", msg);
                break;
            case "e":
                // error
                println(Log.ERROR, "Unity Log", msg);
                break;
            case "w":
                // warning
                println(Log.WARN, "Unity Log", msg);
                break;
            case "i":
                // information
                println(Log.INFO, "Unity Log", msg);
                break;
            case "v":
                // verbose
                println(Log.VERBOSE, "Unity Log", msg);
                break;
            default:
                println(Log.ASSERT, "Unity Log", msg);
        }
    }

    public void setInt(int param) {
        testInt = param;
    }

    public int getInt() {
        return testInt;
    }

    public void setString(String param) {
        testString = param;
    }

    public String getString() {
        return testString;
    }

    public void setStringArr(String[] param) {
        testStringArr = param;
    }

    public String[] getStringArr() {
        return testStringArr;
    }

    public void setImageData(byte[] param) {
        testImageData = param;
    }

    public byte[] getImageData() {
        return testImageData;
    }
}
