import  java.util.Scanner;
class Ac
{
     private int choice;
     public  void display()
       { 
		     System.out.println("****************************");
                     System.out.println("                      -------Available seats are--------");
                     System.out.println("                 |*|   1.  321                 |*|   6.   45  ");
                     System.out.println("                 |*|   2.  231                 |*|   7.   525");
                     System.out.println("                 |*|   3.  333                 |*|   8.   225");
                     System.out.println("                 |*|   4.  438                 |*|   9.   522");
                     System.out.println("                 |*|   5.  555                 |*|   10.  69");
                     System.out.println("");
		     System.out.println("***************************");
		     System.out.println("            GO TO RESERVATION SECTIONO IF U WANT TO--->TO BOOK YOUR SEAT");
		     System.out.println("            IF U WANT TO GO BACK TO THE MAIN MENU PREss 1 else PRESS 2 TO EXIT ");
		     Scanner ch=new Scanner(System.in);
                     choice=ch.nextInt(); 
		     System.out.println("");
       		     switch(choice)
 			{
				case 1:
					break;
				case 2:System.exit(0);
			}
          }
}


  class Reserve
       {
            private  String name;
            private  int age;
            private  long Aaddhar_no;
            private  long mobile_no;
            private String gender;
            private int seat_no;

          
            public void getinfo()
               {
                       System.out.println("          ################--------------------------------------------######################");
                       System.out.print("                             enter  Passengers name      ------>");
                       Scanner sc=new Scanner(System.in);
                       name=sc.nextLine();

                       System.out.print("                             enter  your age             ------>");
                       Scanner ag=new Scanner(System.in);
                       age=ag.nextInt();
                  
                       System.out.print("                             enter  your  Aaddhar number ------>");
                       Scanner an=new Scanner(System.in);
                       Aaddhar_no=an.nextLong();

                       System.out.print("                             enter  your mobile_no       ------>");
                       Scanner mn=new Scanner(System.in);
                       mobile_no=mn.nextLong();

                       System.out.print("                             enter  your gender          ------>");
                       Scanner gd=new Scanner(System.in);
                       gender=gd.nextLine();
                         
                       
                       System.out.print("                             enter your seat number      ------>");
                      Scanner sn=new Scanner(System.in);

                       seat_no=sn.nextInt();
			System.out.println("     ");
                        System.out.println("     ");
                     while(true)
                     {    int flag=0;
                            
                        int []arr={321,213,333,438,555,45,525,225,522,69};
                        for(int i=0;i<10;i++)
                        {
                             if(seat_no==arr[i])
                                   {

                                      flag=1;
                                      
                                 break;}
                           }
               if(flag==1)
                 {    System.out.println("                           seat is confirmed");
                     
		      System.out.println("");
		      System.out.println("");
		      break;	
 			}
                else
                      System.out.println("                           seat is not available");
		      System.out.println("");
		      System.out.println("  		             this seat is already reserved ");

                      System.out.println("                           enter your seat number again              ------->");
                         Scanner snn=new Scanner(System.in);
                 seat_no=snn.nextInt();
}
          
                 }     
               
                           public void showinfo()
                          {  
                            System.out.println("     ");
                            
                            System.out.println("     ");
                            System.out.println("                  ############################################################");
                            System.out.println("                  ##              Your name is"+ "  "+ name                  );
                            System.out.println("                  ##              Your  Aaddhar number is"+ "  "+ Aaddhar_no );
                            System.out.println("                  ##              Your  age  is"+ "  "+ age                  ); 
                            System.out.println("                  ##              Your mobile number  is"+ "  "+ mobile_no   );
                            System.out.println("                  ##              Your gender is"+ "  "+ gender              );
                            System.out.println("                  ##              Your seat number is"+ "  "+ seat_no        );
                              
                            System.out.println("                  ##       ");
                            System.out.println("                 #############################################################");
			    System.out.println("");
			    System.out.println("");
                         }
          }

       
class Project
{
   public static void main(String args[])
     {
      int d;
      while(true)
      { 
       System.out.println("******BUS  SYSTEM  RESERVATION(from PrayagRaj to Luckn0w)**********");
       System.out.println("			|*|      		         |*|");
       System.out.println("        		|*|   1--> Available seats     |*|");   
       System.out.println("        		|*|   2-->Reservation	         |*|");       
       System.out.println("        		|*|   3-->Show                 |*|"); 		
       System.out.println("        		|*|   4-->Exit                 |*|"); 		
       System.out.println("			|*|			         |*|");
       System.out.println("************************************");
       System.out.println("     ");
       System.out.print("                              enter  your choice------->");
	
       Scanner ab=new Scanner(System.in);//object of scanner 
       
       int a=ab.nextInt();
	System.out.println("");
       System.out.println("");
         
    switch(a)
   { 
     case 1:{  Ac a1=new Ac();
               a1.display();
             }
             break;                 
                  
     case 2:
            {
               Reserve r1=new Reserve();
               r1.getinfo();   
               r1.showinfo();    
             }
	     break;
        
     case 3:
            {
	     System.out.println("");
	     System.out.println("");
             Reserve r2=new Reserve();
             r2.showinfo();
	     System.out.println("");
	     System.out.println("");
             System.out.println("TICKET is ** NOT** confirmed");
            }
	    break;
                        
     case 4:System.exit(0);
 
     }
    }//while
  }
}