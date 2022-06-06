public class EJT4 {
    public static void main(String[] args){
        //variables
        int numeroIf = (-23);
        int numeroWhile = (-2);
        int numeroDoWhile = 4;
        String estacion = "Primavera";

        //punto1
        if (numeroIf>=1){
            System.out.println("El numeroIf es positivo");
        }else if (numeroIf<=-1){
            System.out.println("El numeroIf es negativo");
        }
        else {
            System.out.println("El numeroIf es igual a 0");
        }

        //punto2
        while(numeroWhile < 3 ){
            System.out.println("numeroWhile es: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //punto3
        do {
          System.out.println("numeroDoWhile es: " + numeroDoWhile);
          numeroDoWhile =  numeroDoWhile +1;
        }while (numeroDoWhile <3);

        //punto3
        for (int numeroFor = 0;numeroFor<=3;numeroFor = numeroFor+1){
            System.out.println("numeroFor es: "+ numeroFor);
        }

        //punto4
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Valor de estacion invalido");
        }
        }
    }

