### Visão relacional para o banco de dados
1. Para a disciplina criar o banco com o uso de Postgress, no pgadm4
2. Para a disciplina criar um usuário responsavel com login: "aluno" e senha: "ufc123"
3. Falta corrigir um erro de dependencia que mostro falta um id proprio
4. Da entidade Card, card_images e card_sets ainda não foram subdivididos


| Usuario |      |       |       |               |       |          |
|---      |---   |---    |---    |---            |---    |---       |
| id (PK) | nome | login | senha | administrador | email | endereco |

| Venda |         |               |
|---    |---      |---            |
|id(PK) |data_hora|usuario_id (FK)|

| Card |    |    |                     |         |    |    |              |
|---   |--- |--- |---                  |---      |--- |--- |---           |
|id(PK)|nome|type|humanReadableCardType|frameType|desc|race|ygoprodeck_url|

| Cardset |        |        |            |         |
|---      |---     |---     |---         |---      |
|id(PK)   |set_name|set_code|num_of_cards|set_image|

| Monstro       |   |   |         |         |
|---            |---|---|---      |---      |
|card_id(PK)(FK)|atk|def|level    |attribute|

| venda_card |