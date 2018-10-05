package jchan1001.co.jp.unityplugin.Controller;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import jchan1001.co.jp.unityplugin.MainActivity;
import jchan1001.co.jp.unityplugin.SecondActivity;

import static android.util.Log.println;

public class UnityController {

    public int testInt;
    public String testString;
    public String testStringArr[] = new String[10];

    public static UnityController uc;

    public static UnityController getUnityController( ) {
        if (uc == null) {
            uc = new UnityController();
            return uc;
        } else {
            return uc;
        }
    }

    public void moveActivity(Context unityContext) {
        Intent intent = new Intent(unityContext.getApplicationContext(), MainActivity.class);
        intent.putExtra("UNITY_INT", getTestInt());
        intent.putExtra("UNITY_STRING", getString());
        intent.putExtra("UNITY_STRING_ARR", getStringArr());
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

    public void setTestInt(int param) {
        testInt = param;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestString(String param) {
        testString = param;
    }

    public String getString() {
        return testString;
    }

    public void setTestStringArr(String[] param) {
        testStringArr = param;
    }

    public String[] getStringArr() {
        return testStringArr;
    }
}
