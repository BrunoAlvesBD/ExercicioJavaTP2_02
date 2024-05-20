public class Intervalos {
    int intervaloInferior;
    int intervaloSuperior;

    public Intervalos(int intervaloInferior, int intervaloSuperior) {
        this.intervaloInferior = intervaloInferior;
        this.intervaloSuperior = intervaloSuperior;
    }

    public void somar(){
        int pares = 0;
        int impares = 0;
        for (int i = intervaloInferior; i <= intervaloSuperior; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        System.out.println("Soma dos números pares: " + pares);
        System.out.println("Soma dos números ímpares: " + impares);
    }
}