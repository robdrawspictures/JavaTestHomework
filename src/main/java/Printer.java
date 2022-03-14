public class Printer {

    public int paper;
    public int volume;

    public Printer(){
        this.paper = 100;
        this.volume = 100;
    }

    public String printPages(int pages, int copies) {
        if (pages * copies > paper) {
            return "Please refill paper tray.";
        } else if (volume < pages * copies) {
            return "Please refill toner cartridge.";
        } else {
                paper -= pages * copies;
                volume -= pages * copies;
                return "Printing complete";
            }
        }
}
