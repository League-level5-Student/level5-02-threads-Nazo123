package _06_Wait_and_Notify.Practice;

public class AdderThread implements Runnable{
	static Integer threadLock = 0;
	static Integer e = 0;
int type;
AdderThread(int type){
	this.type = type;
}
	@Override
	public void run() {
		if(type == 0) {
			synchronized(e) {
		for(int i = 0; i < 10; i++) {
			
			threadLock++;
			e.notify();
			try {
				e.wait();
			}
			catch(Exception e) {
				System.out.println("ERROR");
			}
		}
			}
	}
		else if (type==1) {
			synchronized(e) {
				for(int i = 0; i < 10; i++) {
					System.out.println(threadLock);
					e.notify();
					try {
						e.wait();
					}
					catch(Exception e) {
						System.out.println("ERROR");
					}
				}
					}
		}
	}

}
