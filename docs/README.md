# 요구사항
사다리 타기 미션 저장소
- 사다리 게임에 참여하는 사람의 이름을 최대 5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - `|-----|-----|` 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### 추가된 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 컬렉션을 사용한다.
- Java Enum을 적용한다.
- 모든 원시 값과 문자열을 포장한다
- 줄여 쓰지 않는다(축약 금지).
- 일급 컬렉션을 쓴다.

## 기능 구현 목록

### Model
- [ ] 사다리(`|-----|`)
  - [ ] 막대기 세로라인
  - [ ] 막대기 가로라인
- [ ] 사다리 maker
  - [ ] 가로라인이 이웃 겹치지 않도록 랜덤하게 생성
  - [ ] 사다리 높이 예외처리(0을 제외한 숫자만 가능)
- [ ] 사람
  - [ ] 입력조건 예외처리

### View
#### 입력 조건
- [ ] 사람 이름 입력하기
  - [ ] 최대 5글자 (사람 이름이 5글자 이하라면 공백문자로 채워줘야 함)
  - [ ] 쉼표 기준
  - [ ] 첫 번째 사람인 경우에, 이름이 5글자 이하여도 여백을 공백문자로 채우지 않음
- [ ] 사다리 높이 입력받기

#### 출력 조건
- [ ] 이름이 5글자일 경우, 이름의 끝 글자를 기준으로 입력 받은 높이만큼 사다리의 세로 라인 출력
- [ ] 이름이 5글자 이하인 경우, 이름의 끝 글자 + 공백문자를 기준으로 입력 받은 높이만큼 사다리의 세로 라인 출력
- [ ] 사다리가 정상적으로 작동하려면 가로 라인이 겹치지 않게 하기(ex.`|-----|-----|`)

### Controller
- [ ] 사다리 타리 진행 