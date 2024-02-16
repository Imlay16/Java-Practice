
# 괄호 짝 맞추기 알고리즘

## 구현 원리

1. 스택을 이용해서, '(' 괄호면 push, ')' 괄호면 pop을 한다.
2. ')' 괄호일 경우, pop하기 전에, stack이 비어있으면 false를 리턴한다.
3. 마지막으로 모든 괄호들의 push & pop이 끝난 후에, stack이 비어있으면 return true, 그렇지 않으면 return false를 한다.
