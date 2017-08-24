package com.gsap;


import com.gsap.core.Animation;
import com.gsap.core.SimpleTimeline;
import com.gsap.js.Function;
import com.gsap.js.JsArray;
import com.gsap.js.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


/**
 * JsInterop Wrapper for the TimelineLite class
 * Functionality follows official GSAP documentation
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "TimelineLite", namespace = JsPackage.GLOBAL )
public class TimelineLite extends SimpleTimeline {

    @JsConstructor
    public TimelineLite(){}

    @JsConstructor
    public TimelineLite(JsObject vars ){}

    @JsMethod
    public static native TimelineLite exportRoot();

    @JsMethod
    public static native TimelineLite exportRoot( JsObject vars, Boolean omitDelayedCalls );

    @JsMethod
    public native TimelineLite add( Function callback );

    @JsMethod
    public native TimelineLite add( Function callback, Number position );

    @JsMethod
    public native TimelineLite add( Function callback, String position );

    @JsMethod
    public native TimelineLite add( String label );

    @JsMethod
    public native TimelineLite add( String label, Number position );

    @JsMethod
    public native TimelineLite add( String label, String position );
    
    @JsMethod
    public native TimelineLite add(JsArray value, Number position , String align, Number stagger );

    @JsMethod
    public native TimelineLite add(JsArray value, String position , String align, Number stagger );

    @JsMethod
    public native TimelineLite addLabel(String label);

    @JsMethod
    public native TimelineLite addLabel(String label, Number position);

    @JsMethod
    public native TimelineLite addLabel(String label, String position);

    @JsMethod
    public native TimelineLite addPause(Number position);

    @JsMethod
    public native TimelineLite addPause(String position);

    @JsMethod
    public native TimelineLite addPause(Number position, Function callback);

    @JsMethod
    public native TimelineLite addPause(String position, Function callback);

    @JsMethod
    public native TimelineLite addPause(Number position, Function callback, JsArray params, JsObject scope);

    @JsMethod
    public native TimelineLite addPause(String position, Function callback, JsArray params, JsObject scope);

    @JsMethod
    public native TimelineLite call(Function callback);

    @JsMethod
    public native TimelineLite call(Function callback, JsArray params, JsObject scope, Number position);

    @JsMethod
    public native TimelineLite call(Function callback, JsArray params, JsObject scope, String position);

    @JsMethod
    public native TimelineLite clear();

    @JsMethod
    public native TimelineLite clear( Boolean labels);

    @JsMethod
    public native TimelineLite from(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public native TimelineLite from(JsObject target, Number duration, JsObject vars, Number position);

    @JsMethod
    public native TimelineLite from(JsObject target, Number duration, JsObject vars, String position);

    @JsMethod
    public native TimelineLite fromTo(JsObject target, Number duration, JsObject fromVars, JsObject toVars );

    @JsMethod
    public native TimelineLite fromTo(JsObject target, Number duration, JsObject fromVars,
                                      JsObject toVars, Number position);

    @JsMethod
    public native TimelineLite fromTo(JsObject target, Number duration, JsObject fromVars,
                                      JsObject toVars, String position);

    @JsMethod
    public native JsArray getChildren();

    @JsMethod
    public native JsArray getChildren(Boolean nested, Boolean tweens, Boolean timeline, Number ignoreBeforeTime);

    @JsMethod
    public native Number getLabelTime(String label);

    @JsMethod
    public native JsArray getTweensOf(JsObject target);

    @JsMethod
    public native JsArray getTweensOf(JsObject target, Boolean nested);

    @JsMethod
    public native Animation recent();

    @JsMethod
    public native TweenLite remove( Animation value);

    @JsMethod
    public native TweenLite remove( String value);

    @JsMethod
    public native TweenLite remove( JsArray value);

    @JsMethod
    public native TweenLite remove( Function value);

    @JsMethod
    public native Number removeLabel(String label);

    @JsMethod
    public native TimelineLite set( JsObject target, JsObject vars );

    @JsMethod
    public native TimelineLite set( JsObject target, JsObject vars, Number position );

    @JsMethod
    public native TimelineLite set( JsObject target, JsObject vars, String position );

    @JsMethod
    public native TimelineLite shiftChildren( Number amount );

    @JsMethod
    public native TimelineLite shiftChildren( Number amount, Boolean adjustLabels, Number ignoreBeforeTime );

    @JsMethod
    public native TimelineLite staggerFrom(JsArray targets, Number duration, JsObject vars, Number stagger,
                                           Number position, Function onCompleteAll, JsArray onCompleteAllParams,
                                           JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite staggerFrom(JsArray targets, Number duration, JsObject vars, Number stagger,
                                           String position, Function onCompleteAll, JsArray onCompleteAllParams,
                                           JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite staggerFromTo(JsArray targets, Number duration, JsObject fromVars, JsObject toVars,
                                           Number stagger, Number position, Function onCompleteAll,
                                             JsArray onCompleteAllParams, JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite staggerFromTo(JsArray targets, Number duration, JsObject fromVars, JsObject toVars,
                                             Number stagger, String position, Function onCompleteAll,
                                             JsArray onCompleteAllParams, JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite staggerTo(JsArray targets, Number duration, JsObject vars, Number stagger,
                                           Number position, Function onCompleteAll, JsArray onCompleteAllParams,
                                           JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite staggerTo(JsArray targets, Number duration, JsObject vars, Number stagger,
                                           String position, Function onCompleteAll, JsArray onCompleteAllParams,
                                           JsObject onCompleteScope);

    @JsMethod
    public native TimelineLite to(JsObject target, Number duration, JsObject vars);

    @JsMethod
    public native TimelineLite to(JsObject target, Number duration, JsObject vars, Number position);

    @JsMethod
    public native TimelineLite to(JsObject target, Number duration, JsObject vars, String position);

    @JsMethod
    public native Boolean useFrames();
}
