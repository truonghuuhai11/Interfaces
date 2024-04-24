package advance.dev;

public class MainApp implements IShape {
	public static void main(String[] args) {
		MainApp app = new MainApp();
		Shape[] shapes = new Shape[10];
		app.input(shapes);
		app.print(shapes);
		app.findMaxAreaShape(shapes);
		app.findMaxAreaForEachType(shapes);
	}

	@Override
	public void input(Shape[] shapes) {
		// Ghi đè phương thức này nếu cần
	}

	@Override
	public void print(Shape[] shapes) {
		// Ghi đè phương thức này nếu cần
	}

	// Phương thức tìm hình có diện tích lớn nhất
	public void findMaxAreaShape(Shape[] shapes) {
		// Ghi đè phương thức này nếu cần
	}

	// Phương thức tìm diện tích lớn nhất của mỗi loại hình
	public void findMaxAreaForEachType(Shape[] shapes) {
		// Ghi đè phương thức này nếu cần
	}
}
