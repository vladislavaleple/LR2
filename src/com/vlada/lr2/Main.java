package com.vlada.lr2;

public class Main
{

  public static void main (String[] args)
  {
    Item itm1 = new Item ("Name", "category", 12.34f, 3, 4643);

    System.out.println (itm1.toString ());
    System.out.println (itm1.hashCode ());
  }
}