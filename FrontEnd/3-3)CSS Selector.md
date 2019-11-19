##CSS Selector
HTML의 요소를 tag, id, html 태그 속성 등을 통해 쉽게 찾아주는 방법입니다.

### element에 style 지정을 위한 3가지 기본 선택자
- tag로 지정하기
```
<style>
     span {
       color : red;
     }
 </style>
```

- id로 지정하기

```
<style>
     #spantag {
       color : red;
     }
</style>

<body>
     <span id="spantag"> HELLO World! </span>
</body>
```

- class로 지정하기

```
<style>
     .spanClass {
     color : red
     }
</style>

<body>
     <span class="spanClass"> HELLO World! </span>
</body>
```

##CSS Selector의 다양한 활용

- id, class 요소 선택자와 함께 활용

```
#myid { color : red }
div.myclassname { color : red }
```

- 그룹 선택(여러 개 셀렉터에 같은 style을 적용해야 한다면)

```
h1, span, div { color : red }
h1, span, div#id { color : red }
h1.span, div.classname { color : red }
```

- 요소 선택 (공백) : 자손요소

```
#jisu span { color : red }
```

- 자식 선택(>) : 자식은 바로 하위 엘리먼트를 가리킵니다.

```
#jisu > span { color : red }
```

- n번째 자식요소를 선택합니다. (nth-child)

```
#jisu > p:nth-child(2) { color : red }
```