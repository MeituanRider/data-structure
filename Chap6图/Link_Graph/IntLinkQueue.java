package Link_Graph;

public class IntLinkQueue {
	GraphNode front;
	GraphNode rear;

	public IntLinkQueue() { // 构造函数，在函数中，创建含有一个头结点的空链队列
		this.front =new GraphNode(-1);
		this.rear = this.front;
		this.front.next = null;
	}

	public boolean QueueEmpty() { // 判断队列Q是否为空
		return front == rear;
	}

	public GraphNode GetFront() { // 返回Q的队头元素
		if (QueueEmpty()) {
			return null;
		} else {
			return front.next;
		}
	}

	public boolean EnQueue(GraphNode e) { // 入队
		e.next = rear.next;
		rear.next = e;
		rear = e;
		return true;
	}

	public boolean OutQueue() { // 出队
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
