package YangHuiSanJiao;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int n = 15;
		//int k1,k2;
		IntQueue queue = new IntQueue();
		queue.EnQueue(new IntNode(0));
		queue.EnQueue(new IntNode(1));
		queue.EnQueue(new IntNode(0));
		for (int i = 1; i <= n; i++) {
			for (int num = 30 - i; num > 0; num--) {
				System.out.print("  ");//留出每行开始的空白
			}
			int j = 1;
			while (j < i+2) {//j控制每行产生的数字个数，每行有i+2个数字，包含头尾的0，第一行010，第二行0110 第三行01210
				int k1 = queue.GetFront().xishu;
				queue.OutQueue();
				if(k1!=0)
					System.out.print(k1 + "    ");
					int k2 = queue.GetFront().xishu;
					queue.EnQueue(new IntNode(k1+k2));
					j++;
			}
			queue.EnQueue(new IntNode(0));
			System.out.println();
		}
	}
}
