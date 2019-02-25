package first;

interface Lamb
{
	void draw();
}
class Lambda{
	public static void main(String[] args) {
		int pieces=27;
		Lamb l=()->{
			System.out.println("lamb chops "+pieces);
		};
		l.draw();
	}
}