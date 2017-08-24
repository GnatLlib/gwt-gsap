package com.gsap.easing;


import com.gsap.js.Function;
import com.gsap.js.JsArray;
import com.gsap.js.Function;
import com.gsap.js.JsArray;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "Ease", namespace = JsPackage.GLOBAL)
public class Ease {

    @JsConstructor
    public Ease(){}

    @JsConstructor
    public Ease(Function func, JsArray extraParams, Number type, Number power){}

    @JsMethod
    public native Number getRatio(Number p);


}
