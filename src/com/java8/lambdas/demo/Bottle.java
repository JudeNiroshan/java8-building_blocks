package com.java8.lambdas.demo;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class Bottle
{

  private String liquid = "Empty";

  private String owner = "Unknown";

  private int size = 0;

  private int amount = 0;

  public Bottle()
  {
  }

  public Bottle(String liquid, String owner, int size)
  {
    this.liquid = liquid;
    this.owner = owner;
    this.size = size;
  }

  @Override
  public String toString()
  {
    return "Bottle{" +
        "liquid='" + liquid + '\'' +
        ", owner='" + owner + '\'' +
        ", size=" + size +
        ", amount=" + amount +
        '}';
  }

  public void drink()
  {
    if (this.getAmount() > 0)
    {
      this.setAmount(this.getAmount() - 1);
    }
  }

  public int getAmount()
  {
    return amount;
  }

  public void setAmount(int amount)
  {
    this.amount = amount;
  }

  public String getLiquid()
  {
    return liquid;
  }

  public void setLiquid(String liquid)
  {
    this.liquid = liquid;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public int getSize()
  {
    return size;
  }

  public void setSize(int size)
  {
    this.size = size;
  }
}
