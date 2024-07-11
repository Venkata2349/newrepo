

package JavaPackage;

public class Encapsulationexample {
	private int stundentNo;
	private String stundentName;
	int x=10;
	private String deptname= "Kbatch";

	public static void main(String[] args) {
		Encapsulationexample enp = new Encapsulationexample();
		enp.setStundentNo(23);
		enp.setStundentName("Vijay kumar");
	    System.out.println("stunde id "+enp.getStundentNo() +" is absent and student name is "+enp.getStundentName());
	   // enp.setDeptname("K2batch");
	    System.out.println(enp.getDeptname());
	}
	

	public int getStundentNo() {
		return stundentNo;
	}

	public void setStundentNo(int stundentNo) {
		this.stundentNo = stundentNo;
	}

	public String getStundentName() {
		return stundentName;
	}

	public void setStundentName(String stundentName) {
		this.stundentName = stundentName;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}

