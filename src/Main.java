import com.duolingo.entities.Diccionario;
import com.duolingo.utilities.depurador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int option = 7;
        String word, initial;
        Scanner keyboard = new Scanner(System.in);
        Diccionario dictionary = new Diccionario();



            while (option != 6) {

                System.out.println("Welcome to your dictionary");
                System.out.println("Please use one of the following options");
                System.out.println("1. Add a word");
                System.out.println("2. Delete a word");
                System.out.println("3. Would you like to know if a word already exists?");
                System.out.println("4. Display your existing initials list");
                System.out.println("5. Display you word lists");
                System.out.println("6. Close the dictionary");

                option = keyboard.nextInt();
                keyboard.nextLine();

                switch (option) {

                    case 1:
                        System.out.println("Please write the word");
                        word = keyboard.nextLine();
                        word = depurador.depuradorPalabritas(word);
                        dictionary.agregarPalabrita(word);
                        System.out.println("Word successfully added");
                        break;
                    case 2:
                        System.out.println("Which word do you want to delete?");
                        word = keyboard.nextLine();
                        word = depurador.depuradorPalabritas(word);
                        dictionary.eliminarPalabrita(word);
                        break;
                    case 3:
                        System.out.println("Enter a word");
                        word = keyboard.nextLine();
                        word = depurador.depuradorPalabritas(word);
                        dictionary.palabrasIguales(word);
                        break;
                    case 4:
                        dictionary.mostrarIniciales();
                        break;
                    case 5:
                        System.out.println("Please enter an initial");
                        initial = keyboard.nextLine();
                        initial = depurador.depuradorPalabritas(initial);
                        dictionary.mostrarPalabras(initial);
                        break;
                    case 6:
                        System.out.println("Closing the dictionary. Bye!...");
                        break;
                    default:
                        System.out.println("Please enter a number from 1 to 6");

                }


            }


        }

}
