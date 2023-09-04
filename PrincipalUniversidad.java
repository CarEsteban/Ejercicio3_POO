import java.util.ArrayList;
import java.util.Scanner;

import java.math.*;

public class PrincipalUniversidad{
    public static void main(String[] args) throws InterruptedException {

        boolean menu = true;
        int opcMenu = 0,opcSede=0,opc=0,aux=0;
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Curso>> cursosEstudiantes = new ArrayList<ArrayList<Curso>>();
        ArrayList<Curso> cursosbase = new ArrayList<Curso>();

        cursosbase.add(new Curso("Matemática",01 ));
        cursosbase.add(new Curso("Lenguaje",02 ));
        cursosbase.add(new Curso("Química",03 ));
        cursosbase.add(new Curso("Física",04 ));
        cursosbase.add(new Curso("Comprensión Lectora",05 ));
        cursosbase.add(new Curso("Estadística",06 ));


        ArrayList<Sede> sedes = new ArrayList<Sede>();
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        //Se agregó este fragmento del código para poder contador cuantos estudiantes hay por sede y así poder usar el dato para las estadísticas
        ArrayList<Integer> estudiantesPorSede = new ArrayList<Integer>();

        sedes.add(new Sede(1,"Mazatenango", null, null));
        sedes.add(new Sede(2, "Guatemala", null, null));
        sedes.add(new Sede(3, "Escuintla", null, null));
            
        //Se agregó este fragmento del código para poder contador cuantos estudiantes hay por sede y así poder usar el dato para las estadísticas
        for (int i = 0; i < sedes.size(); i++) {
            estudiantesPorSede.add(0);

        }
        while(menu){
            System.out.println("BIENVENIDO AL SERVICIO PRINCIPAL DE LA UNIVERSIDAD");
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
                    opc=0;
                    while(opc==0){

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
                            break;
                        }

                        for(int i=0;i<sedes.size(); i++){
                            if(opcSede==sedes.get(i).getID()){
                                int contadorSede = estudiantesPorSede.get(i);
                                contadorSede++;
                                estudiantesPorSede.set(i, contadorSede);
                            }
                        }

                        for( int i = 0; i<sedes.size(); i++){
                            System.out.println("a" + estudiantesPorSede.get(i));
                        }
                                    
                        System.out.print("Ingrese el nombre: ");
                        String nombre = scan.nextLine();

                        System.out.print("Ingrese el apellido: ");
                        String apellido = scan.nextLine();

                        System.out.println("Su código único sería: " + aux);

                        System.out.print("Ingrese la fecha de nacimiento: ");
                        String fechaNac = scan.nextLine();

                        System.out.print("Ingrese el correo: ");
                        String correo = scan.nextLine();

                        System.out.println("El estudiante " +  nombre + " es de la sede: " + sedes.get(opcSede-1).getNombreSede());
                        String sede = sedes.get(opcSede-1).getNombreSede();
                        
                        estudiantes.add(new Estudiante(nombre, apellido, aux, fechaNac, correo, sede,null));

                        System.out.println(estudiantes.get(aux-1));

                        
                        System.out.println("Desea ingresar otro estudiante? (0 para sí, 1 para no)");
                        opc = scan.nextInt();
                        scan.nextLine();
                    }


                    break;

                case 2:
                    System.out.println("BIENVENIDO AL INGRESO DE NOTAS X ESTUDIANTE");
                    System.out.println("============================================");
                    
                    opc=0;
                    while(opc==0){
                        
                        for(int i=0; i<estudiantes.size();i++){
                            System.out.println("Estos son los estudiantes que aún no les han asignado notas:");
                        
                            if (estudiantes.isEmpty()) {
                                System.out.println("Todavía no hay estudiantes");
                                break;
                            } else {

                                boolean hayEstudiantesConCursosNulos = false;

                                for (int j = 0; j < estudiantes.size(); j++) {
                                    if (estudiantes.get(j).getCursos() == null) {
                                        System.out.println(estudiantes.get(j).getCodigoUnico() + ". " + estudiantes.get(j).getNombres());
                                        hayEstudiantesConCursosNulos = true; 
                                    }
                                }

                                if (!hayEstudiantesConCursosNulos) {
                                    System.out.println("Ya no hay más estudiantes");
                                    opc = 1;
                                }

                            }
                            
                            if(opc==1){
                                break;
                            }

                            System.out.println("A que estudiante desea agregarle sus notas? (0 para no asignar)");
                            int aggEst = scan.nextInt();
                            scan.nextLine();

                            if(aggEst==0){
                                opc=1;
                                break;
                            }

                            System.out.println("Estudiante seleccionado: " + estudiantes.get(aggEst-1).getNombres());

                            System.out.println("Estos son los cursos actuales");

                            System.out.println("===========================================");
                            for (Curso curso : cursosbase) {
                                System.out.println(curso.getID_curso() + ". " + curso.getNombre());
                            }
                            System.out.println("===========================================");

                            for (Curso curso : cursosbase) {
                                System.out.println("Ingrese la del curso de " + curso.getNombre());
                                int nota =  scan.nextInt();
                                if(nota>100 || nota<0){
                                    System.out.println("Lo siento, esta nota no es real rey");
                                    break;
                                }else{
                                    curso.setNota(nota);
                                }


                            }

                            cursosEstudiantes.add(cursosbase);

                            estudiantes.get(aggEst-1).setCursos(cursosEstudiantes.get(i));

                        }


                    }


                case 3:
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    for( int i=0;i<=30;i++){
                        System.out.println(".");
                        Thread.sleep(20);
                    }
                    menu = false;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
            }
            
            try {
                System.out.println("Desea regresar al menu principal? (0 para regresar, 1 para terminar el programa)");
                opc = scan.nextInt();
                scan.nextLine();
                if(opc==0){
                    menu=true;
                }else{
                    menu=false;
                }
            } catch (Exception e) {
                System.out.println("Opción no válida");
                break;
            }
        }

        System.out.println("Acabas de salir del menu");



        scan.close();



    }
}