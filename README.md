# java-racingcar-precourse

## 자동차 경주

우아한테크코스 7기 프리코스 2주차 미션 저장소

- [yesjuhee 브랜치](https://github.com/yesjuhee/java-racingcar-7/tree/yesjuhee): 미션 수행 코드
- [main 브랜치](https://github.com/yesjuhee/java-racingcar-7/tree/main): 미션 종료 후 리팩토링을 진행한 코드
- [PR 제출 주소](https://github.com/woowacourse-precourse/java-racingcar-7/pull/240)

### 기능 목록

1. 경주 게임에 참가할 자동차의 이름을 입력할 수 있다.
    - 자동차의 이름은 쉼표를 기준으로 구분한다.
    - 이름은 5자 이하만 가능하다.
2. 자동차가 이동할 횟수를 입력할 수 있다.
3. 각 자동차는 한 번의 이동에 전진 또는 멈출 수 있다.
    - 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
4. 차수별 실행 결과를 출력할 수 있다.
    - 실행 결과는 이름과 함께 출력한다.
    - 전진한 결과는 '-'로 표시한다.
5. 자동차 경주 게임을 완료한 후 누가 우승했는지 출력할 수 있다.
    - 우승자는 한 명 이상일 수 있다.
    - 우승자가 여러명일 경우 쉼표를 이용하여 구분한다.
6. 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리이션을 종료할 수 있다.
    - 입력한 이름의 길이가 0이거나 6이상인 경우
    - 양수가 아닌 이동 횟수를 입력한 경우
    - 이름에 공백문자를 포함한 경우