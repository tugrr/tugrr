import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class main{
	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, SQLException{
		System.out.println("Here the final table of A-Group");
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		ResultSet rs1=null;
		int w;
				
		
		String connectionUrl = "jdbc:postgresql://localhost:5432/football";
	       Class.forName("org.postgresql.Driver");
	       try {
	    	   con = DriverManager.getConnection(connectionUrl,"postgres","Madi9999");
	    	   st=con.createStatement();
	    	   
	    	 
	    	   rs=st.executeQuery("select * from grup");
	           
	       System.err.println("Place  "+"Club name  "+"Matches  "+"Wins  "+"Defeats  "+"Drows"+" Goals  "+"Goals A.  "+"Difference  "+"Total score");
	           while(rs.next()) 
	        	   System.out.println(rs.getInt("place")+"      "+rs.getString("club_name")+"        "+rs.getInt("matches")+"        "+rs.getInt("wins")+"     "+rs.getInt("defeat")+"        "+rs.getInt("drow")+"     "+rs.getInt("goal_for")+"     "+rs.getInt("goal_against")+"         "+rs.getInt("differnce")+"          "+rs.getInt("total_score"));
	           
	           System.out.println("Here the final table of B-group");
	           rs1=st.executeQuery("select * from grupp");
	           
		       System.err.println("Place  "+"Club name  "+"Matches  "+"Wins  "+"Defeats  "+"Drows"+" Goals  "+"Goals A.  "+"Difference  "+"Total score");
		           while(rs1.next()) 
		        	   System.out.println(rs1.getInt("place")+"      "+rs1.getString("club_name")+"        "+rs1.getInt("matches")+"        "+rs1.getInt("wins")+"     "+rs1.getInt("defeat")+"        "+rs1.getInt("drow")+"     "+rs1.getInt("goal_for")+"     "+rs1.getInt("goal_against")+"         "+rs1.getInt("differnce")+"          "+rs1.getInt("total_score"));
		        	   }
	       
	       
	       catch(Exception e) {
        	   System.out.println(e);
           }finally {
        	   try {
        		   rs.close();
        		   rs1.close();
        		   st.close();
        		   con.close();
        	   }catch(SQLException throwables) {
        		   throwables.printStackTrace();
        	   
           }
           }
	       
		
	    clubs club1=new clubs("Real", "Barca", "Bayern", "Juve");
		league league1=new league("Real", "Barca", "Bayern", "Juve", "Real-Bayern", "Barca-Juve", "Real-Barca", 0);
		bet bet1=new bet(0, 0);
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("First semifinal match: Real-Bayern. You have 1000 tenge");
		System.out.print("Your bet of - ");
		bet1.setBet(sc.nextInt());
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			if(bet1.getBet()<=bet1.money) {
				break;
			}
			if(bet1.getBet()>bet1.money)
			System.out.println("You dont have any money."+" Set under "+bet1.money);
			bet1.setBet(sc.nextInt());
			
			
		}	
		System.out.println("on a "+league1.getSemifinal()+ " match. Choose one club.");
		System.out.println("1. "+club1.getReal()+" win - coef=2");
		System.out.println("2. "+club1.getBayern()+" win - coef=2");
		league1.setChoose(sc.nextInt());
		if(league1.getChoose()==1) {
			bet1.win();
		}
		else if(league1.getChoose()==2) {
			bet1.lose();
		}
		System.out.println("Current bank "+bet1.money);
		if(bet1.money==0) {
			System.out.println("Game over. You don't have any money");
			System.out.println("Would you like to deposit money? 1-yes, 2-no");
			
			w=sc1.nextInt();
			if(w==1) {
				System.out.println("How much money you can deposit");
				bet1.setDeposit(sc2.nextInt());
				bet1.deposit();
				System.out.println("You have deposited an amount of "+bet1.getDeposit()+". New bank - "+bet1.money);
			}
			else if(w==2) {
				System.out.println("Ok. Good bye");
			}
		}
		if(bet1.money>0) {
			System.out.println("Second semifinal match: Barca-Juve");
			
		System.out.print("Your bet of - ");
		bet1.setBet(sc.nextInt());
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			if(bet1.getBet()<=bet1.money) {
				break;
			}
			if(bet1.getBet()>bet1.money)
			System.out.println("You dont have any money."+" Set under "+bet1.money);
			bet1.setBet(sc.nextInt());
			
			}
		System.out.println("on a "+league1.getSemifinal()+ " match. Choose one club.");
		System.out.println("1. "+club1.getBarca()+" win - coef=2");
		System.out.println("2. "+club1.getJuve()+" win - coef=2");
		league1.setChoose(sc.nextInt());
		if(league1.getChoose()==1) {
			bet1.win();
		}
		else if(league1.getChoose()==2) {
			bet1.lose();
		}
		if(bet1.money>0) {
		System.out.println("Current bank "+bet1.money);
		}
		if(bet1.money==0) {
			System.out.println("Game over. You don't have any money");
System.out.println("Would you like to deposit money? 1-yes, 2-no");
			
			w=sc1.nextInt();
			if(w==1) {
				System.out.println("How much money you can deposit");
				bet1.setDeposit(sc2.nextInt());
				bet1.deposit();
				System.out.println("You have deposited an amount of "+bet1.getDeposit()+". New bank - "+bet1.money);
			}
			else if(w==2) {
				System.out.println("Ok. Good bye");
			}
		}
		if(bet1.money>0) {
			System.out.println("Grand Final: Real-Barca");
		System.out.print("Your bet of - ");
		bet1.setBet(sc.nextInt());
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			if(bet1.getBet()<=bet1.money) {
				break;
			}
			if(bet1.getBet()>bet1.money)
			System.out.println("You dont have any money."+" Set under "+bet1.money);
			bet1.setBet(sc.nextInt());
			
			}
		System.out.println(" on a " +league1.getGrandfinal()+ " match. Choose one club.");
		System.out.println("1. "+club1.getReal()+" win - coef=2");
		System.out.println("2. "+club1.getBarca()+" win - coef=2");
		league1.setChoose(sc.nextInt());}
		if(league1.getChoose()==1) {
			bet1.win();
		}
		
		else if(league1.getChoose()==2&&bet1.money>0) {
			bet1.lose();
			
				System.out.println("Real won Barca");
			
		}
		
	
		if(bet1.money>0) {
		System.out.println("Current bank "+bet1.money);
		}
		if(bet1.money==0) {
			System.out.println("Game over. You don't have any money");
System.out.println("Would you like to deposit money? 1-yes, 2-no");
			
			w=sc1.nextInt();
			if(w==1) {
				System.out.println("How much money you can deposit");
				bet1.setDeposit(sc2.nextInt());
				bet1.deposit();
				System.out.println("You have deposited an amount of "+bet1.getDeposit()+". New bank - "+bet1.money);
			}
			else if(w==2) {
				System.out.println("Ok. Good bye");
			}
		}
		
		if(bet1.money>1000) {System.out.println("Real Madrid is the winner this league. And you are so lucky, you have "+bet1.money+". It is so excellent.");}
		
	
	
	
	
	
	
	
	
	
	
	}
	}}
