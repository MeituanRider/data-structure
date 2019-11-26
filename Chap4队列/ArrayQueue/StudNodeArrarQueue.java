package ArrayQueue;

public class StudNodeArrarQueue implements IArrayQueueOperation {
	final int MaxLength = 100;
	StudNode[] studs = new StudNode[MaxLength]; // ѭ���������飬���ѧ����¼
	int front; // ѭ�����ж�ͷԪ��ǰһλ�����
	int rear; // ѭ�����ж�βԪ��λ�����

	public StudNodeArrarQueue() {
		this.front = 0;
		this.rear = 0;
	}

	@Override
	public boolean QueueEmpty() { // �ж϶���Q�Ƿ�Ϊ��
		return front == rear;
	}

	@Override
	public StudNode GetFront() { // ����Q�Ķ�ͷԪ��
		if (QueueEmpty()) {
			return null;
		} else {
			return studs[(front + 1) % MaxLength];
		}
	}

	@Override
	public boolean EnQueue(StudNode e) { // ���
		if ((rear + 1) % MaxLength == front) {
			System.out.println("ѭ���������� �������");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			studs[rear] = e;
			return true;
		}
	}

	@Override
	public boolean OutQueue() { // ����
		if (QueueEmpty()) {
			System.out.println("ѭ�������ѿ� �������");
			return false;
		} else {
			front = (front + 1) % MaxLength;
			return true;
		}
	}
}
