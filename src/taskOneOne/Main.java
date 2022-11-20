package taskOneOne;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //На ноль делить нельзя, придумано следующая реализяцияя метода,
        //которая при входном делимом аргументе возвращает значение первого аргумента без изменений.
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}
