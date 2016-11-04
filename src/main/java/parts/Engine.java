package parts;

public abstract class Engine
{
	protected int horsePower;
	public Engine(int newHorsePower){
		this.horsePower = newHorsePower;
	}
	public abstract void startEngine();
	
}
