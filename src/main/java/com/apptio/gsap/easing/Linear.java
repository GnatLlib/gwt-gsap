package com.apptio.gsap.easing;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType(isNative = true, name = "Linear", namespace = JsPackage.GLOBAL)
public class Linear extends Ease {

    @JsConstructor
    public Linear(){}

    @JsProperty
    public static Linear ease;

    @JsProperty
    public static Linear easein;

    @JsProperty
    public static Linear easeInOut;

    @JsProperty
    public static Linear easeNone;

    @JsProperty
    public static Linear easeOut;
}
