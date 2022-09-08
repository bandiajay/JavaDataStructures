package treeSetDemo;

public class Cricketer implements Comparable<Cricketer>{
	private String name;
	private double remuneration;
	private boolean captain;

	public Cricketer(String name, double remuneration, boolean captain) {
		super();
		this.name = name;
		this.remuneration = remuneration;
		this.captain = captain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", remuneration=" + remuneration + ", captain=" + captain + "]";
	}

	@Override
	public int compareTo(Cricketer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
