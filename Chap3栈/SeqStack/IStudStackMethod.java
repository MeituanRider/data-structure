package SeqStack;

public interface IStudStackMethod {
	// (1) ����һ����ջS��InitStack()
	// (2) �ж�ջS�Ƿ�Ϊ�գ�StackEmpty()
	public boolean StackEmpty();
	// (3) ����S��ջ��Ԫ�أ�GetTop()
	public StudNode GetTop();
	// (4) ��ջ��Push(e)
	public boolean Push(StudNode e);	
	// (5) ��ջ��Pop()
	public boolean Pop();
}
