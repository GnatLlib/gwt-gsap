package com.gsap.easing;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */
@JsType (isNative = true, name = "Cubic", namespace = JsPackage.GLOBAL)
public class Cubic {

    @JsProperty
    public static Ease easeIn;

    @JsProperty
    public static Ease easeInOut;

    @JsProperty
    public static Ease easeOut;


}
