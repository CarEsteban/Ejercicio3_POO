import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

import java.math.*;

public class PrincipalUniversidad{
    public static void main(String[] args) throws InterruptedException {

        boolean menu = true;
        int opcMenu = 0,opcSede=0,opcEst=0,aux=0,cantidadSede=0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Sede> sedes = new ArrayList<Sede>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        //Se agregó este fragmento del código para poder contador cuantos estudiantes hay por sede y así poder usar el dato para las estadísticas
        ArrayList<Integer> estudiantesPorSede = new ArrayList<Integer>();

        sedes.add(new Sede(1,"Mazatenango", null, null));
        sedes.add(new Sede(2, "Guatemala", null, null));
        sedes.add(new Sede(3, "Escuintla", null, null));
            

        for (int i = 0; i < sedes.size(); i++) {
            estudiantesPorSede.add(0);

        }

        while(menu){
            try {
                System.out.println("Ingrese la opción que desea seguir: \n1. Ingresar estudiante\n2. Ingresar notas del estudiante\n3. Mostrar estadísticas por sede\n4. Salir");
               
                opcMenu = scan.nextInt();
                if (opcMenu < 1 || opcMenu > 4) {
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-4).");
                    Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

            switch(opcMenu){
                case 1:
                    System.out.println("BIENVENIDO AL REGISTRO DE USUARIOS");
                    System.out.println("==================================");
                    opcEst=0;
                    while(opcEst==0){

                        aux++;
                        try {
                            System.out.println("De que sede es el estudiante?");
                            for (int i = 0; i < sedes.size(); i++) {
                                Sede sede = sedes.get(i);
                                System.out.println((i+1) + ": " + sede.getNombreSede());
                            }
                            opcSede = scan.nextInt();
                            scan.nextLine();
                            if (opcSede < 1 || opcSede > 3) {
                                System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-3).");
                                Thread.sleep(1000);
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Error " + e);
                            Thread.sleep(1000);
                        }

                        for(int i=0;i<sedes.size(); i++){
                            if(opcSede==sedes.get(i).getID()){
                                int contadorSede = estudiantesPorSede.get(i);
                                contadorSede++;
                                estudiantesPorSede.set(i, contadorSede);
                            }
                        }

                        for(int i = 0; i<sedes.size(); i++){
                            System.out.println("a" + estudiantesPorSede.get(i));
                        }
                                    
                        System.out.print("Ingrese el nombre: ");
                        String nombre = scan.nextLine();

                        System.out.print("Ingrese el apellido: ");
                        String apellido = scan.nextLine();

                        System.out.print("Su código único sería: " + aux);

                        System.out.print("Ingrese la fecha de nacimiento: ");
                        String fechaNac = scan.nextLine();

                        System.out.print("Ingrese el correo: ");
                        String correo = scan.nextLine();

                        System.out.println("El estudiante " +  nombre + " es de la sede: " + sedes.get(opcSede-1).getNombreSede());
                        String sede = sedes.get(opcSede-1).getNombreSede();
                        
                        estudiantes.add(new Estudiante(nombre, apellido, aux, fechaNac, correo, sede, null));

                        System.out.println(estudiantes.get(aux-1));

                        
                        System.out.println("Desea ingresar otro estudiante? (0 para sí, 1 para no)");
                        opcEst = scan.nextInt();
                        scan.nextLine();
                    }

                    break;

                case 2:
                    System.out.println("BIENVENIDO");
                    System.out.println("==================================");
                    for (Estudiante estudiante : estudiantes) {
                        System.out.println(estudiante);
                    }
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    for(int i=0;i<=30;i++){
                        System.out.println(".");
                        Thread.sleep(20);
                    }
                    menu = false;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
            }
        }

        System.out.println("Acabas de salir del menu");




        //ArrayList<Curso> cursos = new ArrayList<Curso>();
        //Curso curso1 = new Curso("Matemáticas", "Mazatenango", 1  , 90);
        //Curso curso2 = new Curso("Lenguaje", "Mazatenango", 2  , 90);



    }
}