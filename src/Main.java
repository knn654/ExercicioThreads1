
public class Main {
	
	
	static Thread numAleatorio = new Thread() {
		public void run() {
			int num = 0;
			num = (int) (Math.random() * 1000) + 1;
			System.out.println("Thread 1:" + num);
		}
	};
	static Thread numAleatorio2 = new Thread() {
		public void run() {
			int num = 0;
			num = (int) (Math.random() * 1000) + 1;
			System.out.println("Thread 2:" + num);
		}
	};
	static Thread numAleatorio3 = new Thread() {
		public void run() {
			int num = 0;
			num = (int) (Math.random() * 1000) + 1;
			System.out.println("Thread 3:" + num);
		}
	};
	static Thread numAleatorio4 = new Thread() {
		public void run() {
			int num = 0;
			num = (int) (Math.random() * 1000) + 1;
			System.out.println("Thread 4:" + num);
		}
	};
	static Thread numAleatorio5 = new Thread() {
		public void run() {
			int num = 0;
			num = (int) (Math.random() * 1000) + 1;
			System.out.println("Thread 5:" + num);
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
