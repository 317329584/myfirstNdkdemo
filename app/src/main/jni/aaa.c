//
// Created by lenovo on 2017/9/14.
//


#include "com_mysecondndk_jni_JniUtil.h"

JNIEXPORT jstring JNICALL Java_com_mysecondndk_jni_JniUtil_getString(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "fuck all the world");
}