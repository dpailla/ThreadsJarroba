package threadsJarroba;

/**
 *
 * @author Richard
 */
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 1 });

		Cajera cajero1 = new Cajera("Cajera 1");
		Cajera cajero2 = new Cajera("Cajera 2");



		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajero1.procesarCompra(cliente1, initialTime);
		cajero2.procesarCompra(cliente2, initialTime);

	}
}