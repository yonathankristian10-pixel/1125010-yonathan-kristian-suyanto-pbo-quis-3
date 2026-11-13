package view;
import java.util.ArrayList;
import java.util.list;
import java.util.Scanner;

public class Dataview<t> {
    private list<t> records;
    protected Scanner input =new Scanner(System.in);

    public Dataview(){
        records = new ArrayList<>();
    }
    public void printall(){
        String[] fields=getFields();
        for (String field:fields){
            System.out.print(field+"\t");
        }
        System.out.println();
        for (t record:records){
           String[] values=getValues(record);
           for (String value:values){
               System.out.print(value+"\t");
           }
           System.out.println();
        }
    }

    public void printBypk(String pk){
        
    }

    
}
