package JudgeHuiWei;

public interface IQueueOperation {
//	(1) ����һ���ն���Q��InitQueue() //���캯�����ɴ������ٵ�����Ϊ����
//	(2) �ж϶���Q�Ƿ�Ϊ�գ�QueueEmpty()
	boolean QueueEmpty();	
//	(3) ����Q�Ķ�ͷԪ�أ�GetFront()
	CharNode GetFront();
//	(4) ��ӣ�EnQueue (e)
	boolean EnQueue(CharNode e);
//	(5) ���ӣ�OutQueue ()
	boolean OutQueue();
}
