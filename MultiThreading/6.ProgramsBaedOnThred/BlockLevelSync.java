/*Bolck level SynchroniZation*/
class BankAccount
{
	int balance=100;
	
	public void balanceOp(int amnt)
	{
		synchronized (this)
		{
			balance+=amnt;
			
			try
			{	
				System.out.println(Thread.currentThread().getName()+"read balance"+balance);
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public int getBal()
	{
		return balance;
	}
}
class OPerations extends Thread
{
	BankAccount b;
	
	int amnt;
	public OPerations(BankAccount acc,int amnt)
	{
		this.b=acc;
		this.amnt=amnt;
	}
	
	public void run()
	{
		b.balanceOp(amnt);
	}
}
public class BlockLevelSync
{
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();
		OPerations o=new OPerations(b,100);
		o.start();
		
		
	
	}
}

Solved 300+ coding problems on platforms like LeetCode,GeeksforGeeks.







GOKUL BHOR 
            +91-9284771165 | gokulbhor.sit.comp@gmail.com |Linkedin | GitHub | Leetcode |Portfolio
Objective
Seeking a responsible position in an organisation,which gives me a chance to improve knowledge,enhance my skills and enable me to strive towards the overall development of the organisation.  
EDUCATION   
Sinhgad Institute of Technology, Lonavala   	  	  	  	  	  	          Jun 2021-Jul 2025  
B.E. in Computer Engineering                                                                                                              8.14/10
HSC-Maharashtra Junior College,Ahmednagar                                                                           86% - 2021 
SKILLS  
Languages: C,C++,java,Javascript  
Platforms/Software/Databases: Git,Github,VS Code,Linux,SQL.  
Technologies: HTML,CSS,javascript,Node.js  
Core Fundamentals: Operating System,Database Management System, OOPs,DataStructures,problem solving.  
PROJECTS  	
Fire Detection System using Convolutional Neural Networks (CNN) |GitHub
•	Developed a fire detection system leveraging CNN to detect flames in real-time from images and video   feeds.
•	Applied adaptive background subtraction and flame-specific features (brightness, flicker, shape) to   improve detection accuracy.
•	Improved public safety potential in surveillance and disaster prevention scenarios.
•	Tech Stack: OpenCV, TensorFlow, NumPy
Mentorship Platform | Live  |  GitHub
•	Designed and developed a Mentorship Platform that connects mentors and students, allowing users to explore mentorship services and book slots through a user-friendly web interface.
•	Implemented login-based access control and interactive UI for mentor browsing and slot booking.
•	Designed backend architecture using Node.js  and structured SQL database schema for user and booking management.
Customized Virtual File System (CVFS) | GitHub
•	Implemented a virtual file system supporting Linux-style commands
•	Enabled hierarchical directory management, file creation, deletion, reading, and writing operations.
•	Simulated command-line interface interactions for managing files and directories efficiently.
•	Tech Stack:C++,Data Structures.
•	
•	
•	
•	
•	
•	
•	
•	 
•	
•	
•	
•	

•	




Fire Detection System using Convolutional Neural Networks (CNN) |GitHub
•	Developed a fire detection system leveraging CNN to detect flames in real-time from images and video   feeds.
•	Applied adaptive background subtraction and flame-specific features (brightness, flicker, shape) to   improve detection accuracy.
•	Improved public safety potential in surveillance and disaster prevention scenarios.
•	Tech Stack: OpenCV, TensorFlow, NumPy
Mentorship Platform | Live  |  GitHub
•	Designed and developed a Mentorship Platform that connects mentors and students, allowing users to explore mentorship services and book slots through a user-friendly web interface.
•	Implemented login-based access control and interactive UI for mentor browsing and slot booking.
•	Designed backend architecture using Node.js  and structured SQL database schema for user and booking management.
Customized Virtual File System (CVFS) | GitHub
•	Implemented a virtual file system supporting Linux-style commands
•	Enabled hierarchical directory management, file creation, deletion, reading, and writing operations.
•	Simulated command-line interface interactions for managing files and directories efficiently.
•	Tech Stack:C++,Data Structures.
