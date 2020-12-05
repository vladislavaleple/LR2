package com.vlada.lr2;

import java.io.Serializable;

public final class Item implements Comparable, Serializable
{
  private String name;
  private String category;
  private float price;
  private int count;
  private int color;

  public Item (String name, String category, float price, int count, int color)
  {
    this.name = name;
    this.category = category;
    this.price = price;
    this.count = count;
    this.color = color;
  }

  public String getName ()
  {
    return name;
  }

  public String getCategory ()
  {
    return category;
  }

  public float getPrice ()
  {
    return price;
  }

  public int getCount ()
  {
    return count;
  }

  public int getColor ()
  {
    return color;
  }

  @Override
  public boolean equals (Object object)
  {
    if (this == object)
    {
      return true;
    } else if ((object == null) || (getClass () != object.getClass ()))
    {
      return false;
    }
    Item item = (Item) object;
    return hashCode () == item.hashCode ();
  }

  @Override
  public int hashCode ()
  {
    return toString ().hashCode ();
  }

  public Item clone (Item item)
  {
    return new Item (item.name, item.category, item.price, item.count, item.color);
  }

  @Override
  public String toString ()
  {
    return name + ' ' + category + ' ' + price + ' ' + count + ' ' + color;
  }

  @Override
  public int compareTo (Object comparable)
  {
    Item item = (Item) comparable;
    if (item.equals (this)) { return 1; }
    return 0;
  }
}