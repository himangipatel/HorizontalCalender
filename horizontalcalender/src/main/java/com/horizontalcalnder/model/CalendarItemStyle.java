package com.horizontalcalnder.model;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/**
 * @author Mulham-Raee
 * @since v1.2.5
 */
public class CalendarItemStyle {

    private int colorTopText;
    private int colorMiddleText;
    private int colorBottomText;
    private Typeface fontTopText;
    private Typeface fontMiddleText;
    private Typeface fontBottomText;

    private Drawable background;

    public CalendarItemStyle() {
    }

    public CalendarItemStyle(int textColor, Typeface font, Drawable background) {
        this(textColor, textColor, textColor, font, font, font, background);
    }

    public CalendarItemStyle(int colorTopText, int colorMiddleText, int colorBottomText,
                             Typeface fontTopText, Typeface fontMiddleText, Typeface fontBottomText,
                             Drawable background) {
        this.colorTopText = colorTopText;
        this.colorMiddleText = colorMiddleText;
        this.colorBottomText = colorBottomText;
        this.fontTopText = fontTopText;
        this.fontMiddleText = fontMiddleText;
        this.fontBottomText = fontBottomText;
        this.background = background;
    }

    public int getColorTopText() {
        return colorTopText;
    }

    public Typeface getFontTopText() {
        return fontTopText;
    }

    public CalendarItemStyle setColorTopText(int colorTopText) {
        this.colorTopText = colorTopText;
        return this;
    }

    public CalendarItemStyle setTopTextFont(Typeface colorTopFont) {
        this.fontTopText = colorTopFont;
        return this;
    }

    public int getColorMiddleText() {
        return colorMiddleText;
    }

    public Typeface getFontMiddleText() {
        return fontMiddleText;
    }

    public CalendarItemStyle setColorMiddleText(int colorMiddleText) {
        this.colorMiddleText = colorMiddleText;
        return this;
    }

    public CalendarItemStyle setMiddleTextFont(Typeface colorMiddleFont) {
        this.fontMiddleText = colorMiddleFont;
        return this;
    }

    public int getColorBottomText() {
        return colorBottomText;
    }

    public Typeface getFontBottomText() {
        return fontBottomText;
    }

    public CalendarItemStyle setColorBottomText(int colorBottomText) {
        this.colorBottomText = colorBottomText;
        return this;
    }

    public CalendarItemStyle setBottomTextFont(Typeface colorMiddleFont) {
        this.fontBottomText = colorMiddleFont;
        return this;
    }

    public Drawable getBackground() {
        return background;
    }

    public CalendarItemStyle setBackground(Drawable background) {
        this.background = background;
        return this;
    }

    public void setupDefaultValues(CalendarItemStyle defaultValues) {
        if (defaultValues == null) {
            return;
        }
        if (colorTopText == 0) {
            colorTopText = defaultValues.colorTopText;
        }
        if (colorMiddleText == 0) {
            colorMiddleText = defaultValues.colorMiddleText;
        }
        if (colorBottomText == 0) {
            colorBottomText = defaultValues.colorBottomText;
        }


        if (background == null) {
            background = defaultValues.background;
        }
    }
}
