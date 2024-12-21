# gerenciadorUsuarios

# Passo a Passo
- Verifique se possui um banco de dados de no postgree com nome 'postgres'
- Atualize o "apllication.properties" com as credências do seu banco (user e password)

# Para acessar a API
 - Consultar os usuários cadastrados: acesse a rota "http://localhost:8080/api/users" pelo metodo GET para pegar todos os registros
 - Cadastrar o usuário: acesse a rota "http://localhost:8080/api/users" pelo metodo POST em formato JSON com o seguinte escopo:
{
	"nome":"Juvenal 4",
	"time": "desenvolvimento"
}
