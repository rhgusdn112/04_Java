package service;

import java.util.List;

import dao.MemberDao;
import dao.MemberDaoImpl;
import dto.Member;

public class MemberServiceImpl implements MemberService {

	private MemberDao dao = null;
	
	public MemberServiceImpl() throws  {
		
		dao = new MemberDaoImpl();
	
	
	// 1) 회원 목록을 얻어와서 휴대폰 번호 중복이 있는지 검사하는 구문
	List<Member> memberList = dao.getMemberList(); // List, Member import 해야함
	
	// 향상된 for문으로 작성
	for( Member member : memberList) {
		if( phone.equals(member.getPhone()) ) {
			return false;
		}
	}
	
	// 2) 중복이 아닌 경우 입력 받은 정보로 Member 객체 생성하고 DAO 에 전달하여 파일에 저장
	
	Member member = new Member(name, phone, 0, Member.COMMON);
	
	// DAO 메서드 호출 하고 결과 반환 받는 구문
	boolean result = dao.addMember(member);
	
	return result;
}

	public List<Member> getMemberList() {
		return dao.getMemberList();
	}
}