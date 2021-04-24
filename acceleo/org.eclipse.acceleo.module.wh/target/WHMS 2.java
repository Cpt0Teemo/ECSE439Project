class WHMS{
	public static void main(String[] args) {

		WHFactory factory = WHFactory.eINSTANCE;
		WarehouseManagement aWhm = factory.createWarehouseManagement();

		//creating company
		Company Amazon = factory.createCompany();
		Amazon.setName("Amazon");
		Amazon.setAddress("3000 Rue Louis A Amos, Lachine, QC H8T 3P8");
		aWhm.getCompanies().add(Amazon);
		
			//createing warehouse
			Warehouse Warehouse10020 = factory.createWarehouse();
			Warehouse10020.setName("Warehouse10020");
			Amazon.getWarehouses().add(Warehouse10020);
	
				//creating person
				Person p1 = factory.createPerson();
				Warehouse10020.getWorkers().add(p1);
				p1.setName("p1");
					//creating roles
					//create employee role
					Employee xe1 = factory.createEmployee();
						//create employee availability
						Availability av1 = factory.createAvailability();
						av1.setId("av1") ;
						av1.setStartTime("12/13/2010"); 
						av1.setEndTime("23/02/2018") ;

					p1.getRoles().add(xe1);
					xe1.setEmployeeId("xe1");
					xe1.setStartDate("13/11/1999");
					xe1.setEndDate("12/11/2009");
				
					//creating roles
					//create mamager role
					Manager m1 = factory.createManager();
					p1.getRoles().add(m1);
					m1.setEmployeeId("m1");
					m1.setStartDate("13/11/2009");
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
				
				//creating person
				Person p3 = factory.createPerson();
				Warehouse10020.getWorkers().add(p3);
				p3.setName("p3");
					//creating roles
					//create employee role
					Employee e2 = factory.createEmployee();
						//create employee availability
						Availability av3 = factory.createAvailability();
						av3.setId("av3") ;
						av3.setStartTime("31/01/2022"); 
						av3.setEndTime("23/02/2020") ;

					p3.getRoles().add(e2);
					e2.setEmployeeId("e2");
					e2.setStartDate("13/11/1999");
					e2.setEndDate("31/01/2022");
				
			//createing warehouse
			Warehouse Warehouse10030 = factory.createWarehouse();
			Warehouse10030.setName("Warehouse10030");
			Amazon.getWarehouses().add(Warehouse10030);
	
				//creating person
				Person m1 = factory.createPerson();
				Warehouse10030.getWorkers().add(m1);
				m1.setName("m1");
					//creating roles
					//create mamager role
					Manager m2 = factory.createManager();
					m1.getRoles().add(m2);
					m2.setEmployeeId("m2");
					m2.setStartDate("12/12/1999");
					m2.setEndDate("31/01/2022");
				
			
			//create teams
			Team TeamB1 = factory.createTeam();
			Amazon.getTeams().add(TeamB1);
			TeamB1.setName("TeamB1");
			Team TeamB2 = factory.createTeam();
			Amazon.getTeams().add(TeamB2);
			TeamB2.setName("TeamB2");
				
			//create tasks
			Task t1 = factory.createTask();
			Amazon.getTasks().add(t1);
			t1.setId("t1");
			t1.setDescription("this is a random task");
			Task t2 = factory.createTask();
			Amazon.getTasks().add(t2);
			t2.setId("t2");
			t2.setDescription("Repair bathroom");
			Task t3 = factory.createTask();
			Amazon.getTasks().add(t3);
			t3.setId("t3");
			t3.setDescription("Find a way to sell faster");
		//creating company
		Company Microsoft = factory.createCompany();
		Microsoft.setName("Microsoft");
		Microsoft.setAddress("2000 McGill College Ave, Montreal, Quebec H3A 3H3");
		aWhm.getCompanies().add(Microsoft);
		
			//createing warehouse
			Warehouse mw304 = factory.createWarehouse();
			mw304.setName("mw304");
			Microsoft.getWarehouses().add(mw304);
	
				//creating person
				Person p1 = factory.createPerson();
				mw304.getWorkers().add(p1);
				p1.setName("p1");
					//creating roles
					//create employee role
					Employee xe2 = factory.createEmployee();
						//create employee availability
						Availability av4 = factory.createAvailability();
						av4.setId("av4") ;
						av4.setStartTime("12/13/1999"); 
						av4.setEndTime("23/02/2019") ;

						//create employee availability
						Availability av5 = factory.createAvailability();
						av5.setId("av5") ;
						av5.setStartTime("01/05/2019"); 
						av5.setEndTime("23/02/2020") ;

					p1.getRoles().add(xe2);
					xe2.setEmployeeId("xe2");
					xe2.setStartDate("13/11/1999");
					xe2.setEndDate("12/13/2003");
				
					//creating roles
					//create mamager role
					Manager m3 = factory.createManager();
					p1.getRoles().add(m3);
					m3.setEmployeeId("m3");
					m3.setStartDate("24/02/2020");
					m3.setEndDate("31/01/2022");
				
				//creating person
				Person p2 = factory.createPerson();
				mw304.getWorkers().add(p2);
				p2.setName("p2");
					//creating roles
					//create employee role
					Employee e3 = factory.createEmployee();
						//create employee availability
						Availability av6 = factory.createAvailability();
						av6.setId("av6") ;
						av6.setStartTime("12/13/1999"); 
						av6.setEndTime("23/02/2020") ;

					p2.getRoles().add(e3);
					e3.setEmployeeId("e3");
					e3.setStartDate("13/11/1999");
					e3.setEndDate("31/01/2022");
				
				//creating person
				Person p3 = factory.createPerson();
				mw304.getWorkers().add(p3);
				p3.setName("p3");
					//creating roles
					//create employee role
					Employee e4 = factory.createEmployee();
						//create employee availability
						Availability av7 = factory.createAvailability();
						av7.setId("av7") ;
						av7.setStartTime("12/13/1999"); 
						av7.setEndTime("23/02/2020") ;

					p3.getRoles().add(e4);
					e4.setEmployeeId("e4");
					e4.setStartDate("13/11/1999");
					e4.setEndDate("31/01/2022");
				
			
			//create teams
			Team TeamM1 = factory.createTeam();
			Microsoft.getTeams().add(TeamM1);
			TeamM1.setName("TeamM1");
				
			//create tasks
			Task t4 = factory.createTask();
			Microsoft.getTasks().add(t4);
			t4.setId("t4");
			t4.setDescription("this is another random task");
	}
}
