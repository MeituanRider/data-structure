package ArrayQueue;

public interface IArrayQueueOperation {
//	(1) 建立一个空队列Q：InitQueue(Q) //构造函数即可处理，不再单独做为方法
//	(2) 判断队列Q是否为空：QueueEmpty(Q)
	boolean QueueEmpty();	
//	(3) 返回Q的队头元素：GetFront(Q)
	StudNode GetFront();
//	(4) 入队：EnQueue (Q，e)
	boolean EnQueue(StudNode e);
//	(5) 出队：OutQueue (Q)
	boolean OutQueue();
}
