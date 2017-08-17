package com.gsap.core;


import com.gsap.js.JsObject;
import jsinterop.annotations.*;


/**
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
