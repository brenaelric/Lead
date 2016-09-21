public class ExemploMetodos{
  public static double somar(double valor_1, double valor_2){
    return (valor_1 + valor_2);
  }
  public static double subtrair(double valor_1, double valor_2){
    return (valor_1 - valor_2);
  }
  public static double multiplicar(double valor_1, double valor_2){
    return (valor_1 * valor_2);
  }
  public static double dividir(double valor_1, double valor_2){
    return (valor_1 / valor_2);
  }
  public static void main(String[] args) {
    System.out.println("Para os valores 2.6 e 7.8:");
    System.out.println("O resultado da soma é: " + somar(2.6, 7.8));
    System.out.println("O resultado da subtração é: " + subtrair(2.6, 7.8));
    System.out.println("O resultado da multiplicação é: " + multiplicar(2.6, 7.8));
    System.out.println("O resultado da divisão é: " + dividir(2.6, 7.8));
  }
}
