class DrinksCompany
{
 public DrinksCompany()
 {
 }

 public void cokesEmpty(ExtDrinksMachine2 mach)
 {
  System.out.println("Machine "+mach.getIdentity()+" reloaded with cokes");
  for(int i=0; i<10; i++)
      mach.loadCoke(new Can("coke"));
 }

 public void fantasEmpty(ExtDrinksMachine2 mach)
 {
  System.out.println("Machine "+mach.getIdentity()+" reloaded with fantas"); 
  for(int i=0; i<10; i++)
     mach.loadFanta(new Can("fanta"));
 }
}
