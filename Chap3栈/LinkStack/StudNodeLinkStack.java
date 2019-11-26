package Chap3.LinkStack;

public class StudNodeLinkStack implements ILinkStackOperation {
	StudNode top;
	private int Length = 0;

	public StudNodeLinkStack() { // 构造函数，实现构建空链栈
		top = null;
		Length = 0;
	}

	@Override
	public boolean StackEmpty() { // 判栈是否空
		return top == null ? true : false;
	}

	@Override
	public StudNode GetTop() { // 返回栈顶元素，若栈空，返回null，否则返回栈顶元素的地址（引用）
		if (StackEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean Push(StudNode e) { // 入栈
		e.next = top;
		top = e;
		Length++;
		return true;
	}

	@Override
	public boolean Pop() {    //出栈
		// TODO Auto-generated method stub
		if (StackEmpty()) {
			return false;
		} else {
			top =top.next;
			Length--;
			return true;
		}
	}
	
	public String VisitAll() {  //遍历栈，显示全部数据
		if (StackEmpty()) {
			return "栈空";
		} else {
			String result = "";
			StudNode p=top;  //声明一个新指针，使它指向栈顶，为什么要引入此指针？
			while(p!=null){
				result += p.studentNo + "\t" + p.name + "\t"
						+ p.score + "\n";
				p=p.next;
			}
			return result;
		}
	}
}
