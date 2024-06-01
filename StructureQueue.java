package TubesPP1;

public class StructureQueue {
	private int N = 5;
    private String[] queue = new String[N]; // index 4
    private int front = -1;
    private int rear = -1;
    
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }	

    public boolean isFull() {
        return (rear + 1) % N == front;
    }

    public void enqueue(String antrean) {
    	if(front == -1 && rear == -1) {
    		front = rear = 0;
    		queue[rear] = antrean;
    	}else if (isFull()) {
    		System.out.println("Antrean Bank Penuh.");
        }else {
        	rear = (rear + 1) % N;
        	queue[rear] = antrean;
        }
    }

    public void dequeue() {
    	if(front  == rear && front != -1 && rear != -1) {
    		front = rear = -1;
    	}else if (isEmpty()) {
            System.out.println("Antrean Bank Kosong.");
        }else {
        	
        	front = (front + 1) % N;
        }
    }

    public String getFront() {
    	String value = null;
        if (isEmpty()) {
        	value = "Antrean Bank Kosong.";
        }else {
        	value =  queue[front];
        }
        return value;
    }
    
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrean Bank Kosong.");
        }else {
	        System.out.println("Antrean: ");
	        int current = front;
	        while (current != rear) {
	            System.out.println(queue[current]);
	            current = (current + 1) % N;
	        }
	        System.out.println(queue[current]);
        }
    }
    
    public void displayArray() {
        System.out.println("Current state of the array:");
        for (int i = 0; i < N; i++) {
            if (queue[i] == null) {
                System.out.println("Index " + i + ": null");
            } else {
                System.out.println("Index " + i + ": " + queue[i]);
            }
        }
    }
}
