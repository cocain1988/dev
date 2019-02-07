package com.company;

public class ArrayAlg {
    /**
     * Пара чисел с плавающей точкой
     */

    public static class Pair{
        private double first;
        private double second;

        /**
         * Составляет пару из двух чисел с плавающей точкой
         * @param f первое число
         * @param s Второе число
         */

        public Pair(double f, double s){
            first = f;
            second = s;
        }

        /**
         * Возвращает первое число из пары
         * @return Возврат первого числа
         */
        public double getFirst(){
            return first;
        }

        public double getSecond(){
            return second;
        }
    }

    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for(double v: values){
            if (min >  v) min = v;
            if (max <  v) max = v;
        }
        return new Pair(min, max);
    }
}
