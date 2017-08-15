package org.listener;

import org.event.ICurdEvent;

/**
 * 监听器接口----》相当于观察者模式中的Observer
 * @author ZZY
 *
 */
public interface IListener {
	/**
	 * 处理事件-----》相当于观察者模式中状态变化接收消息
	 * @param event
	 */
	void handle(ICurdEvent event);
}
