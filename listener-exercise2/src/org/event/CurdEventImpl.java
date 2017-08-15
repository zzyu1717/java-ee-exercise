package org.event;

import org.listenerable.IListenerable;

/**
 * 定义事件类
 * @author ZZY
 *
 */
public class CurdEventImpl implements ICurdEvent {
	private IListenerable eventSource; // 事件源
	private String methodName; // 事件源所执行的方法名称
	
	public CurdEventImpl(IListenerable eventSource, String methodName) {
		this.eventSource = eventSource;
		this.methodName = methodName;
	}
	
	@Override
	public IListenerable getEventSource() {
		return this.eventSource;
	}
	
	/**
	 * 根据事件源所执行的不同的方法，返回不同的事件类型
	 */
	@Override
	public String getEventType() {
		String eventType = null;
		if (methodName.startsWith("save")) {
			eventType = ICurdEvent.EventType.CREATE_EVENT.toString();
		} else if (methodName.startsWith("delete")) {
			eventType = ICurdEvent.EventType.DELETE_EVENT.toString();
			
		} else if (methodName.startsWith("update")) {
			eventType = ICurdEvent.EventType.UPDATE_EVENT.toString();
		
		} else if (methodName.startsWith("retrieve")) {
			eventType = ICurdEvent.EventType.RETRIEVE_EVENT.toString();
		} else {
			eventType = "error, have no this typeEvent!";
		}
		return eventType;
	}

}
