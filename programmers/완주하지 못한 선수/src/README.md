# 코드 v1
```
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hm = new HashMap<>();
        for(String p : participant) {
            if(hm.get(p) != null) {
                hm.put(p, hm.get(p) + 1);
            }
            else {
                hm.put(p, 1);
            }
        }

        for(String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        for(String p : participant) {
            if(hm.get(p) != 0) {
                answer = p;
            }
        }

        return answer;
    }
```
<br/><br/>
# refactoring

* HashMap의 setOrDefault 메소드를 사용해 코드를 간소화했습니다.
* HashMap의 ketSet 메소드를 사용해 코드를 더 깔끔하고 가독성있게 수정했습니다.
