# CH2 계산기 과제

## 1. 계산기 LV1.
### 🔎기능
#### 클래스 없이 기본적인 연산을 수행할 수 있는 계산기
- 0을 포함한 양의 정수 2개 입력
- 사칙연산 기호(+,-,*,/) 입력
- 연산 오류 발생 시 해당 오류 정제하여 출력(나눗셈 연산에서 분모가 0이 되는 것 방지)
- "exit" 문자열 입력 전 까지 무한으로 계산 진행 가능

### ✔️기능 설명

- 0을 포함한 양의 정수 2개와 사칙연산 기호를 입력받아 변수에 저장하고 계산 결과를 출력하는 계산기 구현
  
![image](https://github.com/user-attachments/assets/54dfb267-508e-445b-8f16-60d4f0f3742b)

- while 문을 통한 무한 루프로 사용자가 "exit" 문자열 입력 전 까지 무한으로 계산 반복
  
![image](https://github.com/user-attachments/assets/4a991144-7856-40e5-b3cf-b2276624b855)

- 나눗셈 연산에서 분모가 0이 되는 것을 방지하기 위해 while 문 처리하여 두 번째 숫자가 0이면 반복적으로 다시 입력 받음

![image](https://github.com/user-attachments/assets/9a4368f6-b4c7-4922-a8cc-767a55fe728f)




## 2. 계산기 LV2.
### 🔎기능
#### 클래스를 적용해 기본적인 연산 수행하는 계산기 
- 실수까지 받을 수 있는 기능
- 연산 수행 역할 담당하는 Calculator 클래스
- App main 메서드에 Calculator 클래스 활용
- 연산 결과 데이터 저장하는 기능
- Calculator 클래스에 저장된 연산 결과 중 가장 먼저 저장된 데이터 삭제할 수 있고 App 클래스의 main 메서드에서 삭제 메서드 활용

### ✔️기능 설명
- 정수를 double로 변환하여 소수점까지 받을 수 있는 기능 추가

![image](https://github.com/user-attachments/assets/8de423e0-b1cd-4b97-9f03-33af6a33fd46)

- 결과 값을 반환하는 메서드와 결과를 저장하는 컬렉션 타입 필드를 생성하여 저장된 연산 결과 값들이 출력되는 기능 추가

![image](https://github.com/user-attachments/assets/8373d19c-3fbd-4a2b-8903-d8165b3ced76)

- removeResult()를 이용해 가장 먼저 저장된 데이터를 삭제하는 메서드를 작성하였고 if 문을 사용하여 사용자의 삭제 여부를 결정
  
![image](https://github.com/user-attachments/assets/aadd53e3-7eb9-45e4-8860-7fc933f5acd5)






