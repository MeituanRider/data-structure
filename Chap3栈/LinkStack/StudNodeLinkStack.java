package Chap3.LinkStack;

public class StudNodeLinkStack implements ILinkStackOperation {
	StudNode top;
	private int Length = 0;

	public StudNodeLinkStack() { // ���캯����ʵ�ֹ�������ջ
		top = null;
		Length = 0;
	}

	@Override
	public boolean StackEmpty() { // ��ջ�Ƿ��
		return top == null ? true : false;
	}

	@Override
	public StudNode GetTop() { // ����ջ��Ԫ�أ���ջ�գ�����null�����򷵻�ջ��Ԫ�صĵ�ַ�����ã�
		if (StackEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean Push(StudNode e) { // ��ջ
		e.next = top;
		top = e;
		Length++;
		return true;
	}

	@Override
	public boolean Pop() {    //��ջ
		// TODO Auto-generated method stub
		if (StackEmpty()) {
			return false;
		} else {
			top =top.next;
			Length--;
			return true;
		}
	}
	
	public String VisitAll() {  //����ջ����ʾȫ������
		if (StackEmpty()) {
			return "ջ��";
		} else {
			String result = "";
			StudNode p=top;  //����һ����ָ�룬ʹ��ָ��ջ����ΪʲôҪ�����ָ�룿
			while(p!=null){
				result += p.studentNo + "\t" + p.name + "\t"
						+ p.score + "\n";
				p=p.next;
			}
			return result;
		}
	}
}
