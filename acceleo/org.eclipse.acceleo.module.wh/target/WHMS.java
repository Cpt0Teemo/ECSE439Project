class WHMS{
	public static void main(String[] args) {

		WHFactory factory = WHFactory.eINSTANCE;
		WarehouseManagement aWhm = factory.createWarehouseManagement();

		//creating company
		Company CoolCompanyInc = factory.createCompany();
		CoolCompanyInc.setName("CoolCompanyInc");
		CoolCompanyInc.setAddress("3000 Rue Coolio, QC H8T 3P8");
		aWhm.getCompanies().add(CoolCompanyInc);
		
			//createing warehouse
			Warehouse Warehouse10020 = factory.createWarehouse();
			Warehouse10020.setName("Warehouse10020");
			CoolCompanyInc.getWarehouses().add(Warehouse10020);
	
				//creating person
				Person p1 = factory.createPerson();
				Warehouse10020.getWorkers().add(p1);
				p1.setName("p1");
					//creating roles
					//create mamager role
					Manager m1 = factory.createManager();
					p1.getRoles().add(m1);
					m1.setEmployeeId("m1");
					m1.setStartDate("13/11/1999");
					m1.setEndDate("31/01/2022");
				
				//creating person
				Person p2 = factory.createPerson();
				Warehouse10020.getWorkers().add(p2);
				p2.setName("p2");
					//creating roles
					//create employee role
					Employee e1 = factory.createEmployee();
						//create employee availability
						Availability av2 = factory.createAvailability();
						av2.setId("av2") ;
						av2.setStartTime("31/01/2022"); 
						av2.setEndTime("23/02/2020") ;

					p2.getRoles().add(e1);
					e1.setEmployeeId("e1");
					e1.setStartDate("13/11/1999");
					e1.setEndDate("31/11/2023");
				
			
			//create teams
			Team TeamB1 = factory.createTeam();
			CoolCompanyInc.getTeams().add(TeamB1);
			TeamB1.setName("TeamB1");
				
			//create tasks
			Task t1 = factory.createTask();
			CoolCompanyInc.getTasks().add(t1);
			t1.setId("t1");
			t1.setDescription("this is a random task");
	}
}
