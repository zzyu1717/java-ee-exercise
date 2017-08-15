package org.listenerable;

import org.event.ICurdEvent;
import org.listener.IListener;

/**
 * 事件源实现类
 * @author ZZY
 *
 */
public class EventSourceImpl implements IListenerable {
	private IListener listener;
	
	public  EventSourceImpl() {
		
	}
	@Override
	public void setListener(IListener listener) {
		this.listener = listener;
	}

	@Override
	public void triggerListener(ICurdEvent event) {
		listener.handle(event);
	}

}
