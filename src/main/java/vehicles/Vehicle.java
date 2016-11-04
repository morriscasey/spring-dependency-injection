package vehicles;

import parts.Engine;

public class Vehicle
{
	Engine myEngine;
	
	public Vehicle(Engine addEngine){
		this.myEngine = addEngine;
	}
	
	public void crankIgnition(){
		myEngine.startEngine();
	}
}
