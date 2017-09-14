package com.mysecondndk.jni;

/**
 * Created by lenovo on 2017/9/13.
 */

public class JniUtil {
static {
    System.loadLibrary("test");
}
    public native String getString();
}
