package org.labcrypto.util.i18n;

import com.ibm.icu.text.DateTimePatternGenerator;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;

public class DateTimeHelper {

    public static String getPersianDateFromUtcEpoch(long epoch) {
        ULocale uLocale = new ULocale("fa_IR@calendar=persian");
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tehran"), uLocale);
        cal.setTimeInMillis(epoch);

        DateTimePatternGenerator generator
                = DateTimePatternGenerator.getInstance(uLocale);
        final String pattern = generator.getBestPattern("E y/M/d HH:mm:ss");
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, uLocale);

        return StringHelper
                .convertPersianNumbersToEnglishNumbers(formatter.format(cal))
                .replace("ه‍.ش.", "")
                .replace("،‏", "")
                .trim();
    }
}
