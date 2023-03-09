
public class Main {
	
	
	static Thread numAleatorio = new Thread() {
		public void run() {
			long id = numAleatorio.getId();
			System.out.println("Thread 1:" + id);
		}
	};
	static Thread numAleatorio2 = new Thread() {
		public void run() {
			long id = numAleatorio2.getId();
			System.out.println("Thread 2:" + id);
		}
	};
	static Thread numAleatorio3 = new Thread() {
		public void run() {
			long id = numAleatorio3.getId();
			System.out.println("Thread 3:" + id);
		}
	};
	static Thread numAleatorio4 = new Thread() {
		public void run() {
			long id = numAleatorio4.getId();
			System.out.println("Thread 4:" + id);
		}
	};
	static Thread numAleatorio5 = new Thread() {
		public void run() {
			long id = numAleatorio5.getId();
			System.out.println("Thread 5:" + id);
		}
	};
	
	public static void main(String[] args) {
			numAleatorio.start();
			numAleatorio2.start();
			numAleatorio3.start();
			numAleatorio4.start();
			numAleatorio5.start();
	}
}
