package JudgeHuiWei;

public class CharLinkQueue implements IQueueOperation{
	CharNode front;
	CharNode rear;
	
	public CharLinkQueue() { // ���캯�����ں����У���������һ��ͷ���Ŀ�������
		this.front = new CharNode();
		this.rear = this.front;
		this.front.next = null;
	}
	
	@Override
	public boolean QueueEmpty() {// �ж϶���Q�Ƿ�Ϊ��
		return front == rear;
	}

	@Override
	public CharNode GetFront() {// ����Q�Ķ�ͷԪ��
		if (QueueEmpty()) {
			return null;
		} else {
			return front.next;
		}
	}

	@Override
	public boolean EnQueue(CharNode e) {// ���
		e.next = rear.next;
		rear.next = e;
		rear = e;
		return true;
	}

	@Override
	public boolean OutQueue() {// ����
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
