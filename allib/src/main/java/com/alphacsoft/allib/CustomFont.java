package com.alphacsoft.allib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by Alphacsoft on 11/22/2017.
 */

public class CustomFont extends TextView {

    public CustomFont(Context context) {
        this(context, null);
    }

    public CustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs,
                R.styleable.CustomFont, 0, 0);
        String path_font = array.getString(R.styleable.CustomFont_fontPath);

        array.recycle();
        if (path_font != null) {
            setCustomTypeFace(context, path_font);
        } else {
            setCustomTypeFace(context, "fonts/CaviarDreams.ttf");
        }
    }

    private void setCustomTypeFace(Context context, String path_font) {
        Typeface typeFaces = Typeface.createFromAsset(context.getAssets(), path_font);
        this.setTypeface(typeFaces);
    }
}
