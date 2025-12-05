package nestedClass.computer;

public class Computer {
	public class Processor {
		private String brand;
		private double speed;
		
		public Processor(final String brand, final double speed) {
			this.brand = brand;
			this.speed = speed;
		}
		
		public void displayDetails() {
			System.out.println("La marque du processeur est : " + brand);
			System.out.println("La vitesse du processeur est : " + speed + " GHz");
		}
	}
	
	public void showProcessorDetails() {
		Processor processor = new Processor("Intel", 3.35);
		processor.displayDetails();
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.showProcessorDetails();
	}
}
