package com.gsap.js;

import jsinterop.annotations.JsFunction;

/**
 * Created by btang on 8/17/17.
 */

@JsFunction
public interface Function <In, Out> {

    Out exec(In p);

}
