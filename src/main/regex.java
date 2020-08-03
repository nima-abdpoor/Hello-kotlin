package main;

public class regex {
    public void split(String regex){
        String [] array = new String[10];
        array  =regex.split("[.]");
        for (String s : array)
            System.out.println(s);
    }
}
