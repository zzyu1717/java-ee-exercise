package org.main;

import org.event.CurdEventImpl;
import org.event.ICurdEvent;
import org.listener.CurdListenerImpl;
import org.listener.IListener;
import org.listenerable.EventSourceImpl;
import org.listenerable.IListenerable;

public class Main {
	public static void main(String[] args) {
		// 定义监听器
		IListener listener = new CurdListenerImpl();
		// 定义事件源
		IListenerable eventSource = new EventSourceImpl();
		// 定义事件
		ICurdEvent event = new CurdEventImpl(eventSource, "reStudent");
		// 事件源注册监听器
		eventSource.setListener(listener);
		// 事件触发监听器
		eventSource.triggerListener(event);
		
	}
}
