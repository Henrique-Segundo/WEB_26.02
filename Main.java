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

public static void q07(){
    Scanner in = new Scanner(System.in);
    System.out.print("Quantas notas serão usadas:");
    int notas = in.nextInt();

    float notasSoma = 0;
    for(int i = 0; i < notas;i++){
        System.out.print("Nota:");
        float notaI = in.nextFloat();
        notasSoma += notaI;
    }
    System.out.println("Média das notas:" + notasSoma/notas);

    //in.close();
}

public static void q08(){
    Scanner in = new Scanner(System.in);
    System.out.print("Digite a primeira nota:");
    float nota1 = in.nextFloat();
    System.out.print("Digite a segunda nota:");
    float nota2 = in.nextFloat();
    
    boolean AF = false;
    float MF = (nota1 + nota2)/2;
    if (MF >= 7) {
        System.out.println("Aluno aprovado");
    }else{
        if (MF >= 4) {
           System.out.println("Aluno deverá realizar AF");
           AF = true;
        }else{
            System.out.println("Aluno reprovado direto");
        }
    }

    if (AF) {
        System.out.print("Digite a nota da AF:");
        float notaAF = in.nextFloat();

        System.out.println("MF sem considerar a AF: " + MF);
        MF = (MF + notaAF)/2;
        System.out.println("MF considerarando a AF: " + MF);
        if (notaAF >=4 && MF >= 5) {
            System.out.println("Aprovado conceito B");
        }else{
            System.out.println("Reprovado após AF");
        }
    }
    //in.close();
}

public static void q09(){
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o 1° valor: ");
		float valor1 = in.nextFloat();
		System.out.print("Digite o 2° valor: ");
		float valor2 = in.nextFloat();
		System.out.print("Digite o 3° valor: ");
		float valor3 = in.nextFloat();
		//in.close();
    
        float valorMaior = Math.max(valor1, Math.max(valor2, valor3));

		System.out.println("O maior valor é: " + valorMaior);
	}

public static void q10(){

    Scanner in = new Scanner(System.in);
	System.out.print("Digite um valor inteiro: ");
	int valorInteiro = in.nextInt();
	//in.close();
		
    if (valorInteiro % 2 == 0) {
        System.out.print("O valor é par");
    }else{
        System.out.print("O valor é impar");
    }
}

public static void q11(){

    Scanner in = new Scanner(System.in);
	System.out.print("Digite um número inteiro de 0 a 10: ");
	int valorInteiro = in.nextInt();
    while ( 0 > valorInteiro || valorInteiro > 10 ) {
        System.out.print("Valor inválido");
        System.out.print("Digite um número inteiro de 0 a 10: ");
	    valorInteiro = in.nextInt();
    }
	//in.close();

    System.out.println("Tabuada do número: " + valorInteiro);
    for (int i = 1; i < 10; i++) {
        System.out.println( valorInteiro +" x "+ i +": " + (valorInteiro*i));
    }
}

public static void q12(){

    //Essa restrição estava na questão 11
    Scanner in = new Scanner(System.in);
	System.out.print("Digite um número inteiro de 0 a 10: ");
	int valorInteiro = in.nextInt();
    while ( 0 > valorInteiro || valorInteiro > 10 ) {
        System.out.print("Valor inválido");
        System.out.print("Digite um número inteiro de 0 a 10: ");
	    valorInteiro = in.nextInt();
    }
	//in.close();

    System.out.println("O valor é valido, o número digitado foi: "  + valorInteiro);
    
}

public static void q13(){

    System.out.print("Sistema de votação dos candidatos A,B,C");
    System.out.print("Número dos candidatos: A = 1,B = 2,C = 3");
    int votosA = 0,votosB = 0,votosC = 0;

    Scanner in = new Scanner(System.in);
	System.out.print("Digite o número de eleitores:");
	int eleitores = in.nextInt();

    for (int i = 0; i < eleitores; i++) {
        System.out.print("Digite o número do seu candidato:");
	    int votoAtual = in.nextInt();

        switch (votoAtual) {
            case 1 -> {
                System.out.println("Voto para o candidato A");
                votosA++;
            }
            case 2 -> {
                System.out.println("Voto para o candidato B");
                votosB++;
            }
            case 3 -> {
                System.out.println("Voto para o candidato C");
                votosC++;
            }
            default -> System.out.println("Voto nulo ou invalido");
        }
    }
	//in.close();

    System.out.println("Contagem de votos: ");
    System.out.println("Candidato A: " + votosA);
    System.out.println("Candidato B: " + votosB);
    System.out.println("Candidato C: " + votosC);

}
public static void main(String[] args) {
    q13();
}
}