package JudgeHuiWei;

public interface IStackOperatin {
//	(2) 判断栈S是否为空：StackEmpty()
	boolean StackEmpty();
	
//	(3) 返回S的栈顶元素：GetTop()
	CharNode GetTop();
	
//	(4) 入栈：Push(e)
	boolean Push(CharNode e);
	
//	(5) 出栈：Pop()
    boolean Pop();
}
