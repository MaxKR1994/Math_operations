public class Math {

    public static void main(String[] args) {
        int a = 28;
        int b = 4;
        // Плюс
        int c1 = a + b;
        int d1 = 4 + b;
        //Минус
        int c2 = a - b;
        int d2 = 4 - a;
        //Умножение
        int c3 = a * b;
        int d3 = b * 5;
        //Деление
        double c4 = a / b;
        double d4 = b / a;
        double k1 = 16 / 4;// округляет до целого числа
        double k2 = 25.0 / 4;// округляет до целого числа
        //Получение остатка
        int a1 = 56;
        int b1 = 5;
        int c5 = a1 % b1;  // (5*11)+1
        int d5 = 22 % 4; // (4*5)+2
        //Префиксный инкремент
        int a2 = 11; //12
        int b2 = ++a2; //12
        //Постфиксный инкремент
        int a3 = 19; //20
        int b3 = a3++; //19
        //Префиксный декремент
        int a4 = 10; //9
        int b4 = --a4; //9
        //Постфиксный декремент
        int a5 = 18; //17
        int b5 = a5--; //18
        //Приоритет арифметических операций
        int a6 = 5;
        int b6 = 4;
        int c6 = a6 + 5 * ++b6; //5*5+5=30

        int a7 = 6;
        int b7 = 9;
        int c7 = (a7 + 5) * ++b7; //(6+5)*10=110

        //Ассоциативность операций (все операции слева направо кроме инкремента и декремента)
        int x = 30 / 6 * 4; // (30/6)*4=20

        double g = 2.0 - 1.1; // 0.8999999999999999

        System.out.println(c1);
        System.out.println(d1);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(c3);
        System.out.println(d3);
        System.out.println(c4);
        System.out.println(d4);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(c5);
        System.out.println(d5);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(a4);
        System.out.println(b4);
        System.out.println(a5);
        System.out.println(b5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(x);
        System.out.println(g);
    }

}

