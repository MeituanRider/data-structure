package JudgeHuiWei;

public class CharLinkQueue implements IQueueOperation{
	CharNode front;
	CharNode rear;
	
	public CharLinkQueue() { // 构造函数，在函数中，创建含有一个头结点的空链队列
		this.front = new CharNode();
		this.rear = this.front;
		this.front.next = null;
	}
	
	@Override
	public boolean QueueEmpty() {// 判断队列Q是否为空
		return front == rear;
	}

	@Override
	public CharNode GetFront() {// 返回Q的队头元素
		if (QueueEmpty()) {
			return null;
		} else {
			return front.next;
		}
	}

	@Override
	public boolean EnQueue(CharNode e) {// 入队
		e.next = rear.next;
		rear.next = e;
		rear = e;
		return true;
	}

	@Override
	public boolean OutQueue() {// 出队
		if (QueueEmpty()) {
			return false;
		} else {
			front.next = front.next.next;
			if (front.next == null) {
				rear = front;
			}
			return true;
		}
	}

	
}
