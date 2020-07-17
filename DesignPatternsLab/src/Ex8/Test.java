package Ex8;

public class Test {

	public static void main(String[] args) {
		
		TV sonyTv = new SonyTv();
		LGtv lgtv = new LGtv();
		
		
		new RemoteControllerImpl(lgtv).on();
		new RemoteControllerImpl(lgtv).off();
		new RemoteControllerImpl(lgtv).tune(10);
		
		new RemoteControllerImpl(sonyTv).on();
		new RemoteControllerImpl(sonyTv).off();
		new RemoteControllerImpl(sonyTv).tune(20);

	}

}
