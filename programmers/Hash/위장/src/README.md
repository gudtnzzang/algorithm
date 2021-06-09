# 완주하지 못한 선수
* [문제내용](https://programmers.co.kr/learn/courses/30/lessons/42578)
  </br></br>
## 코드 v1
```
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hm = new HashMap<>();
        for(String p : participant) {
            hm.put(p, hm.getOrDefault(p,0) + 1);
        }

        for(String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
```
<br/><br/>
## description
```
전형적인 경우의 수 문제에서 하나도 안 입은 경우, 즉 모두가 0인 경우를 제외하는 방식으로 풀었습니다.
```

<br/><br/>
## refactoring

* 
