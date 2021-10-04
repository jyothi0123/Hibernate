package com.te.hibernatedemo.bean;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		StudentImplemation studentImplemation=new StudentImplemation();
		Scanner s=new Scanner(System.in);
		boolean exit=false;
		boolean exit1=false;
		do {
				System.out.println("press 1 to see all data");
			
				System.out.println("press 2 to see any particular data");
				System.out.println("press 3 to update any particular data ");
				System.out.println("press 4 to delete data");
				
				System.out.println("press 5 to exit");
				System.out.println("enter your choice");
				int ch=s.nextInt();
				switch(ch)
				{
					case 1:{
						studentImplemation.displayingDetailsOfStudents();
							}
							break;
					case 2:{
						System.out.println("enter the id");
						int id=s.nextInt();
						
							studentImplemation.displayParticularData(id);
				
						
						
							}
					break;
					case 3:{
						do {
							System.out.println("1.update name");
							System.out.println("2.update phoneno");
							System.out.println("3.update standard");
							System.out.println("4.to stop");
							System.out.println("enter your choice");
							int ch1=s.nextInt();
							
							switch(ch1)
							{
								case 1:{
									System.out.println("enter the id");
									
									int id=s.nextInt();
									
									studentImplemation.toUpdateName(id);
									}
										break;
								case 2:{
									System.out.println("enter the id");
									
									int id=s.nextInt();
									
									studentImplemation.toUpdatePhoneno(id);
									}
										break;
								case 3:{
									System.out.println("enter the id");
									
									int id=s.nextInt();
									
									studentImplemation.toUpdateStandard(id);
								}
								break;
								case 4: 
									exit1=true;
									break;
							}
							
							
						}
						while(!exit1);
						break;
						}
					case 4:
					{
						System.out.println("enter the id");
						int id=s.nextInt();
						studentImplemation.toDeleteParticularData(id);
					}
					break;
					
					case 5: System.out.println("enter 1 to stop");
					int i=s.nextInt();
					if(i==1)
					exit=true;
					
				}
		}
		while(!exit);
	}

}
