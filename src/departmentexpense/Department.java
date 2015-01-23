package departmentexpense;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {
	
List<Manager> managerList = new ArrayList<Manager>();
	
	List<Developer> developerList = new ArrayList<Developer>();
	
	List<Tester> testerList = new ArrayList<Tester>();
	
	public List<Manager> addManager(Manager manger){
		managerList.add(manger);
		return managerList;
	}
	
	public List<Developer> addDeveloper(Developer dev){
		developerList.add(dev);
		return developerList;
	}
	
	public List<Tester> addTester(Tester test){
		testerList.add(test);
		return testerList;
		
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Department";
	}

	@Override
	public Integer price() {
		// TODO Auto-generated method stub
		// Price of all developers
		int prce =0;
		for(Developer dev:developerList)
			prce = prce + dev.price();
		
		for(Tester tst:testerList)
			prce = prce + tst.price();
		
		for(Manager mgr :managerList){
			do{
			for(Developer dev:mgr.developerList)
				prce = prce + dev.price();
			
			for(Tester tst:mgr.testerList)
				prce = prce + tst.price();
			
			
			for(Manager mn:mgr.managerList){
			prce = prce + mn.price();
			
			}
			}
			while(!mgr.managerList.isEmpty());
			
		}
		return prce;
	}

}
