package ie.gmit.sw;

public record Person(int id) {

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + "==>" + this.id());
	}

}
