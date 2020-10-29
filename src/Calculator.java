import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            ConvertToRomanNum converting = new ConvertToRomanNum();
            Calc Calc = new Calc();

            int maxVal = 10;
            int minVal = 1;
            int result;
            int num1 = 0;
            int num2 = 0;
            boolean romNum1State = false;
            boolean romNum2State = false;

            System.out.println("Введите данные через пробел");
            String str = br.readLine();

            String strArrey[] = str.split(" ");

            String s1 = strArrey[0];
            String operationStr = strArrey[1];
            String s2 = strArrey[2];


            RomanNumerals romSymbols[] = RomanNumerals.values();
            for (int i = 0; i < romSymbols.length; i++){
                if (romSymbols[i].checkForRomN1(s1)){
                    num1 = romSymbols[i].getValue2();
                    romNum1State = true;
                }
            }

            for (int i = 0; i < romSymbols.length; i++){

                if (romSymbols[i].checkForRomN2(s2)){
                    num2 = romSymbols[i].getValue2();
                    romNum2State = true;
                }
            }

            if (romNum1State && romNum2State){
                if(num1 >= minVal && num1 <= maxVal  && num2 >= minVal && num2 <= maxVal) {
                    result = Calc.calc(num1, num2, operationStr);

                    System.out.println(converting.convertRomNum(result));

                }else {
                    throw new Exception("Допустимые числа от 1 до 10");
                }
            }else{
                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                if(num1 >= minVal && num1 <= maxVal  && num2 >= minVal && num2 <= maxVal) {
                    result = Calc.calc(num1, num2, operationStr);
                    System.out.println(result);
                }else {
                    throw new Exception("Допустимые числа от 1 до 10");
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
