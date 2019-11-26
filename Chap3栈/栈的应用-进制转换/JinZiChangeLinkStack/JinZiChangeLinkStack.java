package Chap3.JinZiChangeLinkStack;

public class JinZiChangeLinkStack implements IStackOperatin{
	NumberNode top;

	public JinZiChangeLinkStack() {  //构造函数，创建空的链栈
		top=null;
	}

	@Override
	public boolean StackEmpty() {   // 判栈是否空
		return top == null ? true : false;
	}

	@Override
	public NumberNode GetTop() { // 返回栈顶元素，若栈空，返回null，否则返回栈顶元素的地址（引用）
		if (StackEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean Push(NumberNode e) {// 入栈
		e.next = top;
		top = e;
		return true;
	}

	@Override
	public boolean Pop() {   //出栈
		// TODO Auto-generated method stub
		if (StackEmpty()) {
			return false;
		} else {
			top =top.next;
			return true;
		}
	}

}
