import java.util.Scanner;
public class Exercicio {
	public static int val;
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int nn,idade,a,p,base,expoente;
		a=0;
		String sexo,feminino=null,masculino=null;
		System.out.println("Digite 1 para calcular um fatorial");
		System.out.println("Digite 2 para calcular uma tabuada");
	System.out.println("Digite 3 para calcular sua aposentadoria");
		System.out.println("Digite 4 para calcular uma potência ");
		val = in.nextInt();
		if(val==1) {
			System.out.println("Digite um número");
			int n1 = in.nextInt();
			System.out.println(fatorial(n1));
		}
		else if (val==2) {
			System.out.println("Digite um número");
	        nn = in.nextInt();
	        tabuada(nn);
	        }
		else if (val==3) {
			System.out.println("Digite sua idade");
			idade= in.nextInt();
			System.out.println("Digite seu sexo");
			sexo = in.next();
			aposentadoria(idade,sexo,feminino,masculino,a);
			}
		else if (val==4) {
			System.out.println("Digite a base");
			 base = in.nextInt();
			System.out.println("Digite o expoente");
			 expoente = in.nextInt();
			potencia(base,expoente, expoente);
		}}
	 public static int fatorial (int n1) {
		int i=1;
		int fatorial= 1;
		while(i<= n1) {
		fatorial*=i;
			i++;
		}
		return fatorial;
	}
	    public static void tabuada(int n) {
	    	for(int i=1;i<11;i++) {
	    		int r = n * i;
	    		System.out.println(n+"x"+i+"="+r);
	    			}
	    	}
 public static void aposentadoria(int id,String s,String f,String m,int t) {
		     switch(s) {
		    case "f" :
		    t = (55-id);
		    System.out.println( "Faltam " +t+  " anos para se aposentar");
		        break;  
		    }
		  switch(s) {
	    	case "m" :
	    	t = (60-id);
	    	System.out.println("Faltam " +t+  " anos para se aposentar");
			    break;
	  }}
     public static void potencia(int b, int e, int p) {
			  if (e>0){
               p =1;
          for(int i = 0;i<e;i++){
              p= p*b;
          }
          System.out.println("O resultado é " +p);
              }
      }
}