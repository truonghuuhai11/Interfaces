package advance.dev;

public class Circle extends Shape {
	private double radius; // B�n k�nh

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double chuVi() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double dienTich() {
		return Math.PI * radius * radius;
	}
}
