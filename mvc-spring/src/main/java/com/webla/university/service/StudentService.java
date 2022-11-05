package com.webla.university.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.stereotype.Service;

import com.webla.university.model.Student;

@Service
public class StudentService {
	
	
	private static final String FIELD_SEPERATOR = "|";
	private static final String FILE_LOCATION = "D:\\workspaceresources\\studentinfo.txt";
	
	
	public boolean saveStudent(Student student) throws IOException {
		//read the student object
		
		//open connection
		File file = new File(FILE_LOCATION);
		
		//create a file if not exist
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//id|name|college|location
		String line = student.getId()+FIELD_SEPERATOR+
				student.getName()+FIELD_SEPERATOR+
				student.getCollege()+FIELD_SEPERATOR+
				student.getLocation();
		
		System.out.println("Line "+line);
		
		//write data into file
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0);
		
		while (raf.getFilePointer() < raf.length()) {
			System.out.println("Existing Line "+raf.readLine());
		}
		//save the save

		raf.writeBytes(line+System.lineSeparator());
		
		raf.close();
		
		//close the resource connection
		
		return false;
		
		
	}
	
	public List<Student>  loadStudentInfo() throws IOException {
		File file = new File(FILE_LOCATION);
		List<Student> students = new ArrayList<>();
		
		if(file.exists()) {
			//open stream
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			//point to first location
			raf.seek(0);
			while (raf.getFilePointer() < raf.length()) {
				//read line by line
				String line = raf.readLine();
				//id|name|college|location
				StringTokenizer tokens  = new StringTokenizer(line, FIELD_SEPERATOR);
				
				String[] studentArray = line.split(FIELD_SEPERATOR);
				
				
				StringTokenizer tokenizer 
				= new StringTokenizer(line, "|");
			
				while (tokenizer.hasMoreElements()) {
					Student student = new Student();
					student.setId((String)tokenizer.nextElement());
					student.setName((String)tokenizer.nextElement());
					student.setCollege((String)tokenizer.nextElement());
					student.setLocation((String)tokenizer.nextElement());
					students.add(student);

				}
			}
		}else {
			System.out.println("File Not Found");
		}
		
		return students;
	}
	
	
}
