package JZZH;

public class ZZZH implements IzzzhStack {
	final int maxLen = 100;
	int[] aa = new int[maxLen];
	int top = -1;

	@Override
	public boolean stackEmpty() {
		return top == -1 ? true : false;
	}

	@Override
	public boolean push(int x) {
		if (top >= maxLen - 1) {
			return false;
		} else {
			top++;
			aa[top] = x;
			return true;
		}
	}

	@Override
	public boolean pop() {
		if (stackEmpty()) {
			return false;
		} else {
			top--;
			return true;
		}
	}

	@Override
	public int getTop() {
		if(!stackEmpty()){
			return aa[top];
		}else{
			return -10000;
		}		
	}

}
