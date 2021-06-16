# Exceções
- Para as exceções utilizamos o `try` e o `catch`, isso impede que o código pare de rodar por conta de um erro de compilação; 
```java
  try {
	            	int a = i/0;
	            }
	            catch (Exception e) {
	            	System.out.println(e);
	            }
        }
```

- `finally` é utlizidado quando é necessário por exemplo fechar uma conexão com o banco de dados independente e eu certo ou não a exceção