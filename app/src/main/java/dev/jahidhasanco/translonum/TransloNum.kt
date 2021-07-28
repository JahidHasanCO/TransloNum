package dev.jahidhasanco.translonum

object TransloNum {

    private val arabicDigits = charArrayOf('٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩')
    private val banglaDigits = charArrayOf('০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯')
    private val englishDigits = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    private val hindiDigits = charArrayOf('०', '१', '२', '३', '४', '५', '६', '७', '८', '९')

    public fun getDigitFromEnglish(number: String?, countryCode: String): String {
        if (number == null) return ""
         var arrOfCountry: CharArray = charArrayOf()

        if (countryCode == "ar" ||  countryCode == "AR"){
            arrOfCountry = arabicDigits
        }
        if (countryCode == "bn" || countryCode == "bd" || countryCode == "BN"){
            arrOfCountry = banglaDigits
        }
        else if(countryCode == "hi" || countryCode == "HI"){
            arrOfCountry = hindiDigits
        }
       

        val builder = StringBuilder()
        try {
            for (i in number.indices) {
                if (Character.isDigit(number[i])) {
                    if (number[i].toInt() - 48 <= 9) {
                        builder.append(arrOfCountry.get(number[i].toInt() - 48))
                    } else {
                        builder.append(number[i])
                    }
                } else {
                    builder.append(number[i])
                }
            }
        } catch (e: Exception) {
            //logger.debug("getDigitBanglaFromEnglish: ",e);
            return ""
        }
        return builder.toString()
    }

    public fun convertCountryCurrency(amount: Double, countryCode: String): String {

        val ar: String = amount.toString()
        val arr: List<String> = ar.split(".")

        val fis = getDigitFromEnglish(arr[0],countryCode)
        val sec = getDigitFromEnglish(arr[1],countryCode)

        return "$fis.$sec"
    }


    public fun getEnglishDigitFrom(number: String?, countryCode: String): String{
        var str = ""

        if(countryCode == "AR" || countryCode == "ar"){
            str = number?.let { ArabicToEnglish(it) }.toString()
        }
        else if(countryCode == "BN" || countryCode == "bn" || countryCode == "bd"){
            str = number?.let { BanglaToEnglish(it) }.toString()
        }

        else if(countryCode == "HI" || countryCode == "hi"){
            str = number?.let { HindiToEnglish(it) }.toString()
        }
        return str
    }

    private fun ArabicToEnglish(str: String):String {

        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '०' -> en = '0'
                '१' -> en = '1'
                '२' -> en = '2'
                '३' -> en = '3'
                '४' -> en = '4'
                '५' -> en = '5'
                '६' -> en = '6'
                '७' -> en = '7'
                '८' -> en = '8'
                '९' -> en = '9'
            }
            result = "${result}$en"
        }
        return result
    }

    private fun BanglaToEnglish(str: String):String {
        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '۰' -> en = '০'
                '۱' -> en = '১'
                '۲' -> en = '২'
                '۳' -> en = '৩'
                '۴' -> en = '৪'
                '۵' -> en = '৫'
                '۶' -> en = '৬'
                '۷' -> en = '৭'
                '۸' -> en = '৮'
                '۹' -> en = '৯'
            }
            result = "${result}$en"
        }
        return result
    }

    private fun HindiToEnglish(str: String):String {
        var result = ""
        var en = '0'
        for (ch in str) {
            en = ch
            when (ch) {
                '۰' -> en = '0'
                '۱' -> en = '1'
                '۲' -> en = '2'
                '۳' -> en = '3'
                '۴' -> en = '4'
                '۵' -> en = '5'
                '۶' -> en = '6'
                '۷' -> en = '7'
                '۸' -> en = '8'
                '۹' -> en = '9'
            }
            result = "${result}$en"
        }
        return result
    }
}
