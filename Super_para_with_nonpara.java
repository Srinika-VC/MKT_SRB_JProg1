package super_this_calling_progList;

class Reporting
{
	Reporting(String a)
	{
		System.out.println("Reporting 1");
	}}
class screenshort extends Reporting
{
 screenshort() 
	{
		super("MKT");
		System.out.println("screenshort");
	}}
public class Super_para_with_nonpara extends screenshort
{
	Super_para_with_nonpara()
	{
		super();
	System.out.println("para and non para");
}
	
public static void main(String[] args) 
	{
		new Super_para_with_nonpara();
	}}
