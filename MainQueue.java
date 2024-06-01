package TubesPP1;

public class MainQueue {

	public static void main(String[] args) {
		StructureQueue Q = new StructureQueue();
		
		System.out.println("=== Antrean Bioskop XXI ===");
		Q.displayQueue();
		Q.enqueue("213040057 - Muhamad Jamaludin");
		Q.enqueue("213040043 - Emilia Paradila S");
		Q.enqueue("213040047 - Rahma Aliaputri E");
		Q.enqueue("213040055 - Putri Aulia Maulidina");
		Q.enqueue("213040059 - Lita Yusdia Fatimah");
		Q.displayQueue();
		Q.enqueue("213040100 - Udin");
		Q.displayQueue();
		Q.dequeue();
		Q.displayQueue();
		Q.enqueue("213040100 - Udin");
		Q.displayQueue();
		Q.dequeue();Q.dequeue();Q.dequeue();Q.dequeue();Q.dequeue();
		Q.displayQueue();
		
		System.out.println(Q.getFront());
		
		Q.displayArray();
		
	}
}
