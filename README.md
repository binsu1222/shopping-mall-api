# 🛒 Shopping API

상품의 이름(name), 가격(price), 설명(description)을 MariaDB에 등록하고  
상품 ID에 따라 개별 상품을 조회하거나 전체 상품을 조회할 수 있는 간단한 쇼핑 API 프로젝트입니다.

---

## 📋 기능

- 상품 등록 (Create)
- 상품 조회 (Read)
  - 개별 상품 조회 (by ID)
  - 전체 상품 목록 조회

---

## 🚀 기술 스택

- Java 17
- Spring Boot
- Spring Data JPA
- MariaDB

---

## 🗄️ DB 모델

| 컬럼명       | 타입          | 설명            |
|--------------|---------------|-----------------|
| `id`         | BIGINT (PK)   | 상품 ID (자동 생성) |
| `name`       | VARCHAR       | 상품 이름       |
| `price`      | INT           | 상품 가격       |
| `description`| TEXT          | 상품 설명       |
