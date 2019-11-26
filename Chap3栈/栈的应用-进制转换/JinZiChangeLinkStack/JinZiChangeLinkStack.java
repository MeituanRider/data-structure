package Chap3.JinZiChangeLinkStack;

public class JinZiChangeLinkStack implements IStackOperatin{
	NumberNode top;

	public JinZiChangeLinkStack() {  //���캯���������յ���ջ
		top=null;
	}

	@Override
	public boolean StackEmpty() {   // ��ջ�Ƿ��
		return top == null ? true : false;
	}

	@Override
	public NumberNode GetTop() { // ����ջ��Ԫ�أ���ջ�գ�����null�����򷵻�ջ��Ԫ�صĵ�ַ�����ã�
		if (StackEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean Push(NumberNode e) {// ��ջ
		e.next = top;
		top = e;
		return true;
	}

	@Override
	public boolean Pop() {   //��ջ
		// TODO Auto-generated method stub
		if (StackEmpty()) {
			return false;
		} else {
			top =top.next;
			return true;
		}
	}

}
