import java.util.ArrayList;

class ExtDrinksMachine1 extends DrinksMachine
{
 private ArrayList<Can> sprites;

 public ExtDrinksMachine1(int p)
 {
  super(p);
  sprites = new ArrayList<Can>();
 }

 public ExtDrinksMachine1(int p,int c, int f,int s)
 {
  super(p,c,f);
  sprites = new ArrayList<Can>();
  for(int i=0; i<s; i++)
     loadSprite(new Can("sprite"));
 }

 public Can pressSprite()
 {
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

}
