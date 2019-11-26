package JudgeHuiWei;

public interface IQueueOperation {
//	(1) 建立一个空队列Q：InitQueue() //构造函数即可处理，不再单独做为方法
//	(2) 判断队列Q是否为空：QueueEmpty()
	boolean QueueEmpty();	
//	(3) 返回Q的队头元素：GetFront()
	CharNode GetFront();
//	(4) 入队：EnQueue (e)
	boolean EnQueue(CharNode e);
//	(5) 出队：OutQueue ()
	boolean OutQueue();
}
