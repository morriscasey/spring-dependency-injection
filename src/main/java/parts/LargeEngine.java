package parts;

public class LargeEngine extends Engine
{

	public LargeEngine(int newHorsePower)
	{
		super(newHorsePower);
	}

	@Override
	public void startEngine()
	{
		System.out.println("started large " + this.horsePower + "hp engine");
		
	}


}
