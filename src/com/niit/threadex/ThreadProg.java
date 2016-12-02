package com.niit.threadex;

public class ThreadProg extends Thread{
	public void run() {
		
		for(int i=1;i<=10; i++)
		{
			System.out.println(2+"*"+i+"="+2*i);
		}
	}

	public static void main(String[] args) {
		ThreadProg t=new ThreadProg();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println(5+"*"+i+"="+5*i);
		}

	}

}
