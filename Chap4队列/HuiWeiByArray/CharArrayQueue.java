package HuiWeiByArray;

public class CharArrayQueue {
	final int MaxLength = 100;
	CharNode[] studs = new CharNode[MaxLength]; // 循环队列数组，存放数据
	int front; // 循环队列队头元素前一位置序号
	int rear; // 循环队列队尾元素位置序号

	public CharArrayQueue() {
		this.front = 0;
		this.rear = 0;
	}

	public boolean QueueEmpty() { // 判断队列Q是否为空
		return front == rear;
	}

	public CharNode GetFront() { // 返回Q的队头元素
		if (QueueEmpty()) {
			return null;
		} else {
			return studs[front + 1];
		}
	}

	public boolean EnQueue(CharNode e) { // 入队
		if (rear + 1 % MaxLength == front) {
			System.out.println("循环队列已满 ，上溢出");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			studs[rear] = e;
			return true;
		}
	}

	public boolean OutQueue() { // 出队
		if (QueueEmpty()) {
			System.out.println("循环队列已空 ，下溢出");
			return false;
		} else {
			front = (front + 1) % MaxLength;
			return true;
		}
	}
}
