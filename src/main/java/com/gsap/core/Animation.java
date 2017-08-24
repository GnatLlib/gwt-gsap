package com.gsap.core;


import com.gsap.js.Function;
import com.gsap.js.JsArray;
import com.gsap.js.JsObject;
import com.gsap.js.Function;
import com.gsap.js.JsArray;
import jsinterop.annotations.*;

/**
 * JsInterop for Animation bass class
 * Functionality follows official GSAP documentation
 * Created by btang on 8/17/17.
 */

@JsType (isNative = true, name = "Animation" ,namespace = JsPackage.GLOBAL)
public class Animation {

    @JsProperty
    public JsObject data;

    @JsProperty
    public JsObject vars;

    @JsProperty
    public SimpleTimeline timeline;

    @JsConstructor
    public Animation(){}

    @JsConstructor
    public Animation( Number duration, JsObject vars){}

    @JsMethod
    public native Number delay();

    @JsMethod
    public native Animation delay( Number value );

    @JsMethod
    public native Number duration();

    @JsMethod
    public native Animation duration( Number value );

    @JsMethod
    public native Number endTime();

    @JsMethod
    public native Number endTime( Boolean includeRepeats );

    @JsMethod
    public native Function eventCallback(String type );

    @JsMethod
    public native Animation eventCallback( String type, Function callback);

    @JsMethod
    public native Animation eventCallback(String type, Function callback, JsArray params, JsObject scope);

    @JsMethod
    public native Animation invalidate();

    @JsMethod
    public native Boolean isActive();

    @JsMethod
    public native Animation kill();

    @JsMethod
    public native Animation kill( JsObject vars, JsObject target);

    @JsMethod
    public native Animation pause();

    @JsMethod
    public native Animation pause( Number time );

    @JsMethod
    public native Animation pause( Number time, Boolean suppressEvents );

    @JsMethod
    public native Boolean paused();

    @JsMethod
    public native Animation paused(Boolean value);

    @JsMethod
    public native Animation play();

    @JsMethod
    public native Animation play( Number from );

    @JsMethod
    public native Animation play( Number from, Boolean suppressEvents );

    @JsMethod
    public native Number progress();

    @JsMethod
    public native Animation progress( Number value );

    @JsMethod
    public native Animation progress( Number value, Boolean suppressEvents);

    @JsMethod
    public native Animation restart();

    @JsMethod
    public native Animation restart( Boolean includeDelay, Boolean suppressEvents );

    @JsMethod
    public native Animation resume();

    @JsMethod
    public native Animation resume( Number from );

    @JsMethod
    public native Animation resume( Number from, Boolean suppressEvents );

    @JsMethod
    public native Animation reverse();

    @JsMethod
    public native Animation reverse( Number from );

    @JsMethod
    public native Animation reverse( Number from, Boolean suppressEvents );

    @JsMethod
    public native Boolean reversed();

    @JsMethod
    public native Animation reversed( Boolean value);

    @JsMethod
    public native Animation seek();

    @JsMethod
    public native Animation seek( Number time );

    @JsMethod
    public native Animation seek( Number time, Boolean suppressEvents );

    @JsMethod
    public native Number startTime();

    @JsMethod
    public native Animation startTime( Number value);

    @JsMethod
    public native Number time();

    @JsMethod
    public native Animation time( Number time );

    @JsMethod
    public native Animation time( Number time, Boolean suppressEvents );

    @JsMethod
    public native Number timeScale();

    @JsMethod
    public native Animation timeScale( Number value);

    @JsMethod
    public native Number totalDuration();

    @JsMethod
    public native Animation totalDuration( Number value);

    @JsMethod
    public native Number totalProgress();

    @JsMethod
    public native Animation totalProgress( Number value );

    @JsMethod
    public native Animation totalProgress( Number value, Boolean suppressEvents );

    @JsMethod
    public native Number totalTime();

    @JsMethod
    public native Animation totalTime( Number time );

    @JsMethod
    public native Animation totalTime( Number time, Boolean suppressEvents );




}
