package com.bilgeadam.rehberprj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CevirmeIslemleri {

    public static java.sql.Date utilToSqlDate(java.util.Date tarih)
    {

        java.sql.Date sqlTarih = new java.sql.Date(tarih.getTime());

        return sqlTarih;
    }
    public static java.sql.Date sqlutilToSqlDate(java.util.Date tarih)
    {
        java.sql.Date sqlTarih = new java.sql.Date(tarih.getTime());

        return sqlTarih;
    }

    public static String untilDateToStr(java.util.Date tarih)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(Sabitler.TARIH_FORMAT);
        return sdf.format(tarih);
    }
    public static java.util.Date strToUntilDate(String tarih) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(Sabitler.TARIH_FORMAT);
        return sdf.parse(tarih);
    }

    }

