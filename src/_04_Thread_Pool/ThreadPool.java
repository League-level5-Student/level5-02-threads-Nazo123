package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task> taskQue;

	public ThreadPool(int amountOfThreads) {
		threads = new Thread[amountOfThreads];
		taskQue = new ConcurrentLinkedQueue<Task>();
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Worker(taskQue));
		}
	}

	public void addTask(Task object) {
		taskQue.add(object);

	}

	public void start() {
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
