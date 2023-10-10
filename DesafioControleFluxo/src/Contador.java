import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Insira o primeiro numero: ");
        numero1 = leitura.nextInt();

        System.out.println("Insira o segundo numero: ");
        numero2 = leitura.nextInt();

        try{

            contar (numero1, numero2);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior do que o primeiro");
        }
        leitura.close();
    }

    public static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        int contador = 0;
        if (numero1 > numero2) throw new ParametrosInvalidosException();

        for (int contagem = numero2 - numero1; contagem > 0; contagem--){
            contador++;
            System.out.println("Contando numero: " + contador);
        }
    }
}
