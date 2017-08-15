package org.listenerable;

import org.event.ICurdEvent;
import org.listener.IListener;

/**
 * 事件源接口---》相当于观察者模式中的subject
 * @author ZZY
 *
 */
public interface IListenerable {
	/**
	 * 为事件源注册监听器---->相当于观察者模式中的添加观察者
	 * @param listener
	 */
	void setListener(IListener listener) ;
	/**
	 * 触发监听器---》相当于观察者模式中状态变化时notify通知观察者
	 */
	void triggerListener(ICurdEvent event) ;
}
