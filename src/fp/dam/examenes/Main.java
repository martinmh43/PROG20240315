package fp.dam.examenes;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
	
	static Stream<Order> getOrders() throws IOException, URISyntaxException {
		return Files.lines(Path.of(Main.class.getResource("/orders.csv").toURI())).map(Order::new);
	}
	
	static Stream<OrderDetail> getOrderDetails() throws IOException, URISyntaxException {
		return Files.lines(Path.of(Main.class.getResource("/orderdetails.csv").toURI())).map(OrderDetail::new);
	}

	public static void main(String[] args) {
		
	}
	
}
