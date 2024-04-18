package static_count;

public class StudentCount {
	static int count=0;
	StudentCount(){
		count++;
	}
	void totalStudent() {
		System.out.println("total student:" + count);
	}
}


