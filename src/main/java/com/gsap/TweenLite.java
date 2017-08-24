package com.gsap;

import com.gsap.core.Animation;
import com.gsap.easing.Ease;
import com.gsap.js.Function;
import com.gsap.js.JsArray;
import com.gsap.js.JsObject;
import jsinterop.annotations.*;

/**
 * JsInterop wrapper for the TweenLite class
 * Functionality follows official GSAP documentation
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "TweenLite", namespace = JsPackage.GLOBAL)
public class TweenLite extends Animation {

    @JsProperty
    public static Ease defaultEase;

    @JsProperty
    public static String defaultOverwrite;

    @JsProperty
    public static Function onOverwrite;

    @JsProperty
    public static JsObject ticker;

    @JsProperty
    public JsObject target;

    @JsConstructor
    public TweenLite(){}

    @JsConstructor
    public TweenLite( JsObject target, Number duration, JsObject vars){}

    @JsMethod
    public static native TweenLite delayedCall(Number delay, Function callback );

    @JsMethod
    public static native TweenLite delayedCall(Number delay, Function callback, JsArray params,
                                               JsObject scope, Boolean useFrames);

    @JsMethod
    public static native TweenLite from(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public static native TweenLite from(String selector, Number duration, JsObject vars);

    @JsMethod
    public static native TweenLite fromTo(JsObject target, Number duration, JsObject fromVars, JsObject toVars);

    @JsMethod
    public static native TweenLite fromTo(String selector, Number duration, JsObject fromVars, JsObject toVars);

    @JsMethod
    public static native JsArray getTweensOf( JsObject target );

    @JsMethod
    public static native JsArray getTweensOf( JsArray target );

    @JsMethod
    public static native JsArray getTweensOf( JsObject target, Boolean onlyActive );

    @JsMethod
    public static native JsArray getTweensOf( JsArray target, Boolean onlyActive );

    @JsMethod
    public static native void killDelayedCallsTo(Function func);

    @JsMethod
    public static native void killTweenOf(JsObject target);

    @JsMethod
    public static native void killTweenOf(JsObject target, Boolean onlyActive);

    @JsMethod
    public static native void killTweenOf(JsObject target, Boolean onlyActive, JsObject vars);

    @JsMethod
    public static native void lagSmoothing(Number threshold, Number adjustedLag);

    @JsMethod
    public static native void render();

    @JsMethod
    public static native TweenLite set( JsObject target, JsObject vars);

    @JsMethod
    public static native TweenLite set( JsArray target, JsObject vars);

    @JsMethod
    public static native TweenLite to(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public static native TweenLite to(String selector, Number duration, JsObject vars);


}
