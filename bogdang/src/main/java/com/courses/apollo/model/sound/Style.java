package com.courses.apollo.model.sound;

import java.util.Objects;

/**
 * Created by Богдан on 23.03.2017.
 */
public class Style {

    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Style(String style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Style style1 = (Style) o;
        return Objects.equals(getStyle(), style1.getStyle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStyle());
    }
}
