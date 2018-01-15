package q8_6;

public class MySolution
{

	private Peg left = new Peg("left");
	private Peg center = new Peg("center");
	private Peg right = new Peg("right");

	public void solve(int n)
	{
		for (int i = n ; i >= 1 ; i--) { // push to peg from big one to small one
			left.push(new Disk(i));
		}

		System.out.println("-- Before --");
		showDisks();

		System.out.println("-- Processing --");
		hanoi(n, left, center, right);

		System.out.println("-- After --");
		showDisks();
	}

	private void hanoi(int n, Peg from, Peg work, Peg to)
	{
		if (n == 0)
		{
			return;
		}

		hanoi(n - 1, from, to, work); // move n-1 th disk from 'from' to 'work', and 'to' now becomes 'work'

		moveDisk(from, to);

		hanoi(n - 1, work, from, to); // Now nth is moved, so move n-1 th disk from 'work' to 'to', and 'from' now becomes 'work'
	}

	private void moveDisk(Peg from, Peg to) {
		Disk disk = from.pop();
		System.out.println("Move disk " + disk.getLabel() + " from " + from.getName() + " to " + to.getName());
		to.push(disk);
	}

	private void showDisks() {
		System.out.println("Left: ");
		left.showDisks();

		System.out.println("Center: ");
		center.showDisks();

		System.out.println("Right: ");
		right.showDisks();
	}

}
