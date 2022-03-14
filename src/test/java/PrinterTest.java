import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void canPrint(){
        printer.printPages(5, 2);
        assertEquals(90, printer.paper);
    }

    @Test
    public void outOfPaper(){
        printer.paper = 60;
        printer.printPages(10, 5);
        assertEquals(10, printer.paper);
        assertEquals(50, printer.volume);
        printer.printPages(11, 5);
        assertEquals(10, printer.paper);
        assertEquals(50, printer.volume);
        }

    @Test
    public void outOfToner(){
        printer.volume = 60;
        printer.printPages(10, 5);
        assertEquals(50, printer.paper);
        assertEquals(10, printer.volume);
        printer.printPages(11, 5);
        assertEquals(50, printer.paper);
        assertEquals(10, printer.volume);
    }
}
