package KuoHaoPeiDui;

public interface IStackOperatin {
//	(2) �ж�ջS�Ƿ�Ϊ�գ�StackEmpty(S)
	boolean StackEmpty();
	
//	(3) ����S��ջ��Ԫ�أ�GetTop(S)
	CharNode GetTop();
	
//	(4) ��ջ��Push(S��e)
	boolean Push(CharNode e);
	
//	(5) ��ջ��Pop(S)
    boolean Pop();
}
