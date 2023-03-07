
public class Main2 {
	static Thread numAleatorio = new Thread() {
		public void run() {
			System.out.println(Math.random());
		}
	};
	
	public void main (String args[]) {
		for(int i=0;i<5;i++) {
			numAleatorio.start();
		}
	}
}
