package JudgeHuiWei;

public interface IStackOperatin {
//	(2) �ж�ջS�Ƿ�Ϊ�գ�StackEmpty()
	boolean StackEmpty();
	
//	(3) ����S��ջ��Ԫ�أ�GetTop()
	CharNode GetTop();
	
//	(4) ��ջ��Push(e)
	boolean Push(CharNode e);
	
//	(5) ��ջ��Pop()
    boolean Pop();
}
