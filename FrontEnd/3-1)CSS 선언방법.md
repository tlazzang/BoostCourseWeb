## CSS의 구성
- selector(선택자)
- property
- value

## style을 HTML페이지에 적용하는 3가지 방법
1. inline
HTML태그 안에다가 적용하는 방법
다른 CSS파일에 적용한 것 보다 가장 먼저 적용합니다.
```
<p style="border:1px solid gray;color:red;font-size=20px"></p>
```

2. internal
header안에 style태그로 지정합니다.
구조와 스타일이 섞이게 되므로 유지보수가 어렵습니다.
별도의 CSS파일을 관리하지 않아도 되며 서버에 CSS파일을 부르기 위해 별도의 브라우저가 요청을 보낼 필요가 없습니다.

3. external

외부파일(.css)로 지정하는 방식입니다.
CSS 코드가 아주 짧지 않다면 가급적 이 방법으로 구현하는 것이 가장 좋습니다.
현업에서는 여러개의 CSS 파일로 분리하고 이를 합쳐서 서비스에서 사용하기도 합니다.
css를 외부파일로 구현하고 link태그를 이용해 적용합니다.
```
	<head>
		<link rel="stylesheet" href="style.css">
	</head>
```

## CSS 적용 방법의 우선순위
inline > internal = external