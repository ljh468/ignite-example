#  Apache Ignite 클러스터 구축 및 분산 기능 테스트

## 📌 개요
이 레포지토리는 Apache Ignite를 활용하여 클러스터 환경을 구축하고,
다양한 **분산 기능(메시징, 분산 락 등)**을 테스트하는 예제 코드를 포함합니다.

## 🛠️ 주요 기능
- ✔ Ignite 클러스터 구축 – 멀티 노드 환경에서 Ignite 설정 및 실행
- ✔ Ignite Messaging 테스트 – Ignite의 Pub/Sub 기반 메시징 시스템을 활용한 노드 간 통신
- ✔ Ignite Distributed Lock 테스트 – 여러 노드에서 분산 락을 활용하여 동시성 제어
- ✔ Ignite Cache 테스트 – 인메모리 캐시 활용
- ✔ Spring Boot & Ignite 연동 – Spring 환경에서 Ignite 설정 및 활용

## 🏗️ 환경 구성
#### 🔹 1. 요구 사항
- Java 17+
- Spring Boot 3.x
- Apache Ignite 2.x
- Docker (선택 사항)

#### 🔹 2. 클러스터 실행
- 로컬 환경에서 서버 실행 (예: server-1, server-2)

## 🔥 기능별 테스트
#### 🔹 1. Ignite Cluster 구성
#### 🔹 2. Ignite Messaging (노드 간 메시지 전송)
#### 🔹 3. Ignite Distributed Lock (분산 락 테스트)
#### 🔹 4. Ignite Cache (캐시 활용)

## 📜 참고
- Apache Ignite 공식 문서
- Spring Boot & Ignite 연동