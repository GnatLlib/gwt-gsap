package com.gsap.easing;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "Back", namespace = JsPackage.GLOBAL)
public class Back {

    @JsProperty
    public static Ease easeIn;

    @JsProperty
    public static Ease easeInOut;

    @JsProperty
    public static Ease easeOut;


}
