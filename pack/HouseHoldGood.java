package my.pack;

public class HouseHoldGood extends ItemsForSale{
	String type;
	int count;

	public HouseHoldGood(String name, int price, int count) {
		super(name, price);
		this.type="HouseHoldGood";
		this.count=count;
	}

	public String getType() {
		return type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + count;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseHoldGood other = (HouseHoldGood) obj;
		if (count != other.count)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
