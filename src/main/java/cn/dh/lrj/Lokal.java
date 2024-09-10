package cn.dh.lrj;

import java.util.Locale;
import java.util.ResourceBundle;

public class Lokal {
    private static ResourceBundle rb = ResourceBundle.getBundle("cn.dh.lrj.lang", Locale.getDefault());

    public void resetLocale(Locale locale)
    {
        rb = ResourceBundle.getBundle("cn.dh.lrj.lang", locale);
    }

    public static String __(String s) {
        String ret;
        try {
            ret = rb.getString(s);
        } catch(Exception e) {
            return s;
        }
        return ret;
    }

    public static String N_(String s) { return s; }
}
