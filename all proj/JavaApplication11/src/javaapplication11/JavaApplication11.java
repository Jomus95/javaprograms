/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Jomus
 */



public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Student[] stu = new Student[3]; 
stu[0] = new Student(1,"Avtaev","Khuseyn" ); 
stu[1] = new Student(2,"Melnikov ","Vitaliy"); 
stu[2] = new Student(3,"Shabanovic","Denis" ); 

//stu[0].Prints(); 
for( int i=0;i<stu.length;i++){
 System.out.print(stu[i].course+" "+stu[i].fam+" "+stu[i].name);}
    }
}  

class Student 
{ 
public int course; 
public String name; 
public String fam; 
int[] ocenki={2,3,4,5}; 
public Student(int c, String f,String n){ 
this.course=c; 
this.fam=f; 
this.name =n; 

} 
void CalcAverageBall() 
{ 
int sum=0; 
for(int i=0;i<4;i++) 
{ sum+=ocenki[i]; 
System.out.print(course+);
} 
double average_ball=sum/4; 
} 
public boolean stipyxa(){ 
int k=0; 
for(int i=0;i<4;i++) 
if(ocenki[i]>=4) 
k++; 
if(k==4) 
return true; 
else 
return false; 
} 
//public Prints(){ 
//fot( int i=0;i<stu.length;i++){
 //System.out.print(stu[i].course+" "+stu[i].fam+" "+stu[i].name);}
    }
    

