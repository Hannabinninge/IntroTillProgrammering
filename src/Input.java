import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> metod() {

        String indata = ""; //inskriven text i konsolen
        ArrayList<String> lista = new ArrayList<String>(); //namnet på listan som lagrar inskriven text i konsol

        while (1 > 0) { //Fortsätter tills loopen manuellt bryts med "stop"
            indata = scanner.nextLine();

            if (Objects.equals(indata, "stop")) {
                break;

            } else {
                lista.add(indata); //varje inskriven rad läggs i ArrayList

            }
        }
        return lista;
    }
}
