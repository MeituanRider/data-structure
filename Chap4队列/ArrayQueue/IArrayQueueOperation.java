package ArrayQueue;

public interface IArrayQueueOperation {
//	(1) ����һ���ն���Q��InitQueue(Q) //���캯�����ɴ������ٵ�����Ϊ����
//	(2) �ж϶���Q�Ƿ�Ϊ�գ�QueueEmpty(Q)
	boolean QueueEmpty();	
//	(3) ����Q�Ķ�ͷԪ�أ�GetFront(Q)
	StudNode GetFront();
//	(4) ��ӣ�EnQueue (Q��e)
	boolean EnQueue(StudNode e);
//	(5) ���ӣ�OutQueue (Q)
	boolean OutQueue();
}
