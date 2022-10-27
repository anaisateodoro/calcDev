package calcDev;

import java.util.Scanner;

public class CalculadoraDois {
	 public static void main(String[] args) {    
	        int miNum1;
	        int miNum2;
	        boolean para =true;
	        
	        do{
	        System.out.println("Qual operação desejas? + - * /");
	        System.out.println("====================================");
	        Scanner entradaDados =new Scanner(System.in);
	        char decisao=entradaDados.next().toUpperCase().charAt(0);
	        switch(decisao){
	            case '+':
	                System.out.println("Digite o primeiro");
	                miNum1=entradaDados.nextInt();
	                System.out.println("Digite o segundo");
	                miNum2=entradaDados.nextInt();
	                System.out.println("O resultado da soma é: "+(miNum1+miNum2));
	                System.out.println("Deseja continuar? S/N");
	                decisao=entradaDados.next().toUpperCase().charAt(0);
	                if (decisao =='N') {
	                para=false;
	                System.out.println("Feito a operação desejada! :)");
	                }
	                break;
	            case '-':
	                System.out.println("Digite o primeiro");
	                miNum1=entradaDados.nextInt();
	                System.out.println("Digite o segundo");
	                miNum2=entradaDados.nextInt();
	                System.out.println("O resultado da divisão é: "+(miNum1-miNum2));
	                System.out.println("Deseja continuar? S/N");
	                decisao=entradaDados.next().toUpperCase().charAt(0);
	                if (decisao=='N') {
	                para=false; 
	                System.out.println("Feito a operação desejada! :)");
	                }
	                break;
	            case '*':
	                System.out.println("Digite o primeiro");
	                miNum1=entradaDados.nextInt();
	                System.out.println("Digite o segundo");
	                miNum2=entradaDados.nextInt();
	                System.out.println("O resultado da multiplicação é: "+(miNum1*miNum2));
	                System.out.println("Desejas continuar? S/N");
	                decisao=entradaDados.next().toUpperCase().charAt(0);
	                if (decisao=='N') {
	                para=false; 
	                System.out.println("Feito a operação desejada! :)");
	                }
	                break;
	            case '/':
	                System.out.println("Digite o dividendo");
	                miNum1=entradaDados.nextInt();
	                System.out.println("Digite o divisor");
	                miNum2=entradaDados.nextInt();
	                System.out.println("O resultado da divisão é: "+(miNum1/miNum2));
	                System.out.println("Deseja continuar? S/N");
	                decisao=entradaDados.next().toUpperCase().charAt(0);
	                if (decisao=='N') {
	                para=false; 
	                System.out.println("Feito a operação desejada! :)");
	                }
	                break;
	               
	            default:
	                System.err.println("Erro de digitação na escolha da operação");
	                para=false;
	                System.out.println("Sair");
	                break;
	        }
	        }
	        while (para==true);           
	    }
	    
	}

