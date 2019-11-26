package Link_Graph;

public class IntLinkQueue {
	GraphNode front;
	GraphNode rear;

	public IntLinkQueue() { // ���캯�����ں����У���������һ��ͷ���Ŀ�������
		this.front =new GraphNode(-1);
		this.rear = this.front;
		this.front.next = null;
	}

	public boolean QueueEmpty() { // �ж϶���Q�Ƿ�Ϊ��
		return front == rear;
	}

	public GraphNode GetFront() { // ����Q�Ķ�ͷԪ��
		if (QueueEmpty()) {
			return null;
		} else {
			return front.next;
		}
	}

	public boolean EnQueue(GraphNode e) { // ���
		e.next = rear.next;
		rear.next = e;
		rear = e;
		return true;
	}

	public boolean OutQueue() { // ����
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
