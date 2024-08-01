package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import dto.Member;

public class MemberDaoImpl implements MemberDao {

	private final String FILE_PATH = "/io_test/membership.dat";
	
	private List<Member> memberList = null; // 제네릭 Member는 dto import 해야함
	
	private ObjectInputStream  ois = null;
	private ObjectOutputStream oos = null;
	
	public MemberDaoImpl() throws ClassNotFoundException, 
								  IOException,
								  FileNotFoundException {
		File file = new File(FILE_PATH);
		
		if(file.exists()) { // 존재할 경우
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				memberList = (ArrayList<Member>)ois.readObject();
			} finally {
			// try에서 발생하는 예외를 throws 구문으로 처리하게 되면, catch 구문을 작성할 필요는 없다.	
			if(ois != null) ois.close();
			
			}
		} // 존재하지 않을 경우
		else {
		memberList = new ArrayList<Member>();
	}
}
	
	
	public List<Member> getMemberist() {
		return memberList;
	}
	
	public boolean addMember(Member member) throws IOException{
		memberList.add(member);
		saveFile();
		return true;
	}
	
	public void saveFile() throws IOException{
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(memberList);
		} finally {
			if(oos != null) oos.close(); // flush() + 메모리 반환
		}
	}


	@Override
	public List<Member> getMemberList() {
		return null;
	}
	
}
