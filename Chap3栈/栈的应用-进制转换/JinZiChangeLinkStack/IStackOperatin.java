package Chap3.JinZiChangeLinkStack;

public interface IStackOperatin {
//	(2) 判断栈S是否为空：StackEmpty(S)
	boolean StackEmpty();
	
//	(3) 返回S的栈顶元素：GetTop(S)
	NumberNode GetTop();
	
//	(4) 入栈：Push(S，e)
	boolean Push(NumberNode e);
	
//	(5) 出栈：Pop(S)
    boolean Pop();
}
