package tp1.exo1;
public class OperationsArithmetiques
{
	private double operande1;
	private double operande2;
	
	public double getOperande1()
	{
		return(this.operande1);
	}
	
	public double getOperande2()
	{
		return(this.operande2);
	}
	
	public void setOperande1(double op1)
	{
		this.operande1 = op1;
	}
	
	public void setOperande2(double op2)
	{
		this.operande2 = op2;
	}
	
	public double sommeOperandes()
	{
		return(this.getOperande1() + this.getOperande2());
	}
	
	public double diffOperandes()
	{
		return(this.getOperande1() - this.getOperande2());
	}
	
	public double prodOperandes()
	{
		return(this.getOperande1() * this.getOperande2());
	}
	
	public double divOperandes()
	{
		return(this.getOperande1() / this.getOperande2());
	}
	
	public static void main(String[] args)
	{
		OperationsArithmetiques opArith1 = new OperationsArithmetiques();
		OperationsArithmetiques opArith2 = new OperationsArithmetiques();
		
		opArith1.setOperande1(2.1);
		opArith1.setOperande2(3.5);
		
		opArith2.setOperande1(8.6);
		opArith2.setOperande2(2.8);
		
		//Opérations sur opArith1
		System.out.println("Resultat de la somme entre " + opArith1.getOperande1() + " et " + opArith1.getOperande2() + " = " + opArith1.sommeOperandes());
		System.out.println("Resultat de la soustraction entre " + opArith1.getOperande1() + " et " + opArith1.getOperande2() + " = " + opArith1.diffOperandes());
		System.out.println("Resultat du produit entre " + opArith1.getOperande1() + " et " + opArith1.getOperande2() + " = " + opArith1.prodOperandes());
		System.out.println("Resultat de la division entre " + opArith1.getOperande1() + " et " + opArith1.getOperande2() + " = " + opArith1.divOperandes());
		
		//Opérations sur opArith2
		System.out.println("Resultat de la somme entre " + opArith2.getOperande1() + " et " + opArith2.getOperande2() + " = " + opArith2.sommeOperandes());
		System.out.println("Resultat de la soustraction entre " + opArith2.getOperande1() + " et " + opArith2.getOperande2() + " = " + opArith2.diffOperandes());
		System.out.println("Resultat du produit entre " + opArith2.getOperande1() + " et " + opArith2.getOperande2() + " = " + opArith2.prodOperandes());
		System.out.println("Resultat de la division entre " + opArith2.getOperande1() + " et " + opArith2.getOperande2() + " = " + opArith2.divOperandes());
	}
	
	
}