package com.lordnani;

public class Worker extends Thread{

	private int id;
	private Data data;

	public Worker(int id, Data d){
		this.id = id;
		data = d;
		this.start();
	}

	@Override
	public  void run() {
		super.run();
		synchronized (data) {
			try {
				for (int i = 0; i < 3; i++) {
					while (data.getState() != id) // if не підходить
						data.wait();

					if (id == 0) data.Tic();
					else if (id == 1) data.Tak();
					else data.Toy();

					data.notifyAll();
				}
			} catch (InterruptedException e){
				e.printStackTrace();
			}

		}

	}

}
