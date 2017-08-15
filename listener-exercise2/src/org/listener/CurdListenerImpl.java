package org.listener;

import org.event.ICurdEvent;

/**
 * 定义事件监听器
 * @author ZZY
 *
 */
public class CurdListenerImpl implements IListener {

	@Override
	public void handle(ICurdEvent event) {
		String eventType = event.getEventType();
		if (ICurdEvent.EventType.CREATE_EVENT.toString().equals(eventType)) {
			System.out.println("事件源执行了添加操作" );
		} else if (ICurdEvent.EventType.UPDATE_EVENT.toString().equals(eventType)) {
			System.out.println("事件源执行了修改操作");
			
		} else if (ICurdEvent.EventType.DELETE_EVENT.toString().equals(eventType)) {
			System.out.println("事件源执行了删除操作");
		} else if (ICurdEvent.EventType.RETRIEVE_EVENT.toString().equals(eventType)) {
			System.out.println("事件源执行了查询操作");
		} else {
			System.out.println(".......没有相关事件.........");
		}
	}

}
