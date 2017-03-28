package com.courses.apollo.model.sound;

import java.util.Objects;

/**
 * Class to create a style of music.
 */
public class Style {

    /**
     * Style of the song.
     */
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
        Style styles = (Style) o;
        return Objects.equals(style, styles.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(style);
    }

    @Override
    public String toString() {
        return "Style{" + "style='" + style + '\'' + '}';
    }
}
