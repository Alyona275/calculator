public class ConvertToRomanNum {
    public String convertRomNum( int n){

        if((n <= 0) || (n > 4000)){
            return n + "Это число не попало в диапазон (0 - 4000)";
        }

        String result = "";

        String[] romNumerals = {"I", "V", "X", "L", "C", "D", "M"};

        int i = 0;
        while (n > 0){
            switch (n % 10){
                case 1:
                    result = romNumerals[i] + result;
                    break;
                case 2:
                    result = romNumerals[i] + romNumerals[i] + result;
                    break;
                case 3:
                    result = romNumerals[i] + romNumerals[i] + romNumerals[i] + result;
                    break;
                case 4:
                    result = romNumerals[i] + romNumerals[i + 1] + result;
                    break;
                case 5:
                    result = romNumerals[i + 1] + result;
                    break;
                case 6:
                    result = romNumerals[i + 1] + romNumerals[i] + result;
                    break;
                case 7:
                    result = romNumerals[i + 1] + romNumerals[i] + romNumerals[i] + result;
                    break;
                case 8:
                    result = romNumerals[i + 1] + romNumerals[i] + romNumerals[i] + romNumerals[i] + result;
                    break;
                case 9:
                    result = romNumerals[i] + romNumerals[i + 2] + result;
                    break;
            }
            n = n / 10;
            i += 2;
        }
        return result;
    }
}

