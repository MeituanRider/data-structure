package ChapZy.Two;

public class Node {
	float xisu; // 系数
	int zisu;    // 指数
	Node next = null; // 指针（引用）字段
	public Node() {
	}
	public Node(float xisu,int zisu) {
		this.xisu = xisu;
		this.zisu=zisu;
	}
}
