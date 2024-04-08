package ca.mcgill.cs.swdesign.iterator.customarray;

public class Client {

    public static void main(String[] args){
        CustomArrayList<String> myCustomArr = new CustomArrayList<>();
        myCustomArr.add("value1");
        myCustomArr.add("value2");
        myCustomArr.add("value3");
        myCustomArr.add("value4");

        for (String s : myCustomArr){
            System.out.println(s);
        }

    }
}
