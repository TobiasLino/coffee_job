# coffee_job
Construir um sistema de registro de chamados

## Beck

serviços microscópicos

- tipo de task
    - titulo
    - descricao
    - autor
    - tec responsavel
    - status (tipo de status enum)
    - data de abertura
    - tipo de task
        - alteração de dados
        - correção de bug
        - restrição de acesso
- tipo de usuário
    - id
    - nome
    - email
    - passwd
    - tipo de user
        - viewer
        - dev
- log - Audited
- banco de dados - SQL

## Fronte - Vue

- Home
- Listar tasks
    - aberta
    - em andamento
    - pendente
- Criar task