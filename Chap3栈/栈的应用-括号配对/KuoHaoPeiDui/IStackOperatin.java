package KuoHaoPeiDui;

public interface IStackOperatin {
//	(2) 判断栈S是否为空：StackEmpty(S)
	boolean StackEmpty();
	
//	(3) 返回S的栈顶元素：GetTop(S)
	CharNode GetTop();
	
//	(4) 入栈：Push(S，e)
	boolean Push(CharNode e);
	
//	(5) 出栈：Pop(S)
    boolean Pop();
}
