package Chap3.LinkStack;

public interface ILinkStackOperation {
//	(1) ����һ����ջS��InitStack(S) //������㷨�����캯���������

//	(2) �ж�ջS�Ƿ�Ϊ�գ�StackEmpty(S)
	boolean StackEmpty();
	
//	(3) ����S��ջ��Ԫ�أ�GetTop(S)
	StudNode GetTop();
	
//	(4) ��ջ��Push(S��e)
	boolean Push(StudNode e);
	
//	(5) ��ջ��Pop(S)
    boolean Pop();
}
