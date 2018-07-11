import java.io.*;
public class Employee implements Serializable
{
	int eid;
	String name;
	double basic;
	transient double ta;
}

