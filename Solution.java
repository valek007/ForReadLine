import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in);
        FileInputStream stream= new FileInputStream(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = stream.read(); stream.available()>0 ; i=stream.read()){
            list.add(i);
        }
        for (Integer i:list){
            System.out.print(i+" ");
        }
        stream.close();
    }
}
