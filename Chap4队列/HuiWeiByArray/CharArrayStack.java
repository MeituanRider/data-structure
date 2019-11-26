package HuiWeiByArray;

public class CharArrayStack {
	final int MaxLength = 100;
	CharNode[] chars = new CharNode[MaxLength]; // ˳��ջ���飬���ѧ����¼
	int top; // ˳��ջջ��Ԫ�����

	public CharArrayStack() { // ���캯������topΪ-1��������ջ
		top = -1;
	}

	public boolean StackEmpty() { // �ж�ջ�Ƿ�Ϊ��
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public CharNode GetTop() { // ����ջ��Ԫ��
		if (StackEmpty()) {
			return null;
		} else {
			return chars[top];
		}
	}

	public boolean Push(CharNode e) { // ��ջ		
		if (top == MaxLength - 1) {
			System.out.println("˳��ջ�������������"); 
			return false;
		} else {
			top++;
			chars[top] = e;
			return true;
		}
	}

	public boolean Pop() { // ��ջ
		if (StackEmpty()) {
			System.out.println("˳��ջΪ�գ��������"); 
			return false;
		} else {
			top--;
			return true;
		}
	}
}
