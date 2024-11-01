import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {


    @Test
    void noData() {

        Printer instance = new Printer();

        String word = "";
        int expected = 0;

        int actual = instance.getOrdlangd(word);


        assertEquals(expected, actual);
    }

    @Test
    void veryLongWord() {

        Printer instance = new Printer();

        String word = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int expected = 300;

        int actual = instance.getOrdlangd(word);


        assertEquals(expected, actual);
    }


    @Test
    void manyRows() {

        Printer printer = new Printer();
        printer.lineInput("t1");
        printer.lineInput("t2");
        printer.lineInput("t3");
        printer.lineInput("t4");
        printer.lineInput("t5");
        printer.lineInput("t6");
        printer.lineInput("t7");
        printer.lineInput("t8");
        printer.lineInput("t9");
        printer.lineInput("t10");


        assertEquals(10, printer.getRows());
    }


}





