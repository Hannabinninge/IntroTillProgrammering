import java.util.ArrayList;

public class Printer {
    public static void main(String[] args) {


        {

            System.out.println("Ange valfri text, avsluta genom att skriva `stop´");
            Input metod = new Input(); //låter en använda metoden "metod" ifrån Input
            ArrayList<String> lista = metod.metod(); //sätter ett namn på listan i denna klass

            int listlangd = lista.size(); //antal rader lagrade i listan
            int i = 0; //används för att cykla vilket objekt i listan som tas ut
            int total = 0; //Totala antalet tecken inskrivna

            System.out.println("Antal inskrivna rader: " + listlangd);

            while (listlangd > i) {
                int antal = (lista.get(i).length());
                i++;
                total += antal;
            }
            System.out.println("Antal inskrivna tecken: " + total);
        }

    }

    public static int countTotalCharacters(ArrayList<String> testList) {


        return 0;
    };


    public int getOrdlangd(String word) {

        return word.length();
    }

    private int rows;


    public Printer() {
        rows = 0;

    }

    public void lineInput(String Line){
        rows ++;
    }

    public int getRows (){
        return rows;


    }





}
