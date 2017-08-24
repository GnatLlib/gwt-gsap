package com.gsap.easing;


import com.gsap.js.JsObject;
import com.gsap.js.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType(isNative = true, name = "CustomBounce", namespace = JsPackage.GLOBAL)
public class CustomBounce extends Ease{

    @JsMethod
    public static native CustomBounce create(String id, JsObject vars);

    @JsMethod
    public static native String getSVGData(Ease ease, JsObject vars);

}
