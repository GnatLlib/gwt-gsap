package com.gsap.js;

import jsinterop.annotations.JsFunction;

/**
 * Generic Wrapper for a Javascript function. Can be implemented through java lambdas.
 * Created by btang on 8/17/17.
 */

@JsFunction
public interface Function <In, Out> {

    Out exec(In p);

}
