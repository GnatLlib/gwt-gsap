package com.gsap;

import com.gsap.js.Function;
import com.gsap.js.JsArray;
import com.gsap.js.JsObject;
import jsinterop.annotations.*;


/**
 * JsInterop wrapper for TweenMax class.
 * Functionality follows official GSAP documentation
 * Created by btang on 8/18/17.
 */
@JsType (isNative = true, name = "TweenMax", namespace = JsPackage.GLOBAL)
public class TweenMax extends TweenLite{

    @JsProperty
    public static JsObject ticker;

    @JsConstructor
    public TweenMax() {
    }

    @JsConstructor
    public TweenMax( JsObject target, Number duration, JsObject vars){}

    @JsMethod
    public static native TweenMax delayedCall(Number delay, Function callback );

    @JsMethod
    public static native TweenMax delayedCall(Number delay, Function callback, JsArray params,
                                               JsObject scope, Boolean useFrames);

    @JsMethod
    public static native TweenMax from(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public static native TweenMax from(String selector, Number duration, JsObject vars);

    @JsMethod
    public static native TweenMax fromTo(JsObject target, Number duration, JsObject fromVars, JsObject toVars);

    @JsMethod
    public static native TweenMax fromTo(String selector, Number duration, JsObject fromVars, JsObject toVars);

    @JsMethod
    public static native JsArray getAllTweens();

    @JsMethod
    public static native JsArray getAllTweens(Boolean includeTimelines);

    @JsMethod
    public static native JsArray getTweensOf( JsObject target );

    @JsMethod
    public static native JsArray getTweensOf( JsArray target );

    @JsMethod
    public static native JsArray getTweensOf( JsObject target, Boolean onlyActive );

    @JsMethod
    public static native JsArray getTweensOf( JsArray target, Boolean onlyActive );

    @JsMethod
    public static native Number globalTimeScale();

    @JsMethod
    public static native void globalTimeScale(Number value);

    @JsMethod
    public static native Boolean isTweening(JsObject target);

    @JsMethod
    public static native void killAll();

    @JsMethod
    public static native void killAll(Boolean complete, Boolean tweens, Boolean delayedCalls, Boolean timelines);

    @JsMethod
    public static native void killChildTweensOf(JsObject parent);

    @JsMethod
    public static native void killChildTweensOf(JsObject parent, Boolean complete);

    @JsMethod
    public static native TweenMax set( JsObject target, JsObject vars);

    @JsMethod
    public static native TweenMax set( JsArray target, JsObject vars);

    @JsMethod
    public static native TweenMax to(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public static native TweenMax to(String selector, Number duration, JsObject vars);

    @JsMethod
    public static native JsArray staggerFrom(JsArray targets, Number duration, JsObject vars, Number stagger);

    @JsMethod
    public static native JsArray staggerFrom(JsArray targets, Number duration, JsObject vars, Number stagger,
                                             Function onCompleteAll, JsArray onCompleteAllParams,
                                             JsObject onCompleteAllScope);

    @JsMethod
    public static native JsArray staggerFrom(JsArray targets, Number duration, JsObject fromVars,
                                             JsObject toVars, Number stagger);

    @JsMethod
    public static native JsArray staggerFrom(JsArray targets, Number duration, JsObject fromVars,
                                             JsObject toVars, Number stagger,
                                             Function onCompleteAll, JsArray onCompleteAllParams,
                                             JsObject onCompleteAllScope);

    @JsMethod
    public static native JsArray staggerTo(JsArray targets, Number duration, JsObject vars, Number stagger);

    @JsMethod
    public static native JsArray staggerTo(JsArray targets, Number duration, JsObject vars, Number stagger,
                                             Function onCompleteAll, JsArray onCompleteAllParams,
                                           JsObject onCompleteAllScope);

    @JsMethod
    public native Number repeat();

    @JsMethod
    public native TweenMax repeat(Number value);

    @JsMethod
    public native Number repeatDelay();

    @JsMethod
    public native TweenMax repeatDelay(Number value);

    @JsMethod
    public native TweenMax updateTo(JsObject vars, Boolean resetDuration);

    @JsMethod
    public native Boolean yoyo();

    @JsMethod
    public native TweenMax yoyo(Boolean value);




}


