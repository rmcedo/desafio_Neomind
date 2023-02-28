import relogio.object.Relogio;

import java.util.Scanner;

public class Main {

    static int hourInput;
    static int minInput;
    static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("\n #### CONVERSÃO DE HORA E MINUTOS PARA ANGULO #### ");
        System.out.println("\n 0 - SAIR");
        System.out.println("\n 1 - CONVERSÃO");
       byte option = in.nextByte();


        do {
                  switch (option) {
                case 0 -> System.out.println("\nSAINDO...");
                case 1 -> {
                    captureValues();
                    Relogio calculo = new Relogio();
                    int ang = calculo.retornaAnguloRelogio(hourInput, minInput);
                    System.out.println("\nHora: " + hourInput);
                    System.out.println("\nMinutos: " + minInput);
                    System.out.println("\nO angulo formado pelos ponteiros de hora e minutos foi de: " + ang);
                    System.out.println("########### ");
                }
                default -> System.out.println("\nPor favor, selecione uma opção válida");
            }

        } while (option != 0);



    }

    public static void captureValues(){
        boolean loop;
        Relogio clock = new Relogio();
        do {

            try {
                System.out.println("\nInsira um valor de hora entre 0 e 23");
                hourInput = in.nextInt();
                if (hourInput >23 || hourInput< 0){
                    System.out.println("\nApenas os números entre 0 e 23 são válidos");
                    loop = false;
                } else {
                    loop = true;
                    clock.setHora(hourInput);
                }
            } catch (Exception e){
                System.out.println("\nValor não é compatível com HORAS");
                System.out.println("\nPor favor, tente novamente!");
                loop = false;
            }

        } while(!loop);

        System.out.println("\nSeguindo: Vamos definir os minutos\n");

        do {

            try{
                System.out.println("\nInsira um valor de minutos entre 0 e 59");
                minInput = in.nextInt();
                if (minInput>59 || minInput<0){
                    System.out.println("\nApenas os números entre o 0 e 59 são válidos");
                    loop = false;
                }else {
                    loop = true;
                    clock.setMinuto(minInput);
                }
            } catch(Exception e){
                System.out.println("\nValor não é compátivel com MINUTOS");
                System.out.println("\nPor favor, tente novamente");
                loop = false;
        }

    } while(!loop);



}}