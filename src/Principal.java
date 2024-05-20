import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lInferior, lSuperior;

        System.out.println("Informe o numero de limite inferior");
        lInferior = sc.nextInt();
        System.out.println("Informe o numero de limite superior");
        lSuperior = sc.nextInt();

        if (lInferior > lSuperior ) {
            System.out.println("Limite Superior precisa ser maior que limite inferior.0");
        }
        else if (lInferior <= 0) {
            System.out.println("limite inferior precisa ser maior que 0");
        }
        else {
            Intervalos verificar = new Intervalos(lInferior, lSuperior);
            verificar.somar();
        }
    }
}
