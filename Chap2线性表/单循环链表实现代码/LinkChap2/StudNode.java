package SingleLink;

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
	
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
