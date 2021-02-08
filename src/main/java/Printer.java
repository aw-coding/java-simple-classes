public class Printer {

    private int sheets;
    private int toner;

    public Printer (int sheets, int toner){

        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }


    public int print(int pages, int copies){
        if (this.sheets > (pages * copies)) {
            this.toner -= (pages * copies);
            this.sheets -= (pages * copies);
            return this.sheets;
    } else {
            return 0;
        }
    }

}
