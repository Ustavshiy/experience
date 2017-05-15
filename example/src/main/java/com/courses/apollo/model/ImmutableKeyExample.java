package com.courses.apollo.model;

import java.util.Date;

/**
 * Created by User on 15.05.2017.
 */
public final class ImmutableKeyExample {
    private final String str;
    private final Date date;

    public ImmutableKeyExample(String str, Date date) {
        this.str = str;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableKeyExample)) return false;

        ImmutableKeyExample that = (ImmutableKeyExample) o;

        if (str != null ? !str.equals(that.str) : that.str != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = str != null ? str.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    public String getStr() {
        return str;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }
}
