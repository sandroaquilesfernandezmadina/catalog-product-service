# =========================
# ETAPA 1 - BUILD
# =========================
#imagen base
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /workspace

COPY . .

RUN mvn clean package -DskipTests
# =========================
# ETAPA 2 - RUNTIME
# =========================

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# 🔥 AGREGA ESTO
RUN apk add --no-cache curl

COPY --from=builder /workspace/target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","app.jar"]