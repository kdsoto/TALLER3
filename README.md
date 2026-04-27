# 📘 Documentación de Scopes en CDI

## 🔹 ApplicationScoped

Se utiliza para servicios globales que deben vivir durante toda la aplicación.

**Ejemplos:**

* AuthService
* EmailService
* ConfigService
* CacheService
* LogService
* ReportService
* DatabaseService

---

## 🔹 RequestScoped

Se usa para procesos que viven durante una petición HTTP.

**Ejemplos:**

* UserController
* LoginController
* CartController
* FormHandler
* ValidatorRequest
* APIResponseHandler
* SessionHandler

---

## 🔹 Dependent

Se usa para objetos pequeños que se crean bajo demanda.

**Ejemplos:**

* EmailValidator
* DateFormatter
* TokenGenerator
* StringUtil
* DataConverter
* CalculatorHelper
* FilterUtil

---

## 📌 Autor

Nombre: Dylan Soto
Materia: Programacion Avanzada 2
