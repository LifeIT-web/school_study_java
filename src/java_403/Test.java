package java_403;

interface Cal
{
	void swing();
}

interface Bow
{
	void pull();
}

interface Gun
{
	void shoot();
}


interface RamBo extends  Gun ,Bow, Cal
{
	void play();
}

class JiYoon implements RamBo
{

	@Override
	public void shoot() {
		System.out.println("ÃÑÀ» ½ð´Ù³×");
	}

	@Override
	public void pull() {
		System.out.println("È°À» ½ð´Ù³×");
	}

	@Override
	public void swing() {
		System.out.println("Ä®À» ÈÖµÑÀº´Ù³×");
	}

	@Override
	public void play() {
		System.out.println("¾ß³îÀÚ");
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		JiYoon obj = new JiYoon();
		
		obj.shoot();
		obj.swing();
		obj.pull();
		obj.play();
	}
	
}
