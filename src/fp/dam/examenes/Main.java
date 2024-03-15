package fp.dam.examenes;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	static Stream<Order> getOrders() throws IOException, URISyntaxException {
		return Files.lines(Path.of(Main.class.getResource("/orders.csv").toURI())).map(Order::new);
	}
	
	static Stream<OrderDetail> getOrderDetails() throws IOException, URISyntaxException {
		return Files.lines(Path.of(Main.class.getResource("/orderdetails.csv").toURI())).map(OrderDetail::new);
	}

	public static void main(String[] args) {
		Map<Integer,Order> mapa = getOrders().collect(Collectors.groupingBy(Order::getOrderNumber, Order::new));
//		Map<Integer,Order> mapa = Map.of();
		mapa.values().forEach(n -> System.out.println("\t" + mapa.values().toString()));
	}
}
