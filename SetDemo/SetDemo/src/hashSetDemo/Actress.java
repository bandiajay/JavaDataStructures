package hashSetDemo;

import java.util.Objects;

public class Actress {
	private String name;
	private double remuneration;
	private boolean blackAndWhiteMovie;

	public Actress(String name, double remuneration, boolean blackAndWhiteMovie) {
		super();
		this.name = name;
		this.remuneration = remuneration;
		this.blackAndWhiteMovie = blackAndWhiteMovie;
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

	public boolean isBlackAndWhiteMovie() {
		return blackAndWhiteMovie;
	}

	public void setBlackAndWhiteMovie(boolean blackAndWhiteMovie) {
		this.blackAndWhiteMovie = blackAndWhiteMovie;
	}

	@Override
	public String toString() {
		return "Actress [name=" + name + ", remuneration=" + remuneration + ", blackAndWhiteMovie=" + blackAndWhiteMovie
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(blackAndWhiteMovie, name, remuneration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actress other = (Actress) obj;
		return blackAndWhiteMovie == other.blackAndWhiteMovie && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(remuneration) == Double.doubleToLongBits(other.remuneration);
	}
	
	

}
