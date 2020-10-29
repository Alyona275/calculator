public enum RomanNumerals {
    I("I",1), II("II",2), III("III",3), IV("IV",4), V("V",5), VI("VI",6), VII("VII",7), VIII("VIII",8), IX("IX",9), X("X",10);

    private  String value1;
    private int value2;

    RomanNumerals(String value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue2 (){
        return value2;
    }

    public  boolean checkForRomN1(String n1){

        if (n1.equals(this.value1)){
            return  true;
        } else {
            return false;
        }
    }
    public  boolean checkForRomN2(String n2){

        if ( n2.equals(this.value1)){
            return true;
        } else {
            return false;
        }
    }
}
