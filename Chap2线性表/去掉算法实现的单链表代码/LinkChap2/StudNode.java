package LinkChap2;

public class StudNode {
	String studentNo;// ѧ��
	String name; // ����
	double score; // ����
	StudNode next=null; //ָ�루���ã��ֶ�
	public StudNode(){		
	}
	public StudNode(String studentNo, String name, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.score = score;
	}
}
