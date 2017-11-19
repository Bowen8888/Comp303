package UnitVisitorDesignPattern;

public class Driver
{
	public static void main(String[] args)
	{
		University mcGill = new University("McGill", "Fortier");
		Faculty science = new Faculty("Science", "Lennox");
		Faculty arts = new Faculty("Arts", "Maioni");
		mcGill.add(science);
		mcGill.add(arts);
		Department socs = new Department("Computer Science", "Kemme");
		Department math = new Department("Mathematics", "Alice");
		Department econ = new Department("Economics", "Bob");
		Department engl = new Department("English", "Carl");
		science.add(socs);
		science.add(math);
		arts.add(econ);
		arts.add(engl);
		Committee css = new Committee("Student Standing");
		science.add(css);
		Committee msc = new Committee("M.Sc. Program");
		socs.add(msc);
		msc.add(new Committee("Admissions"));
		msc.add(new Committee("Scholarships"));
		Committee space = new Committee("Space");
		socs.add(space);
		
		SearchVisitor v = new SearchVisitor("Kemme");
		mcGill.accept(v);
		System.out.println(v.getResult().name());
		
	}
}
