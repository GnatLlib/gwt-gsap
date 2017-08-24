package com.apptio.gsap.core;


import com.apptio.gsap.js.JsObject;
import jsinterop.annotations.*;


/**
 * JsInterop wrapper for Base SimpleTimeline class
 * Functionality follows official GSAP documentation
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "SimpleTimeline", namespace = JsPackage.GLOBAL)
public class SimpleTimeline extends Animation{

    @JsProperty
    public Boolean autoRemoveChildren;

    @JsProperty
    public Boolean smoothChildTiming;

    @JsConstructor
    public SimpleTimeline(){}

    @JsConstructor
    public SimpleTimeline(JsObject vars){}

    @JsMethod
    public native SimpleTimeline add( Animation child );

    @JsMethod
    public native SimpleTimeline add( Animation child, Number position );

    @JsMethod
    public native SimpleTimeline add( Animation child, String position );

    @JsMethod
    public native SimpleTimeline add( Animation child, Number position, String align, Number stagger );

    @JsMethod
    public native SimpleTimeline add( Animation child, String position, String align, Number stagger );


}
