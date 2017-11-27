class DrinksMachineOps
{
 public static int spendOnCokes(int sum,DrinksMachine mach)
 {
  int count=0;
  mach.insert(sum);
  while(!mach.cokesEmpty()&&mach.getBalance()>=mach.getPrice())
     {
      mach.pressCoke();
      count++;
     }
  return count;
 }

 public static DrinksMachine cheaper(DrinksMachine m1,DrinksMachine m2)
 {
  if(m1.getPrice()<m2.getPrice())
     return m1;
  else
     return m2;
 }


}
