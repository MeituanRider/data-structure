package LinkQueue;

public class StudNode {
	String sno;
	String sname;
	float score;
	StudNode next = null;
	public StudNode() {
		super();
	}
	public StudNode(String sno, String sname, float score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.score = score;
	}
	
}
