package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
    Bicycle Ukraine = new Bicycle();
    Bicycle BMX = new Bicycle(1,12, 90, "China");
    Bicycle Mountain = new Bicycle(21,16, 120, "China", "steel", "green", 17, "mountain","disc");

    System.out.println("____________Ukraine____________");
        System.out.println(Ukraine.toString());
    System.out.println("____________BMX____________");
        System.out.println(BMX.toString());
    System.out.println("____________Mountain____________");
        System.out.println(Mountain.toString());

    System.out.println();
    System.out.println(Mountain.printSizeOfFrame());
    System.out.println(Bicycle.printStaticSizeOfFrame());

    int size = 4;
    Bicycle arrayOfBicycles[] = new Bicycle[size];
    for (int i = 0; i<size;i++)
    {
        arrayOfBicycles[i]= new Bicycle();
    }

    System.out.println();
    for (Bicycle iterator : arrayOfBicycles){
        System.out.println(iterator.toString());
        System.out.println();
    }


    }
}
