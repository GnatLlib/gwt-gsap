package com.gsap.js;

import com.google.gwt.core.client.JavaScriptObject;
import com.gsap.easing.Ease;


/**
 * Created by btang on 8/17/17.
 */
public class JsObject extends JavaScriptObject{

    protected JsObject(){}

    public static native JsObject create() /*-{
        return {};
       }-*/;

    public final native void setProperty(String name, Number value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, Boolean value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, String value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, Object value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, JsObject value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, Ease value) /*-{
        this[name] = value;
    }-*/;

    public final native void setProperty(String name, Function value) /*-{
        this[name] = value;
    }-*/;

    public final static native Number getNumber(Object target, String name) /*-{
        return target[name];
    }-*/;

    public final static native JsObject getObject(Object target, String name) /*-{
        return target[name];
    }-*/;

    public final static native String getString(Object target, String name) /*-{
        return target[name];
    }-*/;

    public final native Number getNumber(String name) /*-{
        return this[name];
    }-*/;

    public final native Object getObject(String name) /*-{
        return this[name];
    }-*/;

    public final native String getString(String name) /*-{
        return this[name];
    }-*/;
}
