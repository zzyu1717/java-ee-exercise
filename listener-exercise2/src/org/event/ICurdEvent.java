package org.event;

import org.listenerable.IListenerable;

/**
 * 定义增删改查事件--->对应与观察者模式中的状态消息
 * 通常，对于事件对象，我们一般需要从事件对象中获取到事件源对象
 * @author ZZY
 *
 */
public interface ICurdEvent {
	public static enum EventType {
		CREATE_EVENT,UPDATE_EVENT,DELETE_EVENT,RETRIEVE_EVENT;
		
	}
	/**
	 * 获取事件源对象--》对于观察者模式中的subject
	 * @return
	 */
	IListenerable getEventSource();
	/**
	 * 获取事件类型
	 * @return
	 */
	String getEventType();
}
