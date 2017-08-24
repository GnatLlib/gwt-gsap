package com.apptio.gsap.easing;


import com.apptio.gsap.js.JsObject;
import jsinterop.annotations.*;

/**
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "RoughEase", namespace = JsPackage.GLOBAL)
public class RoughEase extends Ease{

    @JsConstructor
    public RoughEase(){}

    @JsConstructor
    public RoughEase(JsObject vars) {}

    @JsProperty
    public static RoughEase ease;

    @JsMethod
    public native RoughEase config(JsObject vars);


}
