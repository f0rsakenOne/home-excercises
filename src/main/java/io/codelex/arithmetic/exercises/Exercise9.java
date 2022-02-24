package io.codelex.arithmetic.exercises;

public class Exercise9 {
    public static String fatCalculator(double weight,double height){
        double bmi = bmiCalc(weight, height);
        if (bmi>=18.5&&bmi<=25){
            return "Optimal weight";
        } else if (bmi<18.5){
            return "Underweight";
        } else return "Overweight";

    }

    public static  double bmiCalc(double weight,double height){
        return weight/(height*height)*10000;
    }

    public static void main(String[] args){
        System.out.println(fatCalculator(35.5,176.8));
        System.out.println(fatCalculator(50.5,146.2));
        System.out.println(fatCalculator(170.5,176.8));
    }
}
