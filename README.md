# Conversor de Moedas

Uma aplicação construida utilizando a api ExchangeRate para buscar os preços das moedas em tempo real.


## Funcionalidades

- Interação com usuário
- Menu explicativo
- Buscar de dados na API
- Tratamento de exceções


## Stack utilizada

- Java 17


## Documentação da API Utilizada

#### Retorna todos os itens

```http
  GET https://v6.exchangerate-api.com/v6/SUA-API-KEY/latest/USD
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**: API KEY |

#### Isso retornará as taxas de câmbio do seu código base para todas as outras moedas que a API suporta:

```http
  GET /api/latest/${currency}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `currency`      | `string` | **Obrigatório**. O nome da moeda para ter como base |


![ONE Badge](https://res.cloudinary.com/dduiscoif/image/upload/v1714764727/ONE/Badge-Conversor_xjcowe.png)