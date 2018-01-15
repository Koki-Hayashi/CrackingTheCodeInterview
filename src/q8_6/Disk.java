package q8_6;

public class Disk
{
	private int label;

	public Disk(int label)
	{
		this.label = label;
	}

	public int getLabel()
	{
		return label;
	}

	public void setLabel(int label)
	{
		this.label = label;
	}

	@Override
	public String toString()
	{
		return "Disk{" + "label='" + label + '\'' + '}';
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{ return true; }
		if (o == null || getClass() != o.getClass())
		{ return false; }

		Disk disk = (Disk) o;

		return label == disk.label;
	}

	@Override
	public int hashCode()
	{
		return label;
	}
}
