# HttpServletRequest
- http프로토콜의 request정보를 서블릿에게 전달하기 위한 목적으로 사용합니다.
- 헤더정보, 파라미터, 쿠키, URI, URL 등의 정보를 읽어 들이는 메소드를 가지고 있습니다.
- Body의 Stream을 읽어 들이는 메소드를 가지고 있습니다.

#HttpServletResponse
- WAS는 어떤 클라이언트가 요청을 보냈는지 알고 있고, 해당 클라이언트에게 응답을 보내기 위한 HttpServletResponser객체를 생성하여 서블릿에게 전달합니다.
- 서블릿은 해당 객체를 이용하여 content-type, 응답코드, 응답 메시지 등을 전달합니다.