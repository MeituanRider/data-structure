package HuiWeiByArray;

public class CharArrayStack {
	final int MaxLength = 100;
	CharNode[] chars = new CharNode[MaxLength]; // 顺序栈数组，存放学生记录
	int top; // 顺序栈栈顶元素序号

	public CharArrayStack() { // 构造函数，置top为-1，产生空栈
		top = -1;
	}

	public boolean StackEmpty() { // 判断栈是否为空
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public CharNode GetTop() { // 返回栈顶元素
		if (StackEmpty()) {
			return null;
		} else {
			return chars[top];
		}
	}

	public boolean Push(CharNode e) { // 入栈		
		if (top == MaxLength - 1) {
			System.out.println("顺序栈已满，上溢出！"); 
			return false;
		} else {
			top++;
			chars[top] = e;
			return true;
		}
	}

	public boolean Pop() { // 出栈
		if (StackEmpty()) {
			System.out.println("顺序栈为空，下溢出！"); 
			return false;
		} else {
			top--;
			return true;
		}
	}
}
