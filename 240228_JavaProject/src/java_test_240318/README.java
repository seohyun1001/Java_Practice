package java_test_240318;

public class README {
	
	// 수강신청 화면
	// 1) 로그인 : 학생/조교(교수)
	// 2) [학생] 강의 조회 화면 ->
			// '수강신청' 버튼 누르면 수강신청 하시겠습니까 팝업창
			// 과목명 누르면 상세정보
	// 3) [학생] 수강신청목록 조회 화면
	// 4) [학생] 수강신청성공/탈락 화면
	// 5) [조교] 강의 조회 화면 -> '등록', '수정', '삭제' 버튼
	// 6) [조교] 5)에서 '수정'버튼 누르면 수정할 수 있는 화면
	
	// [조교] 강의 당 신청한 학생 목록 --- 되면
	
	
	
	// 필요한 것 :
	// 1) 강의 데이터(o)
	
	// 2) 학생 데이터(o) - 학번, 이름, 학과, 학년, 비밀번호
	// studentNum, studentName, studentMajor, studentGrade, studentPwd
	// (2411111, '학생1', '경영학과', 3, '1234');
	
	// 3) 교수(조교)데이터(o) - 직번, 이름, 학과, 비밀번호
	// employeeNum, employeeName, employeeDEPT, employeePwd
	// (24022222, '교수1', '경영학과', 'qwerty');
	// (24933333, '직원1', '경영학과', 'aaa111');
	
	
	// DTO	
//	CREATE TABLE COURSE_LIST (
//		    division    VARCHAR2(20) NOT NULL,
//		    courseNum   VARCHAR2(20) NOT NULL PRIMARY KEY,
//		    courseName  VARCHAR2(50) NOT NULL,
//		    professor   VARCHAR2(20) NOT NULL,
//		    credit      NUMBER(20) NOT NULL,
//		    timeTable   VARCHAR2(30) NOT NULL,
//		    classroom   VARCHAR2(30) NOT NULL,
//		    limitCount  NUMBER(10) NOT NULL,
//		    grade       NUMBER(10) NOT NULL);
//

//	CREATE TABLE STUDENT_LIST(
//    studentNum NUMBER(10) NOT NULL PRIMARY KEY,
//    studentName VARCHAR2(20) NOT NULL,
//    studentMajor VARCHAR2(20) NOT NULL,
//    studentGrade NUMBER(10) NOT NULL,
//    studentPwd VARCHAR2(30) NOT NULL);
	
//  CREATE TABLE EMPLOYEE_LIST(
//    employeeNum NUMBER(10) NOT NULL PRIMARY KEY,
//    employeeName VARCHAR2(20) NOT NULL,
//    employeeDEPT VARCHAR2(20) NOT NULL,
//    employeePwd VARCHAR2(30) NOT NULL);
	


	// 구현한 것
	// 로그인 화면
	// -> 학생 리스트와 직원 리스트의 데이터베이스를 이용하여
	// -> 학생이 로그인 하면 학생용 수강신청 화면으로,
	// -> 교수 또는 교직원이 로그인 하면 수강신청 관리 화면으로 이동
	
	
	
	
}
