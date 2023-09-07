package main;

public class Main {
    public static void main(String[] args) {
        int horas = 1;
        int minutos = 30;
        int segundos = 20;

        converte(horas, minutos, segundos);

    }
    public static void converte(int horas, int minutos, int segundos){
        int horasC = (horas * 60) * 60;
        int minC = minutos * 60;
        int totalC = horasC + minC + segundos;
        int segundosDia = 86400;

        System.out.println("Se passaram " + totalC);
        System.out.println("Faltam " + (segundosDia - totalC));

    }
}
