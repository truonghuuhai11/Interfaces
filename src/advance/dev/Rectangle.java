package advance.dev;

public class Rectangle extends Shape {
	private double width, height; // Chiều rộng và chiều cao

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double chuVi() {
		return 2 * (width + height);
	}

	@Override
	public double dienTich() {
		return width * height;
	}
}
