package Array_Graph;

public class IntArrarQueue {
	final int MaxLength = 100;
	int [] v = new int[MaxLength]; // ѭ���������飬��Ŷ�����Ϣ
	int front; // ѭ�����ж�ͷԪ��ǰһλ�����
	int rear; // ѭ�����ж�βԪ��λ�����
	int length;

	public IntArrarQueue() {
		this.front = 0;
		this.rear = 0;
		this.length = 0;
	}

	public boolean QueueEmpty() { // �ж϶���Q�Ƿ�Ϊ��
		return front == rear;
	}

	public int GetFront() { // ����Q�Ķ�ͷԪ��
		if (QueueEmpty()) {
			return -1;
		} else {
			return v[front + 1];
		}
	}

	public boolean EnQueue(int e) { // ���
		if (rear + 1 % MaxLength == front) {
			System.out.println("ѭ���������� �������");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			v[rear] = e;
			length++;
			return true;
		}
	}

	public boolean OutQueue() { // ����
		if (QueueEmpty()) {
			System.out.println("ѭ�������ѿ� �������");
			return false;
		} else {
			front = (front + 1) % MaxLength;
			length--;
			return true;
		}
	}

	public String VisitAll() { // �������У���ʾȫ������
		if (QueueEmpty()) {
			return "�ӿ�";
		} else {
			String result = "";
			for (int i = 0; i < length; i++) {
				result += v[(i + front + 1) % MaxLength] + "    ";
			}
			return result;
		}
	}
}
