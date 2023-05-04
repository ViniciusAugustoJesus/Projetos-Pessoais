package Calculadora;

public class Operacoes {
    public double somar(double a, double b){
        return a + b;
    };
    public double subtrair(double a, double b){
        return a - b;
    };
    public double multiplicar(double a, double b){
        return a * b;
    };
    public double dividir(double a, double b){
        return a / b;
    };

    public void calcular(String signal, double num1, double num2){
            if (signal.equals("+")){
                System.out.println(somar(num1, num2));
            } else if (signal.equals("-")) {
                System.out.println(subtrair(num1, num2));
            } else if (signal.equals("/")) {
                System.out.println(dividir(num1, num2));
            } else if (signal.equals("*")){
                System.out.println(multiplicar(num1, num2));
            }else{
                System.out.println("Voce digitou algo errado, tente novamente");
            }

    }

}
