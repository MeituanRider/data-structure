package HuiWeiByArray;

public class CharArrayQueue {
	final int MaxLength = 100;
	CharNode[] studs = new CharNode[MaxLength]; // ѭ���������飬�������
	int front; // ѭ�����ж�ͷԪ��ǰһλ�����
	int rear; // ѭ�����ж�βԪ��λ�����

	public CharArrayQueue() {
		this.front = 0;
		this.rear = 0;
	}

	public boolean QueueEmpty() { // �ж϶���Q�Ƿ�Ϊ��
		return front == rear;
	}

	public CharNode GetFront() { // ����Q�Ķ�ͷԪ��
		if (QueueEmpty()) {
			return null;
		} else {
			return studs[front + 1];
		}
	}

	public boolean EnQueue(CharNode e) { // ���
		if (rear + 1 % MaxLength == front) {
			System.out.println("ѭ���������� �������");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			studs[rear] = e;
			return true;
		}
	}

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
