package org.listenerable;

import org.event.CurdEventImpl;
import org.event.ICurdEvent;
import org.listener.IListener;

/**
 * 事件源实现类
 * 改进执行真正的业务逻辑，有监听器监听
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
	
	public void saveStudent() {
		triggerListener(new CurdEventImpl(this, "saveStudent"));
		System.out.println("\t执行保存操作");
	}
	public void updateStudent() {
		triggerListener(new CurdEventImpl(this, "updateStudent"));
		System.out.println("\t执行更新操作");
	}
	public void deleteStudent() {
		triggerListener(new CurdEventImpl(this, "deleteStudent"));
		System.out.println("\t执行删除操作");
	}
	public void retrieveStudent() {
		triggerListener(new CurdEventImpl(this, "retrieveStudent"));
		System.out.println("\t执行查询操作");
	}

}
