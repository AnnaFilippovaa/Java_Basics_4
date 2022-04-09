package filippova.anna;

public class MainJavaBasics {

    public static void main(String[] args) {
        // операторы
        char symbol;
        symbol = 'w';
        boolean flag = false;
        byte varByte = 100;
        short varShort;
        int varInt = 101;
        Integer boxed = null; //значение по умолчанию null
        char[][] array = new char[][] {{'w', 'a', 's'}};
        long varLong = 123L;
        float varFloat = 1.2F;
        double varDouble = 1.2D ;
        String varString = "Hello, qa.guru!"; //значение по умолчанию null

        //примеры операций над разными типами данных
        System.out.println("Результат сложения varByte и varInt = " + (varByte + varInt));
        System.out.println("Результат вычитания varInt из varByte = " + (varByte - varInt));
        System.out.println("Результат умножения varInt на varLong = " + (varLong * varInt));
        System.out.println("Результат деления varLong на varFloat = " + (varLong / varFloat));
        System.out.println("Результат остатка от деления varLong на varFloat = " + (varLong % varFloat));
        System.out.println("Результат сложения varInt и строки = " + (varInt + varString));

        varByte = (byte) varInt; //переполнение, Integer более вместительный, чем Byte


        if (varString != null && varString.equals("Dima")) {
            System.out.println("varString не равен нулю и varString равен Dima");
        } else {
            System.out.println("varString равен нулю или varString не равен Dima");
        }

        int maxValue = getMaxIntNumber();
        System.out.println("max value: " + maxValue);
        System.out.println(summ(3,7));
    }

    static int getMaxIntNumber() {
        return  Integer.MAX_VALUE;
    }

    static int summ(int first, int second) {
        return first + second;
    }
}
