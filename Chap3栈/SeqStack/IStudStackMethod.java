package SeqStack;

public interface IStudStackMethod {
	// (1) 建立一个空栈S：InitStack()
	// (2) 判断栈S是否为空：StackEmpty()
	public boolean StackEmpty();
	// (3) 返回S的栈顶元素：GetTop()
	public StudNode GetTop();
	// (4) 入栈：Push(e)
	public boolean Push(StudNode e);	
	// (5) 出栈：Pop()
	public boolean Pop();
}
