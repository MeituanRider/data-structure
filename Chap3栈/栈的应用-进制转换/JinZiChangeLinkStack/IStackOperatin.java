package Chap3.JinZiChangeLinkStack;

public interface IStackOperatin {
//	(2) �ж�ջS�Ƿ�Ϊ�գ�StackEmpty(S)
	boolean StackEmpty();
	
//	(3) ����S��ջ��Ԫ�أ�GetTop(S)
	NumberNode GetTop();
	
//	(4) ��ջ��Push(S��e)
	boolean Push(NumberNode e);
	
//	(5) ��ջ��Pop(S)
    boolean Pop();
}
