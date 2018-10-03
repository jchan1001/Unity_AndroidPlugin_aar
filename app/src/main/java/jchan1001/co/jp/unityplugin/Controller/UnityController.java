package jchan1001.co.jp.unityplugin.Controller;

import android.util.Log;

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

    public void log(String tag, String msg) {
        Log.e(tag, msg);
    }
    public static void staticLog(String type, String tag, String msg) {
        switch (type){
            case "d":
                println(Log.DEBUG, tag, msg);
                break;
            case "e":
                // error
                println(Log.ERROR, tag, msg);
                break;
            case "w":
                // warning
                println(Log.WARN, tag, msg);
                break;
            case "i":
                // information
                println(Log.INFO, tag, msg);
                break;
            case "v":
                // verbose
                println(Log.VERBOSE, tag, msg);
                break;
            default:
                println(Log.ASSERT, tag, msg);
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

    public void testStringArr(String[] param) {
        testStringArr = param;
    }

    public String[] getStringArr() {
        return testStringArr;
    }
}
