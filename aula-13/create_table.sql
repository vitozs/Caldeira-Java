create table Clientes(
    id_cliente serial primary key,
    nome varchar(50) not null,
    email varchar(100) not null,
    telefone varchar(11) not null
);
create table Produtos(
    id_produto serial primary key,
    nome varchar(50) not null,
    preco real not null,
    categoria varchar(50) not null
);
create table Pedidos(
    id_pedido serial primary key,
    id_cliente int not null,
    data_pedido date not null,
    total real not null,
    foreign key (id_cliente) references Clientes(id_cliente)
);
create table DetalhesDoPedido(
    id_detalhe serial primary key,
    id_pedido int not null,
    id_produto int not null,
    quantidade real not null,
    foreign key (id_pedido) references Pedidos(id_pedido),
    foreign key (id_produto) references Produtos(id_produto)
);
create table Funcionarios(
id_funcionario serial primary key,
nome varchar(50) not null,
cargo varchar(30) not null,
data_de_contratacao date not null	
);
 
