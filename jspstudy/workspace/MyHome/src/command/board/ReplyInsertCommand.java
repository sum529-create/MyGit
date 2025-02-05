package command.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.PathNRedirect;
import dao.BoardDao;
import dto.BoardDto;

public class ReplyInsertCommand implements BoardCommand {

	@Override
	public PathNRedirect execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String page = request.getParameter("page");
		
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String mId = request.getParameter("mId");
		int bNo = Integer.parseInt(request.getParameter("bNo"));	// 댓글 고유 번호 -> 현 번호 10 10 /n 현 번호 11 10 ...
		String bIp = request.getRemoteAddr();
		
		/* bNo	 bTitle		 bGroup		 bGroupOrd		 bDepth 
		10		게시글10	10				0				0 (게시글)
		11		ㄴ 댓글1	10				3				1 (댓글)
		12		ㄴ 댓글2	10				2				1 (댓글)    +
		13		 ㄴ 대댓	10				1				2 (대댓글) */
		
		/* 댓글 삽압 시
		1. bGroup: 게시글 bNo와 같다.
		2. bGroupOrd
			1) 1을 가진다.
			2) 기존 댓글들의 bGroupOrd를 1씩 증가시킨다.
		3. bDepth: 게시글의 bDepth + 1이다.
		 */
		
		BoardDto boardDto = BoardDao.getInstance().boardView(bNo);	// 이미 만들어진 boardView로 사용 (같은 구문)
		
		// 1. 같은 bGroup에서 원글의 gGroupOrd(먼저달린 댓글)보다 큰 bGroupOrd를 1씩 증가시킨다.
		// 같은 그룹의 원글에서만 다룬다.
		BoardDao.getInstance().replyUpdatebGroupOrd(boardDto);
		
		
		// 2. 댓글 만들기
		// 1) bGroup      	: 원글의 bGroup (boardDto.getGroup())
		// 2) bGroupOrd	: 원글의 bGroupOrd + 1 (boardDto.getGroupOrd() + 1)
		// 3) bDepth	: 원글의 bDepth + 1
		BoardDto replyDto = new BoardDto();
		replyDto.setbTitle(bTitle);
		replyDto.setbContent(bContent);
		replyDto.setmId(mId);
		replyDto.setbIp(bIp);
		replyDto.setbGroup(boardDto.getbGroup());
		replyDto.setbGroupOrd(boardDto.getbGroupOrd()+1);
		replyDto.setbDepth(boardDto.getbDepth()+1);
		
		// 댓글 삽입
		int result = BoardDao.getInstance().replyInsert(replyDto);
		
		// 기존에 달린 댓글들의 bGroupOrd를 모두 1씩 증가시킨다.
		// (가장 먼저 달린 댓글의 bGroupOrd 값이 가장 크다.)
		// 기존에 달린 댓글: bGroup이 같고, bGroupOrd가 0이 아닌 (bDepth가 0이 아닌) 게시글

		
		PathNRedirect pathNRedirect = new PathNRedirect();
		pathNRedirect.setPath("board/replyInsertResult.jsp?result=" + result + "&page=" + page);
		pathNRedirect.setRedirect(true);
		return pathNRedirect;
	}

}
