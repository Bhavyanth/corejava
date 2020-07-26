package hibernate.pojo;

public class User {
	private String name;
	private int id;
	private int v;
	public String getName() {
		return name;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
