import java.util.Date;

// Classe Loja
class Loja {
    private String id;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String endereco;
    private String telefone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String cadastrarCliente() {
        // Implementação do método
        return "Cliente cadastrado com sucesso!";
    }

    public String realizarInventario() {
        // Implementação do método
        return "Inventário realizado com sucesso!";
    }
}

// Classe Produto
class Produto {
    private String id;
    private double preco;
    private int estoque;
    private int tamanho;
    private String modelo;
    private int quantidade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int evidenciarTamanho() {
        // Implementação do método
        return tamanho;
    }

    public double atualizarPreco() {
        // Implementação do método
        return preco;
    }

    public int atualizarQtd() {
        // Implementação do método
        return quantidade;
    }
}

// Classe Funcionario
class Funcionario {
    private String id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String telefone;
    private String endereco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String fazerLogin() {
        // Implementação do método
        return "Login realizado com sucesso!";
    }

    public String fazerLogoff() {
        // Implementação do método
        return "Logoff realizado com sucesso!";
    }
}

// Classe Cliente
class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private double formaPagto;
    private int numeroPecas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(double formaPagto) {
        this.formaPagto = formaPagto;
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }

    public void setNumeroPecas(int numeroPecas) {
        this.numeroPecas = numeroPecas;
    }

    public Produto[] escolherProd() {
        // Implementação do método
        return new Produto[0];
    }

    public void removerProd() {
        // Implementação do método
    }
}

// Classe Pedido
class Pedido {
    private String id;
    private Cliente cliente;
    private double preco;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Produto[] escolherProd() {
        // Implementação do método
        return new Produto[0];
    }

    public void removerProd() {
        // Implementação do método
    }
}
