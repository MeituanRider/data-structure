package Chap3.LinkStack;

public interface ILinkStackOperation {
//	(1) 建立一个空栈S：InitStack(S) //不需此算法，构造函数可完成它

//	(2) 判断栈S是否为空：StackEmpty(S)
	boolean StackEmpty();
	
//	(3) 返回S的栈顶元素：GetTop(S)
	StudNode GetTop();
	
//	(4) 入栈：Push(S，e)
	boolean Push(StudNode e);
	
//	(5) 出栈：Pop(S)
    boolean Pop();
}
