
public class myDriver{
  public static void main(String[] args){
    SuperArray testArray = new SuperArray();
    System.out.println("---initialize---");
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());

    System.out.println("---Test with adding Fish---");
    System.out.println(testArray.add("Fish"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.get(1));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());

    System.out.println("---clear array---");
    testArray.clear();
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());

    System.out.println("---set array bigger than size---");
    System.out.println(testArray.set(0,"tuba"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());

    System.out.println("---set array smaller than size---");
    System.out.println(testArray.add("Fish"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    System.out.println(testArray.set(0,"tuba"));
    System.out.println(testArray.get(0));
    System.out.println(testArray.size());
    System.out.println(testArray.isEmpty());
    testArray.clear();

    System.out.println("---add 11 times with resize---");
    testArray.add("Red Fish");
    testArray.add("Blue Fish");
    testArray.add("Green Fish");
    testArray.add("Yellow Fish");
    testArray.add("Pink Fish");
    testArray.add("Orange Fish");
    testArray.add("Black Fish");
    testArray.add("White Fish");
    testArray.add("Purple Fish");
    testArray.add("Brown Fish");
    System.out.println(testArray.size());
    System.out.println(testArray.add("Lonely Fish"));
    System.out.println(testArray.size());

    System.out.println("---test contains---");
    System.out.println(testArray.contains("Red Fish"));
    System.out.println(testArray.contains("error"));

    System.out.println("---index of---");
    testArray.set(3,"Red Fish");
    testArray.set(8,"Red Fish");
    System.out.println(testArray.indexOf("Red Fish"));
    System.out.println(testArray.lastIndexOf("Red Fish"));
    System.out.println(testArray.indexOf("Error"));
    System.out.println(testArray.indexOf("error"));

    System.out.println("---add with index---");
    testArray.clear();
    testArray.add(0,"Red Fish");
    System.out.println(testArray.indexOf("Red Fish"));
    testArray.add(4,"error");
    System.out.println(testArray.indexOf("error"));
    testArray.add(1,"Blue Fish");
    System.out.println(testArray.size());

    System.out.println("---remove int and toString---");
    testArray.add("Red Fish");
    testArray.add("Blue Fish");
    testArray.add("Green Fish");
    testArray.add("Yellow Fish");
    testArray.add("Pink Fish");
    testArray.add("Orange Fish");
    testArray.add("Black Fish");
    testArray.add("White Fish");
    testArray.add("Purple Fish");
    testArray.add("Brown Fish");
    System.out.println(testArray);
    System.out.println(testArray.remove(3));
    System.out.println(testArray);

    System.out.println("---remove string---");
    System.out.println(testArray);
    System.out.println(testArray.remove("Yellow Fish"));
    System.out.println(testArray);
    System.out.println(testArray.remove("error"));
    System.out.println(testArray);


  }
}
