import java.util.Scanner;
class Trainer
{
private int tid;
private String tname;
private String tcourse;

public void setTid(int tid)
{
this.tid=tid;
}

public int getTid()
{
return this.tid;
}
public void setTname(String tname )
{
this.tname=tname;
}

public String getTname()
{
return this.tname;
}
public void setTcourse(String tcourse)
{
this.tcourse=tcourse;
}

public String getTcourse()
{
return this.tcourse;
}

public void tTrainer(int tid,String tname,String tcourse)
{
this.tid=tid;
this.tname=tname;
this.tcourse=tcourse;

}

}
class Test2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Trainer[] t=new Trainer[5];
for(int i=0;i<5;i++)
{
t[i]=new Trainer();
t[i].setTid(s.nextInt());
t[i].setTname(s.next());
t[i].setTcourse(s.next());
}
for(int j=0;j<5;j++)
{
System.out.println("TID is:"+t[j].getTid());
System.out.println("TNAME is:"+t[j].getTname());
System.out.println("TCOURSE is:"+t[j].getTcourse());
}
}
}