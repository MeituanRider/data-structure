package ArrayQueue;

public class StudNodeArrarQueue implements IArrayQueueOperation {
	final int MaxLength = 100;
	StudNode[] studs = new StudNode[MaxLength]; // 循环队列数组，存放学生记录
	int front; // 循环队列队头元素前一位置序号
	int rear; // 循环队列队尾元素位置序号

	public StudNodeArrarQueue() {
		this.front = 0;
		this.rear = 0;
	}

	@Override
	public boolean QueueEmpty() { // 判断队列Q是否为空
		return front == rear;
	}

	@Override
	public StudNode GetFront() { // 返回Q的队头元素
		if (QueueEmpty()) {
			return null;
		} else {
			return studs[(front + 1) % MaxLength];
		}
	}

	@Override
	public boolean EnQueue(StudNode e) { // 入队
		if ((rear + 1) % MaxLength == front) {
			System.out.println("循环队列已满 ，上溢出");
			return false;
		} else {
			rear = (rear + 1) % MaxLength;
			studs[rear] = e;
			return true;
		}
	}

	@Override
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
