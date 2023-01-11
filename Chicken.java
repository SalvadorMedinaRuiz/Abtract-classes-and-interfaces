
class Chicken extends Animal implements Edible 
{
		public Chicken()
		{
			name = "Chicken";
		}
		  @Override
		  public String howToEat() { //requires you to write howToEat method from EDIBLE
		    return "Chicken: Fry it";
		  }
		    
		  @Override
		  public String sound() { //requires you to write sound method from ANIMAL 
		    return "Chicken: cock-a-doodle-doo";
		  }
		  
		  @Override
		  public boolean equals(Object obj)
		  {
			  if (obj == null)
				  return false;
			  else if (obj instanceof Chicken)
			  {
				  Chicken chick = (Chicken) obj;
				  return this.name.equalsIgnoreCase(chick.name);
			  }
			  return false;
		  }
		
}
