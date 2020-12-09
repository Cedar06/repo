
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CarQueue{

	Queue<Integer> carQ;
	Random rand;
	
	public CarQueue() {
		carQ  = new LinkedList<Integer>();
		rand = new Random();
		carQ.add(2);
		carQ.add(2);
		carQ.add(2);
		carQ.add(3);
		carQ.add(3);
		carQ.add(3);
	}
	public void addToQueue() {
		class CarRun implements Runnable{
			@Override
			public void run() {
				while(true) {
					int direction = rand.nextInt(4);
					carQ.add(direction);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		Thread carT = new Thread(new CarRun());
		carT.start();
	}
	public int deleteQueue() {
		return carQ.remove();
	}

}
