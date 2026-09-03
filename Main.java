import java.util.Scanner;

public class Main{

public static void q01(){
    
    System.out.println("Olá Mundo");
}
public static void q02(){

    Scanner in = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = in.nextInt();
    //in.close();

    System.out.println("O número informado foi: " + numero);
}

public static void q03(){
    Scanner in = new Scanner(System.in);
    System.out.print("Digite a nota 1: ");
    float n1 = in.nextFloat();
    System.out.print("Digite a nota 2: ");
    float n2 = in.nextFloat();
    System.out.print("Digite a nota 3: ");
    float n3 = in.nextFloat();
    //in.close();

    float media = (n1+n2+n3)/3;
    System.out.println("Média das notas: " + media);
}

public static void q04(){
    Scanner in = new Scanner(System.in);
    System.out.print("Digite um valor em metros: ");
    float metros = in.nextFloat();
    //in.close();
    float centimetros = metros * 100;
    System.out.println("Valor convertido: "+ centimetros +" cm");
}

public static void q05(){
    
    Scanner in = new Scanner(System.in);
    System.out.print("Digite o raio do circulo: ");
    float raio = in.nextFloat();
    //in.close();
    
    System.out.print("Área do circulo: " + Math.PI * raio * raio);
}

public static void q06(){
    Scanner in = new Scanner(System.in);
    System.out.print("Digite o valor do 1° produto: ");
    float valor1 = in.nextFloat();  
    System.out.print("Digite o valor do 2° produto: ");
    float valor2 = in.nextFloat();
    System.out.print("Digite o valor do 3° produto: ");
    float valor3 = in.nextFloat();
    //in.close();
    
    if (valor1 < valor2) {
        if(valor1 < valor3) {
            System.out.println("O produto comprado é o 1° produto");
        } else {
            System.out.println("O produto comprado é o 3° produto");
        }
    }else{
        if(valor2 < valor3) {
            System.out.println("O produto comprado é o 2° produto");
        } else {
            System.out.println("O produto comprado é o 3° produto");
        }
    }
}

public static void main(String[] args) {
    q01();
}
}