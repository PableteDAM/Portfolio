import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto Scanner para capturar datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la información del personaje
        String nombre;
        String raza = "";
        String clase = "";
        int eleccion;
        int puntosHabilidad = 100;
        int fuerza = 0;
        int destreza = 0;
        int inteligencia = 0;

        // Mostrar cabecera
        System.out.println(" _____________________________________________________ ");
        System.out.println("|                                                     |");
        System.out.println("|    )/(              )        (              )       |");
        System.out.println("|   /(())            /(       )(             /(       |");
        System.out.println("|  (())())  _____   (())_   _((_)   _____   (_))_     |");
        System.out.println("|  | |_| | |  ___| |   __| |  _  | |  ___| |   __|    |");
        System.out.println("|  |  _  | |  __|  |  _ \\  | |_| | |  __|   \\_ \\_     |");
        System.out.println("|  |_| |_| |_____| |_| \\_| |_____| |_____| |_____|    |");
        System.out.println("|_____________________________________________________|");

        // Solicitar nombre del personaje
        System.out.print("\nPor favor, ingresa el nombre de tu personaje: ");
        nombre = scanner.nextLine();

        System.out.println("_______________________________________________________");

        // Solicitar raza del personaje
        System.out.println("Elige la raza de tu personaje:");
        System.out.println("1. Humano/a");
        System.out.println("2. Elfo/a");
        System.out.println("3. Enano/a");
        System.out.println("4. Orco/a");
        System.out.print("Seleccione la raza: ");

        eleccion = scanner.nextInt();



        // HACER USO DE WHILE Y SWITCH PARA SELECCIÓN DE RAZA


        switch (eleccion) {
             case 1:
                 System.out.println("Has escogido Humano/a");
                 raza = "humano/a";
                 break;
             case 2:
                 System.out.println("Has escogido Elfo");
                 raza = "Elfo/a";
                 break;
             case 3:
                 System.out.println("Has escogido Enano");
                 raza = "Enano/a";
                 break;
             case 4:
                 System.out.println("Has escogido Orco");
                 raza = "Orco/a";
                 break;
             }

        while (eleccion > 4 || eleccion < 1) {

            System.out.print("Elección errónea, seleccione nuevamente la clase:");
            eleccion = scanner.nextInt();
        }



        System.out.println("_______________________________________________________");

        // Solicitar clase del personaje
        System.out.println("Elige la clase de tu personaje:");
        System.out.println("1. Guerrero/a");
        System.out.println("2. Mago/a");
        System.out.println("3. Ladrón/a");
        System.out.println("4. Arquero/a");
        System.out.print("Introduce la clase: ");
        eleccion = scanner.nextInt();



       

        // Solicitar estadísticas (fuerza, destreza, inteligencia)

        // Fuerza

        System.out.print("Ingresa los puntos de fuerza (0-100):  ");
        fuerza = scanner.nextInt();

        while (fuerza > 100) {
            System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Fuerza (0-100): ");
            fuerza = scanner.nextInt();

            while (fuerza < 0) {
                System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Fuerza (0-100): ");
                fuerza = scanner.nextInt();

            }
        }

        while (fuerza < 0) {
            System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Fuerza (0-100): ");
            fuerza = scanner.nextInt();

            while (fuerza > 100) {
                System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Fuerza (0-100): ");
                fuerza = scanner.nextInt();

            }
        }

        if (fuerza == puntosHabilidad){
            System.out.println("_______________________________________________________");

            // Mostrar personaje creado
            System.out.println("Nombre elegido: " + nombre);
            System.out.println("Raza elegida: " + raza);
            System.out.println("Clase elegida: " + clase);
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Destreza: " + destreza);
            System.out.println("Inteligencia: " + inteligencia);
            return;
        }

        puntosHabilidad = puntosHabilidad - fuerza;

        //destreza

        System.out.print("Ingresa los puntos de Destreza (0-" + (puntosHabilidad) + "): ");
        destreza = scanner.nextInt();

        while (destreza > puntosHabilidad) {
            System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Destreza (0-" + (puntosHabilidad) + "): ");
            destreza = scanner.nextInt();

            while (destreza < puntosHabilidad ) {
                System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Destreza (0-" + (puntosHabilidad) + "): ");
                destreza = scanner.nextInt();
            }
        }

        while (destreza < 0) {
            System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Destreza (0-" + (puntosHabilidad) + "): ");
            destreza = scanner.nextInt();

            while (destreza > puntosHabilidad) {
                System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Destreza (0-" + (puntosHabilidad) + "): ");
                destreza = scanner.nextInt();

            }
        }

        if (destreza == puntosHabilidad) {
            System.out.println("_______________________________________________________");

            // Mostrar personaje creado
            System.out.println("Nombre elegido: " + nombre);
            System.out.println("Raza elegida: " + raza);
            System.out.println("Clase elegida: " + clase);
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Destreza: " + destreza);
            System.out.println("Inteligencia: " + inteligencia);
            return;
        }


        //Inteligencia



        System.out.print("Ingresa los puntos de Inteligencia (0-" + (puntosHabilidad  - destreza) + "): ");
        inteligencia = scanner.nextInt();

        while (inteligencia > (puntosHabilidad  - destreza)) {
            System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Inteligencia (0-" + (puntosHabilidad-destreza) + "): ");
            inteligencia = scanner.nextInt();

            while (inteligencia < (puntosHabilidad  - destreza)) {
                System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Inteligencia (0-" + (puntosHabilidad-destreza) + "): ");
                inteligencia = scanner.nextInt();
            }
        }

        while (inteligencia < 0) {
            System.out.print("No se admiten puntos negativos, ingrese correctamente los puntos de Inteligencia (0-" + (puntosHabilidad-destreza) + "): ");
            inteligencia = scanner.nextInt();

            while (inteligencia > (puntosHabilidad - destreza)) {
                System.out.print("Puntos insuficientes, ingrese correctamente los puntos de Inteligencia (0-" + (puntosHabilidad  - destreza) + "): ");
                inteligencia = scanner.nextInt();

            }
        }

        if (inteligencia == (puntosHabilidad - destreza)) {
            System.out.println("_______________________________________________________");

            // Mostrar personaje creado
            System.out.println("Nombre elegido: " + nombre);
            System.out.println("Raza elegida: " + raza);
            System.out.println("Clase elegida: " + clase);
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Destreza: " + destreza);
            System.out.println("Inteligencia: " + inteligencia);
            return;
        }

        System.out.println("_______________________________________________________");

    
    }
}
