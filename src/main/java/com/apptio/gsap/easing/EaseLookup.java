package com.apptio.gsap.easing;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "EaseLookup", namespace = JsPackage.GLOBAL)
public class EaseLookup {

    @JsMethod
    public static native Ease find(String name);
}
