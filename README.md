# 📝 익명 투표 애플리케이션

React와 Spring Boot를 기반으로 제작된 간단한 익명 투표 웹 애플리케이션입니다. 사용자는 투표를 생성하고, 다른 사람이 만든 투표에 참여하며, 결과를 실시간으로 확인할 수 있습니다.

<br/>

## ✨ 주요 기능

-   **🗳️ 투표 생성**: 누구나 새로운 투표 주제와 여러 선택지를 만들어 등록할 수 있습니다.
-   **✅ 투표 참여**: 진행 중인 투표 목록에서 원하는 항목을 선택하여 익명으로 투표할 수 있습니다.
-   **📊 실시간 결과 확인**: 투표가 진행되는 동안 각 선택지의 득표수와 비율을 실시간 그래프로 확인할 수 있습니다.
-   **🗑️ 투표 삭제**: 자신이 생성한 투표를 삭제할 수 있는 기능이 포함되어 있습니다.
-   **💅 깔끔한 UI**: Material UI를 활용하여 사용자 친화적이고 직관적인 인터페이스를 제공합니다.

<br/>

## 🛠 기술 스택

### Frontend

-   **Framework**: `React`, `Vite`
-   **Language**: `TypeScript`
-   **Styling**: `Material UI (MUI)`, `Emotion`
-   **State Management**: `React Hooks`
-   **HTTP Client**: `axios`

### Backend

-   **Framework**: `Spring Boot`
-   **Language**: `Java 17`
-   **Database**: `MySQL`
-   **Build Tool**: `Gradle`
-   **API**: `Spring Data JPA`, `Spring Web`

<br/>

## 📦 설치 및 실행

### 사전 요구사항

-   Node.js (v16 이상)
-   npm / yarn
-   Java 17
-   Gradle

### 1. Backend 실행

```bash
# 1. 백엔드 프로젝트 디렉토리로 이동합니다.
cd leeeeegun/250821_anonymous-vote-backend

# 2. Gradle을 사용하여 프로젝트를 실행합니다.
./gradlew bootRun
백엔드 서버는 http://localhost:8080 에서 실행됩니다.

```
2. Frontend 실행
```bash

# 1. 프론트엔드 프로젝트 디렉토리로 이동합니다.
cd leeeeegun/250820_anonymous-vote-frontend

# 2. 필요한 의존성을 설치합니다.
npm install

# 3. 개발 서버를 실행합니다.
npm run dev
프론트엔드 개발 서버는 http://localhost:5173 에서 실행되며, 백엔드 API 서버(:8080)로 프록시 요청을 보냅니다.

```
<br/>

📁 프로젝트 구조
```bash
Frontend (anonymous-vote-frontend)
src/
├── api/          # 백엔드 API 연동 함수
├── components/   # 공용 컴포넌트 (QuestionCard 등)
├── pages/        # 라우팅 페이지 (목록, 상세, 결과, 생성)
├── theme.ts      # Material UI 테마 설정
├── types/        # TypeScript 타입 정의
└── App.tsx       # 메인 애플리케이션 및 라우팅 설정
```
```bash
Backend (anonymous-vote-backend)
src/main/java/
└── com/codingrecipe/anonymousvotebackend/
    ├── controller/ # API 엔드포인트를 처리하는 컨트롤러
    ├── entity/     # JPA 엔티티 (Question, Option, Vote)
    ├── repository/ # 데이터베이스와 상호작용하는 리포지토리
    └── service/    # 비즈니스 로직을 처리하는 서비스
