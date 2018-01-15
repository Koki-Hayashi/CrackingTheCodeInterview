package q8_6;

import java.util.LinkedList;

public class Peg
{
	private LinkedList<Disk> peg = new LinkedList<Disk>();
	private String name;

	public Peg(String name)
	{
		this.name = name;
	}

	public void push(Disk disk) {
		if (!peg.isEmpty() && peg.peek().getLabel() < disk.getLabel()) {
			throw new IllegalStateException(
				"Peg " + this.name + " has disk " + peg.peek() + " on top of disks therefore cannot put disk " + disk.getLabel()
					+ " since it is bigger than that.");
		}

		peg.push(disk);
	}

	public Disk pop()
	{
		if (peg.isEmpty())
		{
			throw new IllegalStateException("Peg " + this.name + " has no disk now");
		}

		return peg.pop();
	}

	public void showDisks(){
		peg.stream().forEach(System.out::println);
	}

	public LinkedList<Disk> getPeg()
	{
		return peg;
	}

	public void setPeg(LinkedList<Disk> peg)
	{
		this.peg = peg;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
