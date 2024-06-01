package TubesPP1;

public class MainQueue {

	public static void main(String[] args) {
		StructureQueue Q = new StructureQueue();
		
		System.out.println("=== Antrean Bank ===");
		Q.displayQueue();
		Q.enqueue("213040072 - Ranca Gigih Pramuditha");
		Q.enqueue("223040138 - Darryl Azzuri");
		Q.enqueue("223040147 - Galuh Wikri ");
		Q.enqueue("223040149 - Pebry Andrian");
		Q.enqueue("223040080 - George Frederik Pingak");
		Q.displayQueue();
		Q.enqueue("213040100 - Cecep");
		Q.displayQueue();
		Q.dequeue();
		Q.displayQueue();
		Q.enqueue("213040100 - Cecep");
		Q.displayQueue();
		Q.dequeue();Q.dequeue();Q.dequeue();Q.dequeue();Q.dequeue();
		Q.displayQueue();
		
		System.out.println(Q.getFront());
		
		Q.displayArray();
		
	}
}
