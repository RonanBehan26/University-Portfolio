/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistexample;

/**
 *
 * @author gward
 */
public class Person {
    public String name;
    public int age;

    public Person (String inName, int inAge)
    {
       name = inName;
       age = inAge;
    }
    public void setName(String newname)
    {
        // write your code here
        name = newname;

    }
    public String getName()
    {
        // write your code here
        return name;

    }
    public void setAge(int newage)
    {
        // write your code here
        age = newage;

    }
    public int getAge()
    {
        // write your code here
        return age;

    }
    public String printPerson()
    {
        // write your code here
        return (name+" "+age+"\n");
    }
   
}
