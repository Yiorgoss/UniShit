import java.util.ArrayList;

class ExtDrinksMachine2 extends DrinksMachine
{
 protected DrinksCompany supplier;
 protected String identity;

 public ExtDrinksMachine2(DrinksCompany link,String id,int p)
 {
  super(p);
  identity = id;
  supplier = link;
 }

 public ExtDrinksMachine2(DrinksCompany link,String id,int p,int c, int f)
 {
  super(p,c,f);
  identity = id;
  supplier = link;
 }

 public Can pressCoke()
 {
  if(cokes.size()>0&&balance>=price)
     {
      Can can = cokes.get(0);
      cokes.remove(0);
      if(cokes.size()==0)
         supplier.cokesEmpty(this);
      balance=balance-price;
      cash=cash+price;
      return can;
     }
  else
     return null;
 }

 public Can pressFanta()
 {
  if(fantas.size()>0&&balance>=price)
     {
      Can can = fantas.get(0);
      fantas.remove(0);
      if(fantas.size()==0)
         supplier.fantasEmpty(this);
      balance=balance-price;
      cash=cash+price;
      return can;
     }
  else
     return null;
 }

 public String getIdentity()
 {
  return identity;
 }

}
