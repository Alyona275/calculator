public class Calc {
    public int calc(int n1, int n2, String op){
        int result = 0;

        switch (op){
            case "+" :
                result = n1 + n2;
                break;
            case "-" :
                result = n1 - n2;
                break;
            case "*" :
                result = n1 * n2;
                break;
            case "/" :
                result = n1 / n2;
                break;
            default:
                System.out.println("Ошибка. Некорректный знак.");
        }
        return result;
    }
}
