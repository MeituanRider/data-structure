package KuoHaoPeiDui;

public class KuoHaoPdLinkStack  implements IStackOperatin{
	CharNode top;
	
	public KuoHaoPdLinkStack() {
		this.top = null;
	}

	@Override
	public boolean StackEmpty() {
		return top == null ? true : false;
	}

	@Override
	public CharNode GetTop() {
		if (StackEmpty()) {
			return null;
		} else {
			return top;
		}
	}

	@Override
	public boolean Push(CharNode e) {
		e.next = top;
		top = e;
		return true;
	}

	@Override
	public boolean Pop() {
		if (StackEmpty()) {
			return false;
		} else {
			top =top.next;
			return true;
		}

	}

}
