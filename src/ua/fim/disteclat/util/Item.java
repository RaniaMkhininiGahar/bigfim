package ua.fim.disteclat.util;

public class Item {
	public String name;
	private final int support;
	protected int[] tids;

	public Item(String name, int support, int[] tids) {
		this.name = name;
		this.support = support;
		this.tids = tids;
	}

	@Override
	public String toString() {
		return name + " (" + freq() + ")" + " [" + tids.length + "]";
	}

	public int freq() {
		return support;
	}

	public int[] getTids() {
		return tids;
	}

}