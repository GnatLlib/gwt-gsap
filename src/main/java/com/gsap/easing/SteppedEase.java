package com.gsap.easing;


import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "SteppedEase", namespace = JsPackage.GLOBAL)
public class SteppedEase extends Ease{

    @JsConstructor
    public SteppedEase( int steps ){}

    @JsMethod
    public static native SteppedEase config(int steps);


}

