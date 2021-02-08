import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10, 15);
    }

    @Test
    public void printerHasSheets(){
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void printerHasToner(){
        assertEquals(15, printer.getToner());
    }

    @Test
    public void printTest(){
        printer.print(4, 2);
        assertEquals(2, printer.getSheets());
    }

    @Test
    public void printTestOverCapacity(){
        assertEquals(0, printer.print(20, 10));
    }

    @Test
    public void TonerDecreaseTest(){
        printer.print(4, 2);
        assertEquals(7, printer.getToner());
    }




}
