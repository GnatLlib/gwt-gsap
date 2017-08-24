package com.apptio.gsap.easing;


import jsinterop.annotations.*;

/**
 * Created by btang on 8/17/17.
 */
@JsType(isNative = true, name = "SlowMo", namespace = JsPackage.GLOBAL)
public class SlowMo extends Ease{

    @JsConstructor
    public SlowMo(){}

    @JsConstructor
    public SlowMo(Number linearRatio, Number power, Boolean yoyoMode) {}

    @JsProperty
    public static SlowMo ease;

    @JsMethod
    public native SlowMo config(Number linearRatio, Number power, Boolean yoyoMode);


}
