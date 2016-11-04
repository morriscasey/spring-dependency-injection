package parts;

public class SmallEngine extends Engine
{

	public SmallEngine(int newHorsePower)
	{
		super(newHorsePower);
	}

	@Override
	public void startEngine()
	{
		System.out.println("started small " + horsePower + "hp engine");
	}

}
