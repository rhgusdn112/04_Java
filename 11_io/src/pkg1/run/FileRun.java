package pkg1.run;

import pkg1.service.FileService;

/* [개발자 상식]
 * 
 * OS - 운영 체제
 * 
 * Windows : 폴더 == linux/Mac : 디렉토리
 * 
 * 
 * 경로 표기 방법(하위 폴더)
 * Windows 		: \ (백슬래시)
 * linux / Mac  : / (슬래시)
 *
 * -> Java 는 모든 운영체제가 호환 되기 때문에
 * 	  경로 표기 방법도 모두 호환한다!!
 * 
 * 최상위 경로(root) : \ 또는 /
 * 
 * - Windows : C드라이브, D드라이브 ...
 * - Linux / Mac : /Users
 */

public class FileRun {

	public static void main(String[] args) {
		FileService service = new FileService();
//		service.test1();
//		service.test2();
		service.test3();
	}

}
