package LinkChap2;

public class StudNode {
	String studentNo;// 学号
	String name; // 姓名
	double score; // 分数
	StudNode next=null; //指针（引用）字段
	public StudNode(){		
	}
	public StudNode(String studentNo, String name, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.score = score;
	}
}
