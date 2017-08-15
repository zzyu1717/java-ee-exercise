package org.main;

import org.listener.CurdListenerImpl;
import org.listener.IListener;
import org.listenerable.EventSourceImpl;

public class Main {
	public static void main(String[] args) {
		// 定义监听器
		IListener listener = new CurdListenerImpl();
		// 定义事件源
		EventSourceImpl eventSource = new EventSourceImpl();
		// 定义事件
	  	eventSource.setListener(listener);
	  	
	  	eventSource.saveStudent();
	  	eventSource.deleteStudent();
		 
		
	}
}
