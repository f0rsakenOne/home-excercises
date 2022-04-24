package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(29, 59, 80, 15, true); //x is too small
        Parcel parcel2 = new Parcel(45, 25, 80, 15, true); //y is too big
        Parcel parcel3 = new Parcel(45, 74, 80, 29, false); //weight is small
        Parcel parcel4 = new Parcel(45, 74, 80, 14, true); //weight is small express
        Parcel parcel5 = new Parcel(45, 74, 80, 78, true); // all ok
        System.out.println(parcel1.validate());
        System.out.println(parcel2.validate());
        System.out.println(parcel3.validate());
        System.out.println(parcel4.validate());
        System.out.println(parcel5.validate());
    }
}
