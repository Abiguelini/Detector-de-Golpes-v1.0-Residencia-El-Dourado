# 🛡️ Detector de Golpes v1.0 (Java)

Projeto desenvolvido em Java para o curso **Fullstack 5.0** com o objetivo de analisar mensagens de texto e detectar possíveis tentativas de golpe/phishing utilizando regras de negócio e identificação de palavras-chave suspeitas.

---

## 👥 Integrantes & Responsabilidades

- **Rodrigo:** Mapeamento da lógica, cenários de teste e implementação da classe `Main`.
- **Álvaro:** Arquitetura do projeto, fluxo Git/Code Review e classe `ResultadoAnalise`.
- **Giu:** Regras de negócio e implementação da classe `AnalisadorDeGolpe`.

---

## 🏗️ Estrutura do Projeto

- **`AnalisadorDeGolpe.java`**: Regra de negócio, dicionários de palavras suspeitas (urgência e ação financeira) e pontuação de risco.
- **`ResultadoAnalise.java`**: Modelo/DTO que encapsula o resultado (`isGolpe`) e a justificativa da análise.
- **`Main.java`**: Testes automatizados (cenário seguro, phishing) e entrada interativa via teclado (`Scanner`).

---

## 💡 Principais Decisões Tecnológicas

1. **Tratamento de Caixa (`toLowerCase()`):** Garante a identificação de palavras independentemente de variações como `PIX`, `Pix` ou `pix`.
2. **Dicionários Separados:** Divisão entre palavras de *urgência* e *ação financeira* para gerar diagnósticos mais precisos.
3. **Encapsulamento:** Separação entre execução (`Main`), regras de domínio (`AnalisadorDeGolpe`) e transferência de dados (`ResultadoAnalise`).

---

## 🚀 Como Executar

```bash
# Compilar o projeto
javac Main.java AnalisadorDeGolpe.java ResultadoAnalise.java

# Executar a aplicação
java Main
