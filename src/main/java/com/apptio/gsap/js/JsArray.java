package com.apptio.gsap.js;

import jsinterop.annotations.*;

/**
 * JsInterop wrapper for Javascript array
 * Created by btang on 8/17/17.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class JsArray<T extends Object> {

    @JsProperty(name = "length")
    public native int length();

    @JsConstructor
    public JsArray() {}

    @JsMethod
    public native JsArray<T> fill(T value);

    @JsMethod
    public native JsArray<T> fill(T value, int start);

    @JsMethod
    public native JsArray<T> fill(T value, int start, int end);

    @JsMethod
    public native T pop();

    @JsMethod
    public native int push(T ...elementN);

    @JsMethod
    public native JsArray<T> sort();

    @JsMethod
    public native JsArray<T> sort(CompareFunction compareFunction);

    @JsMethod
    public native int indexOf(T searchElement);

    @JsMethod
    public native int indexOf(T searchElement, int fromElement);

    @JsMethod
    public native String join(String separator);

    @JsMethod
    public native int lastIndexOf(T searchElement, int fromIndex);

    @JsMethod
    @Override
    public native String toString();

    @JsFunction
    public interface CompareFunction {
        void function(Object... params);
    }
}