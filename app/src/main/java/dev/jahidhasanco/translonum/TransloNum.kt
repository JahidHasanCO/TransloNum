package dev.jahidhasanco.translonum

object TransloNum {

    private val arabicDigits = charArrayOf('٠', '١', '٢', '٣', '٤', '٥', '٦', '٧', '٨', '٩')
    private val banglaDigits = charArrayOf('০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯')
    private val englishDigits = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    private val hindiDigits = charArrayOf('०', '१', '२', '३', '४', '५', '६', '७', '८', '९')

    public fun getDigitFromEnglish(number: String?, countryCode: String): String {
        if (number == null) return ""
        var arrOfCountry = ""

        if (countryCode == "ar" ||  countryCode == "AR"){
            arrOfCountry = "arabicDigits"
        }
        if (countryCode == "bn" || countryCode == "bd" || countryCode == "BN"){
            arrOfCountry = "banglaDigits"
        }
        else if(countryCode == "hi" || countryCode == "HI"){
            arrOfCountry = "hindiDigits"
        }
        else{
            return ""
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



}