import java.util.Arrays;
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

public static void q14(){
    //Questão realizada com ajuda do colega eduardo
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira 10 números inteiros maiores que 1: ");
    for(int i=0; i<10; i++){
        System.out.println("Insira um número: ");
        int n = scan.nextInt();
        
        while(n <= 1){
            System.out.println("Insira um número válido maior que 1: ");
            n = scan.nextInt();
        }
        
        if(n == 2){
            System.out.println("O número: 2 é primo");
            continue;
            }
        for(int j=2; j<n; j++){
            if(n%j != 0){
                if(j == n-1){
                    System.out.println("O número: " + n + " é primo");
                }}
            else {
                System.out.println("O número: " + n + " não é primo");
                break;
            }
        }
    }
}

public static void q15(){
    //Questão realizada com ajuda do colega eduardo
    int valor = 1;
    int valorAnterior = 0;
    
    for(int i=0; i<10; i++){
        if(i <= 1){
            System.out.println("Indíce "+i+" da sequência de Fibonacci: " + i);
            continue;
        }
    System.out.println("Indíce: "+i+" da sequência de Fibonacci: " + (valor+valorAnterior));
    int novoValor =  valorAnterior+valor;
    valorAnterior = valor;
    valor = novoValor;
    }
}

public static void q16(){
    //Questão realizada com ajuda do colega eduardo
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira um valor natural: ");
    int n =  scan.nextInt();
    int fatorial = n;
        
    for(int i=n-1; i>1; i--){
        System.out.println(fatorial+" vezes "+i+" = "+(fatorial = fatorial * i));
    }
        
    System.out.println("O fatorial do número: "+n+" é: "+fatorial);
}

public static void q17(){
    int[] vetor = new int[5];

    Scanner in = new Scanner(System.in);
    for(int i = 0;i < 5; i++){
        System.out.println("Insira um valor na posição "+ i +" do vetor: ");
        int valor = in.nextInt();
        vetor[i] = valor;
    }

    for(int i = 0;i < 5; i++){
        System.out.println("O valor na posição "+ i +" do vetor é: " + vetor[i]);
    }
    //in.close();
}

public static void q18(){
    float[] vetor = new float[10];

    Scanner in = new Scanner(System.in);
    for(int i = 0;i < 10; i++){
        System.out.println("Insira um valor na posição "+ i +" do vetor: ");
        float valor = in.nextFloat();
        vetor[i] = valor;
    }

    for(int i = 9;i > -1; i--){
        System.out.println("O valor na posição "+ i +" do vetor é: " + vetor[i]);
    }
    //in.close();    
}

public static void q19(){
    int[] vetor = new int[5];
    int soma = 0;
    int multiplicacao = 1;

    Scanner in = new Scanner(System.in);
    for(int i = 0;i < 5; i++){
        System.out.println("Insira um valor na posição "+ i +" do vetor: ");
        int valor = in.nextInt();
        vetor[i] = valor;
        soma += valor;
        multiplicacao = multiplicacao * valor;
    }
    //in.close();

    System.out.println("A soma dos valores do vetor é: " + soma);
    System.out.println("A multiplicação dos valores do vetor é: " + multiplicacao);

    for(int i = 0;i < 5; i++){
        System.out.println("O valor na posição "+ i +" do vetor é: " + vetor[i]);
    }
}

public static void q20(){
    int[] vetor = new int[20];
    int parQuant = 0;
    int imparQuant = 0;

    Scanner in = new Scanner(System.in);
    for(int i = 0;i < 20; i++){
        System.out.println("Insira um valor na posição "+ i +" do vetor: ");
        int valor = in.nextInt();
        vetor[i] = valor;
        if (valor % 2 == 0) { //par
            parQuant++;
        }else{ //impar
            imparQuant++;
        }
    }
    //in.close();

    int[] parVetor = new int[parQuant];
    int[] imparVetor = new int[imparQuant];
    int parIndex = 0;
    int imparIndex = 0;
    
    for(int i = 0;i < 20; i++){
        if (vetor[i] % 2 == 0) { //par
            parVetor[parIndex] = vetor[i];
            parIndex++;
        }else{ //impar
            imparVetor[imparIndex] = vetor[i];
            imparIndex++;
        }
    }

    System.out.println("O vetor completo é: " + Arrays.toString(vetor));
    System.out.println("O vetor de numeros pares é: " + Arrays.toString(parVetor));
    System.out.println("O vetor de numeros impares é: " + Arrays.toString(imparVetor));
}

public static void q21(){
    Scanner in = new Scanner(System.in);
    System.out.println("Insira a String 1:");
    String string1 = in.nextLine();
    System.out.println("Insira a String 2:");
    String string2 = in.nextLine();
    //in.close();

    System.out.println("O conteúdo da String 1 é: \""+string1+ "\" seu comprimento é de "+string1.length() + " caracteres");
    System.out.println("O conteúdo da String 2 é: \"" + string2 + "\", e seu comprimento é de "+string2.length() + " caracteres");

    if(string1.length()==string2.length()){
        System.out.println("As strings possuem o mesmo tamanho");
        
        if(string1.equals(string2)){
            System.out.println("Alem de possuir o mesmo tamanho, as strings são iguais");
        }else{
            System.out.println("Apesar de possuir o mesmo tamanho, as strings são diferentes");
        }
    }else{
        System.out.println("As strings possuem tamanhos diferentes");
    }
}

public static void q22(){

    //Questão realizada com ajuda do colega eduardo
    Scanner in = new Scanner(System.in);
    System.out.println("Insira um valor inteiro:");
    int valor = in.nextInt();
    //in.close();

    int valorInverso = 0;
    while(valor != 0){
        valorInverso = valorInverso *10 + valor % 10;
        valor = valor / 10;
    }
    System.out.println("O inverso do valor é: " +valorInverso);
}

public static void q23(){

Scanner in = new Scanner(System.in);
System.out.println("Insira o primeiro valor numerico : ");
float valor1 = in.nextFloat();
System.out.println("Insira o segundo valor numerico : ");
float valor2 = in.nextFloat();
System.out.println("Escolha a operação a ser realizada, 1 - Soma, 2 - Subtração, 3 - Multiplicação ou 4 - Divisão: ");
int operador = in.nextInt();
//in.close();

float resultado;
switch (operador) {
    case 1 -> {
        resultado = valor1 + valor2;
        System.out.println("Soma dos dois valores: " + resultado);
        }
    case 2 -> {
        resultado = valor1 - valor2;
        System.out.println("Subtração dos dois valores: " + resultado);
        }
    case 3 -> {
        resultado = valor1 * valor2;
        System.out.println("Multiplicação dos dois valores: " + resultado);
        }
    case 4 -> {
        resultado = valor1 / valor2;
        System.out.println("Divisão dos dois valores: " + resultado);
        }
    default -> System.out.println("Formato da operação incorreta");
}

}

public static void main(String[] args) {
    q23();
}
}