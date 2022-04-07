public class Arithmetic {

    public static int elemOne = 0;
    public static int elemTwo = 0;
    
    public Arithmetic (String name) {
        this.elemOne = elemOne;
        this.elemTwo = elemTwo;
        System.out.println(name);
    }
    
    public int summ (int elemOne, int elemTwo) {
        int sum;
        sum = elemOne + elemTwo;
        System.out.println("Сумма чисел " + elemOne + " и " + elemTwo + " = " + sum);
        return sum;
    }

    public int multiplication (int elemOne, int elemTwo) {
        int mult;
        mult = elemOne * elemTwo;
        System.out.println("Произведение чисел " + elemOne + " и " + elemTwo + " = " + mult);
        return mult;
    }
    
    public int maxElem (int elemOne, int elemTwo) {
        int max;
        if (elemOne > elemTwo) {
            System.out.println("Максимальное из чисел " + elemOne + " и " + elemTwo + " = " + elemOne);
            // max = elemOne;
        }else if (elemOne < elemTwo) {
            System.out.println("Максимальное из чисел " + elemOne + " и " + elemTwo + " = " + elemTwo);
            // max = elemTwo;
        }else if (elemOne == elemTwo) {
            // max = elemOne;
            System.out.println("Числа равны");
        }
        max = 0;
        // System.out.println("Максимальное из чисел " + elemOne + " и " + elemTwo + " = " + max);
        return max;
    }
    
    public int minElem (int elemOne, int elemTwo) {
        int min;
        if (elemOne <  elemTwo) {
            min = elemOne;
        } else {
            min = elemTwo;
        }
        if (elemOne == elemTwo) {
            System.out.println("Числа " + elemOne + " и " + elemTwo + " равны.");
        } else {
            System.out.println("Минимальное из чисел " + elemOne + " и " + elemTwo + " = " + min);
        }
        return min;
    }
}
