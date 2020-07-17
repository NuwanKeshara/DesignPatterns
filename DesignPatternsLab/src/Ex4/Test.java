package Ex4;

public class Test {

	public static void main(String[] args) {
		
		Light livingRoomLight = new LivingRoomLight();
		Light kitchenLight = new KitchenLight();
		
		Command lightOnCommand = new LightOnCommand(livingRoomLight);
		lightOnCommand.execute();
		
		Command lightOffCommand = new LightOffCommand(livingRoomLight);
		lightOffCommand.execute();
		
		
		Command lightOnCommand2 = new LightOnCommand(kitchenLight);
		lightOnCommand2.execute();
		
		Command lightOffCommand2 = new LightOffCommand(kitchenLight);
		lightOffCommand2.execute();
	}

}
