# 전화번호 목록
* [문제내용](https://programmers.co.kr/learn/courses/30/lessons/42577)
  </br></br>
## 코드 v1
```
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
```
<br/><br/>
## refactoring

* 
