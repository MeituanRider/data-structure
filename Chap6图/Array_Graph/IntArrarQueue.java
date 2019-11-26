package Array_Graph;

public class IntArrarQueue {
	final int MaxLength = 100;
	int [] v = new int[MaxLength]; // 循环队列数组，存放顶点信息
	int front; // 循环队列队头元素前一位置序号
	int rear; // 循环队列队尾元素位置序号
	int length;

	public IntArrarQueue() {
		this.front = 0;
		this.rear = 0;
		this.length = 0;
	}

	public boolean QueueEmpty() { // 判断队列Q是否为空
		return front == rear;
	}

	public int GetFront() { // 返回Q的队头元素
		if (QueueEmpty()) {
			return -1;
		} else {
			return v[front + 1];
		}
	}

	public boolean EnQueue(int e) { // 入队
		if (rear + 1 % MaxLength == front) {
			System.out.println("循环队列已满 ，上溢出");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			v[rear] = e;
			length++;
			return true;
		}
	}

	public boolean OutQueue() { // 出队
		if (QueueEmpty()) {
			System.out.println("循环队列已空 ，下溢出");
			return false;
		} else {
			front = (front + 1) % MaxLength;
			length--;
			return true;
		}
	}

	public String VisitAll() { // 遍历队列，显示全部数据
		if (QueueEmpty()) {
			return "队空";
		} else {
			String result = "";
			for (int i = 0; i < length; i++) {
				result += v[(i + front + 1) % MaxLength] + "    ";
			}
			return result;
		}
	}
}
