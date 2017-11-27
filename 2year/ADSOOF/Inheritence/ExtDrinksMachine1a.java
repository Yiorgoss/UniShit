import java.util.ArrayList;

class ExtDrinksMachine1a 
{
// A machine that sells sprites implemented by composition rather than inheritance.

 private ArrayList<Can> sprites;
 private DrinksMachine mach;
 private int balance,cash;

 public ExtDrinksMachine1a(int p)
 {
  mach = new DrinksMachine(p);
  balance=0;
  cash=0;
  sprites = new ArrayList<Can>();
 }

 public ExtDrinksMachine1a(int p,int c, int f,int s)
 {
  mach = new DrinksMachine(p,c,f);
  balance=0;
  cash=0;
  sprites = new ArrayList<Can>();
  for(int i=0; i<s; i++)
     loadSprite(new Can("sprite"));
 }

 public Can pressSprite()
 {
  int price=mach.getPrice();
  if(sprites.size()>0&&balance>=price)
     {
      Can can = sprites.get(0);
      sprites.remove(0);
      balance=balance-price;
      cash=cash+price;
      return can;
     }
  else
     return null;
 }

 public void loadSprite(Can can)
 {
  sprites.add(can);
 }

 public boolean spritesEmpty()
 {
  return sprites.size()==0;
 }

 public void insert(int n)
 {
  balance=balance+n;
 }

 public int getBalance()
 {
  return balance;
 }

 public int collectCash()
 {
  int oldCash = cash;
  cash = 0;
  return oldCash+mach.collectCash();
 }

 public int getPrice()
 {
  return mach.getPrice();
 }

 public int pressChange()
 {
  int change=balance;
  balance=0;
  return change;
 }

 public Can pressCoke()
 {
  int price=mach.getPrice();
  if(!mach.cokesEmpty()&&balance>=price)
     {
      balance=balance-price;
      mach.insert(price);
      return mach.pressCoke();
     }
  else
     return null;
 }

 public Can pressFanta()
 {
  int price=mach.getPrice();
  if(!mach.fantasEmpty()&&balance>=price)
     {
      balance=balance-price;
      mach.insert(price);
      return mach.pressFanta();
     }
  else
     return null;
 }

 public boolean cokesEmpty()
 {
  return mach.cokesEmpty();
 }

 public boolean fantasEmpty()
 {
  return mach.fantasEmpty();
 }

 public void setPrice(int p)
 {
  mach.setPrice(p);
 }

}
