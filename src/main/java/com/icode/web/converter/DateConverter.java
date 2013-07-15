package com.icode.web.converter;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午8:56
 */
public class DateConverter extends DefaultTypeConverter {

    @Override
    public Object convertValue(Object value, Class toType) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        if (toType == Date.class) {
            String[] params = (String[]) value;
            try {
                return format.parse(params[0]);
            } catch (ParseException e) {
                throw new UnsupportedOperationException("Not yet implemented!");
            }
        } else if (toType == String.class) {
            Date date = (Date) value;
            return format.format(date);
        }
        return null;
    }
}
