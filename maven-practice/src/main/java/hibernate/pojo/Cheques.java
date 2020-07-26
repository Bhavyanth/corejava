package hibernate.pojo;

public class Cheques extends Payments{
	private String ChequeType;

	public String getChequeType() {
		return ChequeType;
	}

	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
	
}
