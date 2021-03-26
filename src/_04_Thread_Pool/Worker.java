package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
ConcurrentLinkedQueue<Task> taskQue;
	public Worker(ConcurrentLinkedQueue<Task> e) {
		taskQue = e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!taskQue.isEmpty()) {
			taskQue.remove().preform();;
		}
	}


}
