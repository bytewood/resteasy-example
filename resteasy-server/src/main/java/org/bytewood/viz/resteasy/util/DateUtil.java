package org.bytewood.viz.resteasy.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final Date parse(String dateString) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = null;
        try {
            dt = df.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeParseException(e);
        }
        return dt;
    }
    
}
