package adapterDrone;

public class TestDrone {

	public static void main(String[] args) {
		Drone drone = new SuperDrone();
		DroneAdapter droneAdapter = new DroneAdapter(drone);
		
		droneAdapter.fly();
		droneAdapter.quack();
	}

}
