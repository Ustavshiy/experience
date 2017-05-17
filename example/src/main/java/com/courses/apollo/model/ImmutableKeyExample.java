package com.courses.apollo.model;

import java.util.Date;

/**
 * Created by User on 15.05.2017.
 */
public final class ImmutableKeyExample {
    /**
     * Field str.
     */
    private final String str;

    /**
     * Field date.
     */
    private final Date date;

    public ImmutableKeyExample(String str, Date date) {
        this.str = str;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImmutableKeyExample)) {
            return false;
        }

        ImmutableKeyExample that = (ImmutableKeyExample) o;

        if (str != null && !str.equals(that.str)) {
            return false;
        }
        if (str == null && that.str != null) {
            return false;
        }
        if (date != null) {
            return date.equals(that.date);
        } else {
            return that.date == null;
        }
    }

    @Override
    public int hashCode() {
        int result;
        final int magicNumber = 31;
        if (str != null) {
            result =  str.hashCode();
        } else {
            result = 0;
        }

        if (date != null) {
            result = magicNumber * result + date.hashCode();
        } else {
            result = 0;
        }
        return result;
    }

    public String getStr() {
        return str;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }
}
