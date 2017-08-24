package com.apptio.gsap;

import com.apptio.gsap.js.Function;
import com.apptio.gsap.js.JsArray;
import com.apptio.gsap.js.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * JsInterop wrapper for the TimelineMax class
 * Functionality follows official GSAP documentation
 * Created by btang on 8/18/17.
 */

@JsType(isNative = true, name = "TimelineMax", namespace = JsPackage.GLOBAL)
public class TimelineMax extends TimelineLite {

    @JsConstructor
    public TimelineMax() {
    }

    @JsConstructor
    public TimelineMax(JsObject vars) {
    }

    @JsMethod
    public native TimelineMax addCallback(Function callback);

    @JsMethod
    public native TimelineMax addCallback(Function callback, Number position, JsArray params, JsObject scope);

    @JsMethod
    public native TimelineMax addCallback(Function callback, String position, JsArray params, JsObject scope);

    @JsMethod
    public native String currentLabel();

    @JsMethod
    public native TimelineMax currentLabel(String value);

    @JsMethod
    public native String getLabelAfter(Number time);

    @JsMethod
    public native String getLabelBefore(Number time);

    @JsMethod
    public native JsArray getLabelsArray();

    @JsMethod
    public native TimelineMax removeCallBack(Function callback);

    @JsMethod
    public native TimelineMax removeCallBack(Function callback, Number timeOrLabel);

    @JsMethod
    public native TimelineMax removeCallBack(Function callback, String timeOrLabel);

    @JsMethod
    public native TimelineMax removePause(Number position);

    @JsMethod
    public native TimelineMax removePause(String position);

    @JsMethod
    public native Number repeat();

    @JsMethod
    public native TimelineMax repeat(Number value);

    @JsMethod
    public native Number repeatDelay();

    @JsMethod
    public native TimelineMax repeatDelay(Number value);

    @JsMethod
    public native TweenLite tweenFromTo(Number fromPosition, Number toPosition, JsObject vars);

    @JsMethod
    public native TweenLite tweenFromTo(String fromPosition, Number toPosition, JsObject vars);

    @JsMethod
    public native TweenLite tweenFromTo(Number fromPosition, String toPosition, JsObject vars);

    @JsMethod
    public native TweenLite tweenFromTo(String fromPosition, String toPosition, JsObject vars);

    @JsMethod
    public native TweenLite tweenTo(Number position, JsObject vars);

    @JsMethod
    public native TweenLite tweenTo(String position, JsObject vars);

    @JsMethod
    public native Boolean useFrames();

    @JsMethod
    public native Boolean yoyo();

    @JsMethod
    public native TimelineMax yoyo(Boolean value);

}
