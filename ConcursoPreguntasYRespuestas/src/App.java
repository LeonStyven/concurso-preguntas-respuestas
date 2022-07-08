import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            boolean run = true;

            System.out.println("Bienvenido");
            while(run){
                String answer; //respuesta del usuario por consola
                Player player;

                //Menu principal
                
                System.out.println("Ingrese una opcion como sigue: ");
                System.out.println("\n1. Crear nueva partida");
                System.out.println("2. Cargar una partida");
                System.out.println("3. Salir");

                //Obtener respuesta del usuario
                Scanner answers = new Scanner(System.in);
                answer = answers.nextLine();


                if(answer.isEmpty() || answer.isBlank()){ //Verificar que la respuesta exista
                    System.out.println("Por favor ingrese una opcion");
                }else if(answer.chars().allMatch(Character::isDigit)){ //Verificar que la respuesta sea un numero
                    if(Integer.parseInt(answer)>0 && Integer.parseInt(answer)<4){ //Verificar rango de respuesta
                        switch(Integer.parseInt(answer)){
                            case 1: Play();
                            break;
                            case 2: LoadPlayerData();
                            break;
                            case 3: SaveData();
                                    run = false;
                                    System.out.println("Adios");

                        }
                    }else{
                        System.out.println("El valor ingresado esta fuera del rango...");
                    }
                }else{
                    System.out.println("Debe introducir una respuesta valida...");
                }
                
            }

            


            File questions = new File("ConcursoPreguntasYRespuestas\\bancoPreguntas.txt");
            Scanner scanQuestions = new Scanner(questions);



        } catch (Exception e) {
            System.out.println("Error de ejecucion " + e);
        }finally{

        }
    }

    public static void Play(){


    }
    public static void LoadQuestions() throws Exception{

        //Variables para el cargado del archivo
        BufferedReader bufferedReader = null;
        String[] questionData = null;

        List<Question>[] questions = null; //Vector de listas, cada posicion corresponde a una lista con cierta dificultad
        try{
            //Cargado de preguntas por categorias

        }catch(Exception e){
            throw new Exception("Problema al cargar las preguntas");
        }
    }
    public static void LoadPlayerData() throws Exception{

        //Variables para el cargado del archivo
        BufferedReader bufferedReader = null;
        String[] playerData = null;
        
        try {
            //Cargado de archivo de texto
            bufferedReader = new BufferedReader(new FileReader("ConcursoPreguntasYRespuestas\\players-info.txt"));
            String row; //Fila del archivo = 1 jugador
            bufferedReader.mark(0);
            bufferedReader.reset();
            int optionCount =0; //contador para saber en que linea esta el jugador seleccionado

            System.out.println("Ingrese el numero del jugador ");
            while((row=bufferedReader.readLine()) != null){
                optionCount++;
                StringBuilder stringBuilder = new StringBuilder();
                playerData=row.split(",");
                System.out.println("optionCount" + ". " + playerData[0]);

                /*
                 * TERMINAR SELECCION DE PERFIL
                 * 
                 * Puede probar indexed-file-reader (Licencia Apache 2.0).
                 * La clase IndexedFileReader tiene un método llamado readLines(int from, int to) 
                 * que devuelve un SortedMap cuya clave es el número de línea y el valor es la línea 
                 * que se leyó.

                    Ejemplo:

                    File file = new File("src/test/resources/file.txt");
                    reader = new IndexedFileReader(file);

                    lines = reader.readLines(6, 10);
                 */
            }
            

            

            
        } catch (Exception e) {
            throw new Exception("Error al cargar la informacion del jugador");
        }
        
    }
    public static void SaveData(){

    }
}
