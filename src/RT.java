import java.util.HashMap;

public class RT {
    protected HashMap<Integer , TableCell> tableRecords ;

    public RT(String type) {
        switch (type){
            case "A":
                Utilities a1 = new Utilities();
                a1.readTable();
            case "B":
            case "C":
            case "D":


        }
        this.tableRecords = tableRecords;
    }
}
