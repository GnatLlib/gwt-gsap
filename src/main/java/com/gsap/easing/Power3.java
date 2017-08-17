package com.gsap.easing;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */
@JsType(isNative = true, name = "Power3", namespace = JsPackage.GLOBAL)
public class Power3 {

    @JsProperty
    public static Ease easeIn;

    @JsProperty
    public static Ease easeInOut;

    @JsProperty
    public static Ease easeOut;


}