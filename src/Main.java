public class Main {
    public static void main(String[] args)
    {
        //ejercicio if
        int numeroIf = -12;
        if (numeroIf > 0)
        {
            System.out.println("El numero es positivo "+numeroIf);
        }
        else if (numeroIf == 0)
        {
            System.out.println("El numero es cero "+numeroIf);

        }
        else
        {
            System.out.println("El numero es negativo "+numeroIf);
        }
        //ejercicio bucle
        int numeroWhile = 0;
        while (numeroWhile < 3)
        {
            numeroWhile++;
            System.out.println("numero "+ numeroWhile);
        }
        //buble do-while
        int numeroDo_while = 0;
        do {
            numeroDo_while++;
            System.out.println("El numero es "+numeroDo_while);
        }
        while (numeroDo_while < 1);
        //buble for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
        {
            System.out.println(numeroFor);
        }
        //bucle switch
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("La estacion es :"+estacion);
                break;
            case "invierno":
                System.out.println("La estacion es :"+estacion);
                break;
            case "primavera":
                System.out.println("La estacion es :"+estacion);
                break;
            case "otono":
                System.out.println("La estacion es :"+estacion);
                break;
            default:
                System.out.println("la variable no es una estacion ");
        }
    }
}