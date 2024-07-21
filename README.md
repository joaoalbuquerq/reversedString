# 🔄 ReversedString
## 📝 Descrição do Projeto
Este projeto oferece várias soluções para o problema de reverter uma string fornecida. As funções reverseString, reverseStringLoop e reverseStringSwap abordam esse problema utilizando diferentes abordagens para alcançar o mesmo objetivo: retornar a string original em ordem inversa.

## 🚀 Solução
### 🔍 Contexto
O problema central é reverter a ordem dos caracteres em uma string dada. Esta operação é útil em várias aplicações, como processamento de texto, criptografia e manipulação de dados.

### 🧩 Abordagens
#### 1. Utilizando StringBuffer (reverseString)
A abordagem mais direta utiliza a classe StringBuffer que fornece um método embutido reverse() para reverter a string.

```java
public static String reverseString(String mensagem) {
    var stringBuffer = new StringBuffer(mensagem);
    return stringBuffer.reverse().toString();
}
```

#### 2. Utilizando Loop (reverseStringLoop)
Esta abordagem utiliza um StringBuilder para construir a string revertida iterando sobre a string original do final para o início.

```java
public static String reverseStringLoop(String mensagem) {
    StringBuilder reversed = new StringBuilder();
    
    for(int i = mensagem.length() - 1 ; i >= 0; i--) {
        reversed.append(mensagem.charAt(i));
    }
    
    return reversed.toString();
}
```
#### 3. Utilizando Troca de Caracteres (reverseStringSwap)
Nesta abordagem, os caracteres da string são trocados de posição, movendo-se do início para o fim e vice-versa até o meio da string.

```java
public static String reverseStringSwap(String mensagem) {
    var reversed = mensagem.toCharArray();
    var lastIndex = mensagem.length() - 1;
    
    for(int i = 0; i < mensagem.length() / 2; i++) {
        reversed[i] = mensagem.charAt(lastIndex - i);
        reversed[lastIndex - i] = mensagem.charAt(i);
    }
    
    return String.valueOf(reversed);
}
```
## ⚙️ Complexidade
Utilizando StringBuffer: A complexidade é O(n), onde n é o comprimento da string, devido ao uso do método reverse() que percorre a string uma vez.
Utilizando Loop: A complexidade é O(n), pois a string é percorrida uma vez de trás para frente.
Utilizando Troca de Caracteres: A complexidade é O(n), uma vez que cada caractere é movido no máximo uma vez.
## 📈 Exemplos de Uso
Entrada: "hello"

Saída: "olleh"
Entrada: "world"

Saída: "dlrow"
## 🛠️ Tecnologias Utilizadas
Java: A linguagem de programação utilizada para implementar as soluções.
Estruturas de Dados: StringBuffer, StringBuilder e arrays para manipulação de strings.
## 📦 Como Usar
Clone o Repositório:

 ```bash
git clone https://github.com/seuusuario/reversedString.git
 ```
Compile e Execute:

Navegue até o diretório do projeto e compile o código-fonte Java.
Execute o programa, passando a string de entrada desejada.
## 🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests no repositório.

## 📧 Contato
Para mais informações, entre em contato através do joaopealbuquerque1@gmail.com.
